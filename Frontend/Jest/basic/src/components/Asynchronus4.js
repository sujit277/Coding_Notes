//  Testing Asynchronous Functions with async/await

export const getUser = async () => {
  const response = await fetch("/user");
  const data = await response.json();
  return data.name;
};
