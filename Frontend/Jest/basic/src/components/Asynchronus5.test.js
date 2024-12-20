import { getData } from "./Asynchronus5";

describe("getData", () => {
  test("calls the callback with data", (done) => {
    function callback(data) {
      expect(data).toBe("data");
      done(); // Notify Jest that the test is complete
    }

    getData(callback);
  });
});
