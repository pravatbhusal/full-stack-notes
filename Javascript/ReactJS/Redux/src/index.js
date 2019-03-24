import React from 'react';
import ReactDOM from 'react-dom';
import {Provider} from "react-redux";

import App from "./containers/App";
import store from "./store"

//react-redux connects the store to the React app by using the Provider
ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root'));
