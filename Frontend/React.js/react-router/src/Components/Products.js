import { Link, Outlet } from "react-router-dom";

const Products = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <input type="search" placeholder="Search Products"></input>
      <nav>
        <Link to="featured">Featured</Link>
        <Link to="new">New</Link>
      </nav>
      <Outlet />
    </div>
  );
};

export default Products;
