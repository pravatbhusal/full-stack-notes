import React from 'react';
import {createStackNavigator} from 'react-navigation';
import FirstScreen from './screens/FirstScreen';
import SecondScreen from './screens/SecondScreen';

const Navigation = createStackNavigator({
  First: {screen: FirstScreen},
  Second: {screen: SecondScreen}
},
{
  // create a padding to avoid overlapping the navbar of the device
  cardStyle: {
    paddingTop: Platform.OS === 'ios' ? 0 : StatusBar.currentHeight
  }
});

export default Navigation;
