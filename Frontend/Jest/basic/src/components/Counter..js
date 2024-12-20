import React, { useState } from "react";

const Counter = () => {
  const [count, setCount] = useState(0);
  return (
    <>
      <div style={{ textAlign: "center" }}>
        <h1>{count}</h1>
        <button
          type="button"
          onClick={() => {
            setCount(count + 1);
          }}
        >
          Increment
        </button>
      </div>
    </>
  );
};

export default Counter;
