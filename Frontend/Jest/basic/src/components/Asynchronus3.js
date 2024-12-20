// Testing Asynchronous Functions Returning Promises

export const fetchData = () => {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve("data");
    }, 1000);
  });
};
