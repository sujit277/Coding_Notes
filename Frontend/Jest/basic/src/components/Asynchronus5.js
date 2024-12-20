// Testing Asynchronous Code with Callbacks

export const getData = (callback) => {
  setTimeout(() => {
    callback("data");
  }, 1000);
};
