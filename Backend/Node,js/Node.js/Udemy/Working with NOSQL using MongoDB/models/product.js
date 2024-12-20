const { ObjectId } = require("mongodb");
const getDb = require("../utils/database").getDb;

class Product {
  constructor(id, name, price, description, imageUrl, userId) {
    this._id = id ? new ObjectId(`${id}`) : null;
    this.name = name;
    this.price = price;
    this.description = description;
    this.imageUrl = imageUrl;
    this.userId = userId;
  }

  save() {
    const db = getDb();
    let dbop;
    if (this._id) {
      dbop = db
        .collection("products")
        .updateOne({ _id: this._id }, { $set: this });
    } else {
      dbop = db.collection("products").insertOne(this);
    }
    return dbop
      .then(() => console.log("Product Inserted/Updated"))
      .catch((err) => console.log(err));
  }

  static fetchAll() {
    const db = getDb();
    return db
      .collection("products")
      .find()
      .toArray()
      .then((products) => products)
      .catch((err) => console.log(err));
  }

  static findById(prodId) {
    const db = getDb();
    return db
      .collection("products")
      .find({ _id: new ObjectId(`${prodId}`) })
      .next()
      .then((product) => product)
      .catch((err) => console.log(err));
  }

  static deleteById(prodId) {
    const db = getDb();
    return db
      .collection("products")
      .deleteOne({ _id: new ObjectId(`${prodId}`) })
      .then(() => console.log("Product Deleted"))
      .catch((err) => console.log(err));
  }
}

module.exports = Product;
