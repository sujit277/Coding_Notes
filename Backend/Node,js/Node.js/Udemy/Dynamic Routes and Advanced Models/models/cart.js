const fs = require("fs");
const path = require("path");
const filePath = path.join(__dirname, "../", "data", "cart.json");

class Cart {
  static addProduct(id, productprice) {
    //Fetch the Previous Cart Items
    fs.readFile(filePath, (err, data) => {
      let cart = { products: [], totalPrice: 0 };
      if (!err) {
        cart = JSON.parse(data);
        if (!cart) {
          return;
        }
      }

      //Analyze the Cart and check for Existance of Product
      const existingProductIndex = cart.products.findIndex(
        (prodt) => prodt.id == id
      );
      const existingProduct = cart.products[existingProductIndex];

      let addedProduct;
      //Add New Product and Increase Qauntity
      if (existingProduct) {
        addedProduct = { ...existingProduct };
        addedProduct.qty = addedProduct.qty + 1;
        cart.products = [...cart.products];
        cart.products[existingProductIndex] = addedProduct;
      } else {
        addedProduct = { id: id, qty: 1 };
        cart.products = [...cart.products, addedProduct];
      }
      cart.totalPrice = cart.totalPrice + +productprice;
      fs.writeFile(filePath, JSON.stringify(cart), (err) => {
        console.log('Product added to the cart')
      });
    });
  }

  static deleteProduct(id, productPrice) {
    const filepath = path.join(__dirname, "../", "data", "cart.json");
    fs.readFile(filepath, (err, data) => {
      if (!err) {
        const parsedCartData = JSON.parse(data);
        const updatedCart = { ...parsedCartData };
        const product = updatedCart.products.find((prod) => prod.id == id);

        //Checking requested Product is available in Cart or not
        if (product) {
          const productQty = product.qty;
          updatedCart.products = updatedCart.products.filter((prod) => {
            return prod.id != id;
          });
          updatedCart.totalPrice =
            updatedCart.totalPrice - productPrice * productQty;
          fs.writeFile(filepath, JSON.stringify(updatedCart), (err) => {
            console.log("Product deleted from the cart");
          });
        } else {
          return;
        }
      } else {
        return;
      }
    });
  }

  static getProducts(callback) {
    const filepath = path.join(__dirname, "../", "data", "cart.json");
    fs.readFile(filepath, (err, data) => {
      const cart = JSON.parse(data);
      if (!err) {
        callback(cart);
      } else {
        callback({});
      }
    });
  }
}

module.exports = Cart;
