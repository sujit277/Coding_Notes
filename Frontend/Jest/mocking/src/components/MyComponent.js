import React from 'react';
import { add, subtract, multiply } from "./Utils";

const MyComponent = () => {
  const sum = add(1, 2);
  const difference = subtract(5, 3);
  const product = multiply(4, 2);

  return (
    <div>
      <p>Sum: {sum}</p>
      <p>Difference: {difference}</p>
      <p>Product: {product}</p>
    </div>
  );
};

export default MyComponent;
