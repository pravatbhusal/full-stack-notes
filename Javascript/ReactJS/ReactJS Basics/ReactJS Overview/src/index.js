//react modules
import React from 'react';
import ReactDOM from 'react-dom';
//components (independent pieces of the UI that accept "props")
import Header from "./components/Header";
import Home from "./components/Home";
import Footer from "./components/Footer";
import Lifecycle from "./components/Lifecycle";

//creating the App class
class App extends React.Component {
  constructor(props) {
    super();
    this.state = {
      footerText: "This is the footer text."
    }
  }
  changeFooter(newFooterText) {
    //this updates the state of the footer text
    this.setState({
      footerText: newFooterText
    });
  }
  render() {
    //returning JSX, an XML view system to render HTML with JS
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

//rendering the App class onto the index.html's root div
ReactDOM.render(<App />, document.getElementById('root'));
