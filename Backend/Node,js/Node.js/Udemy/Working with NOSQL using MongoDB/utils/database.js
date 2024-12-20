const mongodb = require("mongodb");
const MongoClient = mongodb.MongoClient;

let _db;
const mongoConnect = (callback) => {
  MongoClient.connect(
    //"mongodb+srv://Sujit7941:4dzD2ajuHQRwzmbG@project1.pxssjjx.mongodb.net/ecommerce?retryWrites=true&w=majority"
    "mongodb+srv://Sujit_7941:Sujit_7941@project1.pxssjjx.mongodb.net/ecommerce?retryWrites=true&w=majority"
  )
    .then((client) => {
      console.log("Database Connected Successfully");
      _db = client.db();
      callback();
    })
    .catch((err) => console.log(err));
};

const getDb = () => {
  if (_db) return _db;
  throw "No Database Found";
};

module.exports = { mongoConnect, getDb };
