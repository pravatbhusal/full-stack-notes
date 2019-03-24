import React from 'react';
import {connect} from "react-redux";

import {setName, setAsyncName} from "../actions/userActions";

class App extends React.Component {
  render() {
    return (
      <div>
        <p>The application works!</p>
        <p>{this.props.user.name}</p>
        <button onClick={() => this.props.setName("Bhusal")}>Change Name!</button>
        <button onClick={() => this.props.setAsyncName("Bhusal Async")}>Change Name Asynchrously!</button>
      </div>
    );
  }
}

//this method is to use specific reducers as props in the component
const mapStateToProps = (state) => {
  return {
    user: state.userReducer, //prop name created by Redux to use in the component
    //math: state.mathReducer //you may also add more reducers
  };
}

//this method is to create function dispatchers as props in the component
const mapDispatchToProps = (dispatch) => {
  return {
    setName: (name) => {
      dispatch(setName(name)); //setName() is from userActions.js
    },
    setAsyncName: (name) => {
      dispatch(setAsyncName(name)); //setAsyncName() is from userActions.js
    }
  };
}

//connect() will connect React with Redux, and export the component
export default connect(mapStateToProps, mapDispatchToProps)(App);
