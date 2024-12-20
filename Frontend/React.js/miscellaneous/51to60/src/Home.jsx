import React from "react";
import { useNavigate } from "react-router-dom";

const Home = () => {
  const navigate = useNavigate();
  return (
    <>
      <div style={{ textAlign: "center" }}>
        <h1>Home Component</h1>
        <button
          type="button"
          onClick={() => {
            navigate("/about");
          }}
        >
          Go to About Page
        </button>
        <br></br>
        <button
          type="button"
          onClick={() => {
            navigate("/contact");
          }}
        >
          Go to Contact Page
        </button>
      </div>
    </>
  );
};

export default Home;
