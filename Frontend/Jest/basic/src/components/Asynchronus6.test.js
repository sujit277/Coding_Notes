import { fetchWithError } from './Asynchronus6';

describe('fetchWithError', () => {
  // Using `return` to handle the rejected promise
  test('throws an error using return', () => {
    return fetchWithError().catch((e) => {
      expect(e).toBe('error');
    });
  });

  // Using `async/await` with try/catch
  test('throws an error using async/await', async () => {
    try {
      await fetchWithError();
    } catch (e) {
      expect(e).toBe('error');
    }
  });

  // Using `rejects` to automatically handle the rejected promise
  test('throws an error using rejects', () => {
    return expect(fetchWithError()).rejects.toBe('error');
  });
});
