import {createStore, combineReducers, applyMiddleware} from 'redux';
import userReducer from "./reducers/userReducer";
import thunk from "redux-thunk";

//logger middleware (executed before state is changed) for Redux
//NOTE: these 3 arrow functions allow us to use all 3 parameters in the function
const myLogger = (store) => (next) => (action) => {
  console.log("Logged Action: " + action);
  next(action);
}

//store: updates specific components by using reducers
/*NOTE: since the reducers are combined, the action types must have unique names
or redux could accidently call multiple reducers*/
export default createStore(combineReducers({
  userReducer //in ES6, if there's no object property name then it just sets it to the var name
}),
{}, //initial state for reducers (unless specified) goes in this parameter
applyMiddleware(myLogger, thunk));
