//react modules
import React from 'react';
import ReactDOM from 'react-dom';
import {BrowserRouter, Route, Switch} from 'react-router-dom';

//components
import Home from "./components/Home";

class App extends React.Component {
  //all routes must be within the <BrowserRouter> element
  //the <Switch> only renders the first Route that matches the path
  //each <Route> is a specific URL path that renders specific components
  //the "exact" keyword on a Route is used to only render a component on the exact URL path
  //when using the render={}, you must pass the (props) and {...props} in the arrow function to use the URL properties
  render() {
    return(
      <BrowserRouter>
          <Switch>
            <Route path="/" exact render={(props) => <Home routeLocation={"root"} {...props}/>}/>
            <Route path="/home" exact render={(props) => <Home routeLocation={"home"} {...props}/>}/>
            <Route path="/user/:id" exact render={(props) => <Home routeLocation={"user"} {...props}/>}/>
          </Switch>
      </BrowserRouter>
    );
  }
}

ReactDOM.render(<App />, document.getElementById('root'));
