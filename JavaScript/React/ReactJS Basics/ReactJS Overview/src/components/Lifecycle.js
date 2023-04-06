import React from 'react';

//Aside component
//This Lifecycle component was created to show a component's lifecycless
export default class Lifecycle extends React.Component {
  //before initial rendering
  componentWillMount() {

  }
  //after initial rendering
  componentDidMount() {

  }
  //when receiving new props
  componentWillReceiveProps(nextProps) {

  }
  //before rendering after receiving new props or state
  shouldComponentUpdate(nextProps, nextState) {
    //return false to prevent re-rendering
    return true;
  }
  //before rendering after receiving new props or state
  componentWillUpdate(nextProps, nextState) {

  }
  //after component's updates are flushed to DOMs
  componentDidUpdate(prevProps, prevState) {

  }
  //before removing component from DOM
  componentWillUnmount() {

  }
  render() {
    //make a paragraph with the id parameter from the URL
    return (
      <div>
        <p>This is the lifecycle boilerplate component!</p>
      </div>
    );
  }
}
