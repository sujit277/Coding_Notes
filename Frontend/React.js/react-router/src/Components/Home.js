import { useNavigate } from "react-router-dom";

const Home = () => {
  const navigate = useNavigate();

  return (
    <div style={{ textAlign: "center" }}>
      <h1>Home Page</h1>
      <button onClick={() => navigate("order-summary")}>Place Order</button>
    </div>
  );
};

export default Home;
