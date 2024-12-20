get404 = (req, res, next) => {
  res.status(404).render("404.ejs", { isAuthenticated: req.isLoggedIn });
};

module.exports = { get404 };