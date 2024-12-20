import * as axios from 'axios';
import { fetchUser } from './Asynhcronus2';

// Mock the axios module
jest.mock('axios');

describe('fetchUser', () => {
  test('should return user data when API call is successful', async () => {
    // Mock the axios.get method to resolve with a successful response
    axios.get.mockResolvedValueOnce({ data: { id: 1, name: 'John Doe' } });

    const user = await fetchUser(1);
    expect(user).toEqual({ id: 1, name: 'John Doe' });
    expect(axios.get).toHaveBeenCalledTimes(1);
    expect(axios.get).toHaveBeenCalledWith('https://jsonplaceholder.typicode.com/users/1');
  });

  test('should throw an error when API call fails', async () => {
    // Mock the axios.get method to reject with an error
    axios.get.mockRejectedValueOnce(new Error('Network Error'));

    await expect(fetchUser(1)).rejects.toThrow('Network Error');
  });
});
