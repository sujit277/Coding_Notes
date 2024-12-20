const axios = require("axios");

export const fetchUser = async (userId) => {
  const response = await axios.get(
    `https://jsonplaceholder.typicode.com/users/${userId}`
  );
  return response.data;
};
