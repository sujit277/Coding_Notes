import { getUser } from "./Asynchronus4";

// Mock the fetch function
global.fetch = jest.fn(() =>
  Promise.resolve({
    json: () => Promise.resolve({ name: "John Doe" }),
  })
);

describe("getUser", () => {
  test("returns the user name", async () => {
    fetch.mockImplementation(() =>
      Promise.resolve({
        json: () => Promise.resolve({ name: "John Doe" }),
      })
    );
    const name = await getUser();
    expect(name).toBe("John Doe");
  });
});
