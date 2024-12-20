// Testing for Errors in Asynchronous Code

export const fetchWithError = () => {
  return new Promise((_, reject) => {
    setTimeout(() => {
      reject("error");
    }, 1000);
  });
};
