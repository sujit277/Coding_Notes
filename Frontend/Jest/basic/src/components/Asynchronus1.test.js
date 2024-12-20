import { fetchUser } from "./Asynchronus1";

describe("fetchUser", () => {
  beforeEach(() => {
    // Reset fetch before each test
    global.fetch = jest.fn();
  });

  test("should return user data when API call is successful", async () => {
    // Mock the fetch function to resolve with a successful response
    global.fetch.mockResolvedValueOnce({
      ok: true,
      json: async () => ({ id: 1, name: "John Doe" }),
    });

    const user = await fetchUser(1);
    expect(user).toEqual({ id: 1, name: "John Doe" });
    expect(fetch).toHaveBeenCalledTimes(1);
    expect(fetch).toHaveBeenCalledWith(
      "https://jsonplaceholder.typicode.com/users/1"
    );
  });

  test("should throw an error when API call fails", async () => {
    // Mock the fetch function to resolve with a failed response
    global.fetch.mockResolvedValueOnce({
      ok: false,
    });

    await expect(fetchUser(1)).rejects.toThrow("Network response was not ok");
  });
});
