const Product = require("../models/product");
const Cart = require("../models/cart");

getProducts = (req, res, next) => {
  Product.findAll()
    .then((products) => {
      res.render("shop/product-list.ejs", {
        products: products,
        hasProducts: products.length > 0,
      });
    })
    .catch((err) => console.log(err));
};

getProduct = (req, res, next) => {
  const prodId = req.params.productId;
  Product.findByPk(prodId)
    .then((product) => {
      res.render("shop/product-detail", {
        product: product,
      });
    })
    .catch((err) => console.log(err));
};

getCart = (req, res, next) => {
  // Getting user's cart products
  req.user
    .getCart()
    .then((cart) => {
      return cart.getProducts();
    })
    .then((products) => {
      res.render("shop/cart.ejs", { products: products });
    })
    .catch((err) => console.log(err));
};

postCart = (req, res, next) => {
  const prodId = req.body.productId;
  let fetchedCart,
    newQauntity = 1;
  req.user
    .getCart()
    .then((cart) => {
      fetchedCart = cart;
      return cart.getProducts({ where: { id: prodId } });
    })
    .then((products) => {
      let product = products[0];
      if (product) {
        const oldQauntity = product.cartItem.qauntity;
        newQauntity = oldQauntity + 1;
        return product;
      }
      return Product.findByPk(prodId);
    })
    .then((product) => {
      return fetchedCart.addProduct(product, {
        through: { qauntity: newQauntity },
      });
    })
    .then(() => res.redirect("/"))
    .catch((err) => console.log(err));
};

postCartDeleteProduct = (req, res, next) => {
  const prodId = req.body.productId;
  req.user
    .getCart()
    .then((cart) => {
      return cart.getProducts({ where: { id: prodId } });
    })
    .then((products) => {
      const product = products[0];
      return product.cartItem.destroy();
    })
    .then(() => res.redirect("/"))
    .catch((err) => console.log(err));
};

getOrders = (req, res, next) => {
  req.user.getOrders({ include: ["products"] }).then((orders) => {
    res.render("shop/orders.ejs", { orders: orders });
  });
};

postOrder = (req, res, next) => {
  let productItems, fetchedCart;
  req.user
    .getCart()
    .then((cart) => {
      fetchedCart = cart;
      return cart.getProducts();
    })
    .then((products) => {
      productItems = products;
      return req.user.createOrder();
    })
    .then((order) => {
      return order.addProducts( productItems.map((product) => {
        console.log("Product ", product)
        product.orderItem = { qauntity: product.cartItem.qauntity };
        return product;
      }));
    })
    .then(() => {
      fetchedCart.setProducts(null);
      res.redirect("/orders");
    })
    .catch((err) => console.log(err));
};

module.exports = {
  getProducts,
  getCart,
  getOrders,
  getProduct,
  postCart,
  postCartDeleteProduct,
  postOrder,
};
