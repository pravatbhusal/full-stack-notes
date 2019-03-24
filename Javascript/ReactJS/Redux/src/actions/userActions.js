//action to set a user's name
export function setName(name) {
  return {
    type: "SET_NAME",
    payload: name
  }
}

//asynchrous action that runs after 2 seconds, requires redux-thunk middleware
export function setAsyncName(name) {
  return dispatch => {
    setTimeout(() => {
      dispatch({
        type: "SET_NAME",
        payload: name
      });
    }, 2000);
  }
}
