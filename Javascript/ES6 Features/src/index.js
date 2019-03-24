import React, {Component} from 'react';
import ReactDOM from 'react-dom';

class App extends Component {
  render() {
    return (
      <div>ReactJS and JSX in action!</div>
    )
  }
}

//renders <App></App> (or <App />) and targets the root id
ReactDOM.render(<App />, document.getElementById("root"));
