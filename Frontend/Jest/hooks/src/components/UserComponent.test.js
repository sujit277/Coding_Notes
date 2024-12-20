import React from "react";
import { render, screen, waitFor } from "@testing-library/react";
import UserComponent from "./UserComponent";

// Mock the fetch function
global.fetch = jest.fn().mockImplementation(() => {
  return Promise.resolve({
    json: () => Promise.resolve({ name: "John Doe" }),
  });
});

describe("UserComponent", () => {
  beforeEach(() => {
    fetch.mockClear();
  });

  test("should display loading initially", () => {
    fetch.mockImplementation(() =>
      Promise.resolve({
        json: () => Promise.resolve({ name: "John Doe" }),
      })
    );
    render(<UserComponent userId={1} />);
    expect(screen.getByText(/Loading.../)).toBeInTheDocument();
  });

  test("should display user name after fetching data", async () => {
    fetch.mockImplementation(() =>
      Promise.resolve({
        json: () => Promise.resolve({ name: "John Doe" }),
      })
    );
    render(<UserComponent userId={1} />);

    await waitFor(() =>
      expect(screen.getByText(/User:/)).toHaveTextContent("User: John Doe")
    );
    expect(fetch).toHaveBeenCalledTimes(1);
    expect(fetch).toHaveBeenCalledWith(
      "https://jsonplaceholder.typicode.com/users/1"
    );
  });
});
