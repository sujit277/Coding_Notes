import React from "react";

const HoverCounter = (props) => {
  const { count, incrementCount } = props;

  return (
    <>
      <button onMouseOver={incrementCount}>Clicked {count}</button>
    </>
  );
};

export default HoverCounter;
