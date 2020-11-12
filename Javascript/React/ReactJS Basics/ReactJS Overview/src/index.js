// react modules
import React from 'react';
import ReactDOM from 'react-dom';

// components (independent pieces of the UI that accept "props")
import Header from "./components/Header";
import Home from "./components/Home";
import Footer from "./components/Footer";
import Lifecycle from "./components/Lifecycle";

class App extends React.Component {
  constructor(props) {
    super();
    this.state = {
      footerText: "This is the footer text."
    }
  }
  
  changeFooter(newFooterText) {
    // this updates the state of the footer text
    this.setState({
      footerText: newFooterText
    });
    
    /**
      Whenever state changes in React, everything inside of the component will re-render including its children.
      If you want to make React more efficient as rendering, then only use state changes in the necessary components,
      or else it will re-render too many components since the children will also update with the parent.
    */
  }
  
  render() {
    // return in JSX format: an XML view system to render HTML with JS
    return (
      <div>
        <Header links={{navbarLinks: ["Home", "About"]}}/>
        <Home changeFooter={this.changeFooter.bind(this)} welcomeText={"Welcome to the Home component!"}/>
        <Footer footerText={this.state.footerText}/>
        <Lifecycle/>
      </div>
    );
  }
}

// renders the App class onto the index.html's root div
ReactDOM.render(<App />, document.getElementById('root'));
