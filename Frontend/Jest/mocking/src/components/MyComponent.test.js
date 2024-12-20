import React from "react";
import { render } from "@testing-library/react";
import MyComponent from "./MyComponent";
import * as Utils from "./Utils";

// Mock the `add` function
jest.mock("./Utils", () => {
  const actualUtils = jest.requireActual("./Utils");
  return {
    ...actualUtils, // Retain the real implementations of `subtract` and `multiply`
    add: () => 100, // Mock `add` function to return 100,
    // add: jest.function(() => 100),
  };
});

describe("My Component", () => {
  test("should display correct results for mocked and actual functions", () => {
    const { getByText } = render(<MyComponent />);

    // Test the output
    expect(getByText("Sum: 100")).toBeInTheDocument(); // Mocked `add` function
    expect(getByText("Difference: 2")).toBeInTheDocument(); // Actual `subtract` function
    expect(getByText("Product: 8")).toBeInTheDocument(); // Actual `multiply` function
  });
});
