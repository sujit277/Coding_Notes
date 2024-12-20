import { fetchData } from "./Asynchronus3";

describe("fetchData", () => {
  // Using `return` to wait for the promise to resolve
  test("returns data using return", () => {
    return fetchData().then((data) => {
      expect(data).toBe("data");
    });
  });

  // Using `async/await` to handle the promise
  test("returns data using async/await", async () => {
    const data = await fetchData();
    expect(data).toBe("data");
  });

  // Using `resolves` to automatically handle the promise
  test("returns data using resolves", () => {
    return expect(fetchData()).resolves.toBe("data");
  });
});
