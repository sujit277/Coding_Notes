import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import Test from './Class';

//Normal way of serving HTML content in React
// ReactDOM.render(
//   <h1 style={{textAlign:"center"}}>Sujit Kumar Verma</h1>,
//   document.getElementById("root")
// );


//Serving HTML content in React using pure Javascript
// const h1 = document.createElement("h1");
// h1.innerHTML = "Sujit Kumar Verma";
// document.getElementById("root").appendChild(h1);


// Code for serving multiple elements in Reactjs using Container Element
// ReactDOM.render(
//   <div style={{ textAlign: "center" }}>
//     <h1>DLT</h1>
//     <h1>Accenture</h1>
//     <h1>EPAM Systems</h1>
//   </div>,
//   document.getElementById("root")
// );


// Code for serving multiple elements in Reactjs using React Fragment
// ReactDOM.render(
//   <React.Fragment>
//       <h1>DLT</h1>
//       <h1>Accenture</h1>
//       <h1>EPAM Systems</h1>
//   </React.Fragment>,
//   document.getElementById("root")
// );


// Code for serving multiple elements in Reactjs using short syntax of React Fragment
// ReactDOM.render(
//   <>
//       <h1>DLT</h1>
//       <h1>Accenture</h1>
//       <h1>EPAM Systems</h1>
//   </>,
//   document.getElementById("root")
// );

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Test/>
  </React.StrictMode>
);


