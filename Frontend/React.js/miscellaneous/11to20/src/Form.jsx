import React, { useState } from "react";

// Assignment Showing alert based on form input
const Form = () => {
  const [name, setName] = useState("");
  const [password, setPassword] = useState("");

  function Save() {
    if (name === "" && password !== "") {
      alert("Name is not Entered");
    } else if (name !== "" && password === "") {
      alert("Password is not Entered");
    } else {
      alert(`Name ${name} and Password is ${password}`);
    }
  }

  return (
    <>
      <div style={{ textAlign: "center" }}>
        <h1>Forms in React</h1>
        <form>
          <input
            type="text"
            name="name"
            value={name}
            onChange={(event) => {
              setName(event.target.value);
            }}
          />
          <input
            type="text"
            name="password"
            value={password}
            onChange={(event) => {
              setPassword(event.target.value);
            }}
          />
          <button type="button" onClick={Save}>
            Submit
          </button>
        </form>
      </div>
    </>
  );
};

export default Form;
