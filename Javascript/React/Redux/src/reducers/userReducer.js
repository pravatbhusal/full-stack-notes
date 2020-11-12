//an example, initial state for the userReducer
const initialUserState = {
  name: "Pravat"
}

//reducers: handle multiple actions (change of state)
//NOTE: the first parameter has a default value (new ES6 feature)
const userReducer = (state = initialUserState, action) => {
  if(action.type === "SET_NAME") {
    state = {
      ...state, //spread all the properties you're not updating
      name: action.payload //edit a specific property; it overrides the default property
    }
  }
  return state; //return the new state
}

export default userReducer;
