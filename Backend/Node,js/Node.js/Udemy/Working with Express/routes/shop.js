const express = require("express");
const path = require("path");
const router = express.Router();

router.get("/shop", (req, res) => {
  res.sendFile(path.join(__dirname, "../", "views", "shop.html"));
});

module.exports = router;
