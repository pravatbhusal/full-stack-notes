import React from 'react';

//Footer, a stateless constant component that only uses properties
const Header = (props) => {
  return(
    <div>
      <h1>{props.footerText}</h1>
    </div>
  );
}

export default Header;
