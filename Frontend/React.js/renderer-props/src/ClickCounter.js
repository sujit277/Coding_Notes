import React from "react";

const ClickCounter = (props) => {
  const { count, incrementCount } = props;

  return (
    <>
      <button onClick={incrementCount}>Clicked {count}</button>
    </>
  );
};

export default ClickCounter;
