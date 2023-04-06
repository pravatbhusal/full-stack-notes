import React from 'react';

//Home component
export default class Home extends React.Component {
  constructor(props) {
    super();
    //set the states (changeable properties)
    this.state = {
      welcomeText: props.welcomeText,
      status: "None"
    }
  }
  //we do not specify "function" because this function is inside of a class
  onChangeText() {
    //changes the state of only the states you want to change (re-renders)
    //the "this" keyword must be binded to the Home class
    this.setState({
      welcomeText: "Changed the state of the welcome text!"
    });
  }
  onChangeFooter() {
    //initiate the changeFooter() function within the parent component
    this.props.changeFooter("The footer has changed by the Home component!");
  }
  render() {
    //dynamic content with javascript, using "{}" <- (ONLY for 1 line)
    let Content = <p>This is a dynamic content!</p>
    return(
      <div>
        {Content}
        <p>{this.state.welcomeText}</p>
        <p>Status: {this.state.status}</p>
        <button onClick={this.onChangeText.bind(this)}>Change welcome!</button>
        <button onClick={this.onChangeFooter.bind(this)}>Change footer!</button>
      </div>
    );
  }
}
