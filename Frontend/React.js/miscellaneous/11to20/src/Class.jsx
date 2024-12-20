import React from "react";

// State Management in class component
class Class extends React.Component {
  constructor() {
    super();
    this.state = { count: 0 };
    this.increment = this.increment.bind(this);
  }

  increment() {
    this.setState({ count: this.state.count + 1 });
  }

  render() {
    return (
      <>
        <div style={{ textAlign: "center" }}>
          <h1>Class Component with State</h1>
          <h1>{this.state.count}</h1>
          <button type="button" onClick={this.increment}>
            Increment
          </button>
          <button type="button" onClick={() => this.increment()}>
            Increment
          </button>
        </div>
      </>
    );
  }
}

export default Class;
