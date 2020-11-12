import React from 'react';
import {Link} from 'react-router-dom';

export default class Home extends React.Component {
  render() {
    //the props.match.params refers to the URL parameters
    //the <Link> loads a new Route when clicked, and you can wrap elements inside of it to act as Buttons
    return(
      <div>
        <p>{this.props.routeLocation + ": " + this.props.match.params.id}</p>
        <Link to={"/user/5"}><button>Go to user #5</button></Link>
      </div>
    );
  }
}
