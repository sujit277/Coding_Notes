import React from "react";
import { render } from "@testing-library/react";
import { screen } from "@testing-library/react";
import MainPage from "./MainPage";

jest.mock("./AdminPage", () => () => {
  return <div>Admin Page Add Banner</div>;
});

describe("Main Page", () => {

  it("Main Page renders correctly", () => {
    render(<MainPage></MainPage>);
    expect(screen.getByText("Main Page")).toBeInTheDocument();
    expect(screen.getByText("Admin Page Add Banner")).toBeInTheDocument();
  });
});
