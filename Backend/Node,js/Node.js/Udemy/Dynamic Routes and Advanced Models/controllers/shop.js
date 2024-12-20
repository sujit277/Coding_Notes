const Product = require("../models/product");
const Cart = require("../models/cart");

getProducts = (req, res, next) => {
  Product.fetchAll((products) => {
    res.render("shop/product-list.ejs", {
      products: products,
      hasProducts: products.length > 0,
    });
  });
};

getProduct = (req, res, next) => {
  const prodId = req.params.productId;
  Product.findById(prodId, (product) => {
    res.render("shop/product-detail", {
      product: product,
    });
  });
};

getCart = (req, res, next) => {
  Cart.getProducts((cart) => {
    Product.fetchAll((products) => {
      const cartProducts = [];
      for (product of products) {
        const cartProductData = cart.products.find(
          (prod) => prod.id == product.id
        );
        if (cartProductData) {
          cartProducts.push({ productData: product, qty: cartProductData.qty });
        }
      }
      res.render("shop/cart.ejs", { products: cartProducts });
    });
  });
};

postCart = (req, res, next) => {
  const prodId = req.body.productId;
  Product.findById(prodId, (product) => {
    Cart.addProduct(prodId, product.price);
  });
  res.redirect("/");
};

postCartDeleteProduct = (req, res, next) => {
  const prodId = req.body.productId;
  Product.findById(prodId, (product) => {
    Cart.deleteProduct(prodId, product.price);
    res.redirect("/cart");
  });
};

module.exports = {
  getProducts,
  getCart,
  getProduct,
  postCart,
  postCartDeleteProduct,
};
