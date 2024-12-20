import React, { useState, useEffect } from "react";

const UserComponent = ({ userId }) => {
  const [user, setUser] = useState(null);

  useEffect(() => {
    const fetchUser = async () => {
      const response = await fetch(
        `https://jsonplaceholder.typicode.com/users/${userId}`
      );
      const data = await response.json();
      setUser(data);
    };

    fetchUser();
  }, [userId]);

  return <div>{user ? <p>User: {user.name}</p> : <p>Loading...</p>}</div>;
};

export default UserComponent;
