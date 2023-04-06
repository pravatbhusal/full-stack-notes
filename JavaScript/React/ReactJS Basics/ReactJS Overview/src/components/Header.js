import React from 'react';
import PropTypes from 'prop-types';


//Header, a stateless constant component that only uses properties
const Header = (props) => {
  //looping through an Array to create another Array using map()
  let linkButtons = props.links.navbarLinks.map((name, i) => {
    return (<button key={i}>{name}</button>);
  });
  return(
    <div>
      {linkButtons}
    </div>
  );
}

//propTypes are used to check the datatype of certain props
Header.propTypes = {
  links: PropTypes.object
}

export default Header;
