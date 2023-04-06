import React from 'react';
import {Text, View, Button} from 'react-native';

export default class SecondScreen extends React.Component {
  //settings variable to set the screen options
  static navigationOptions = {
  	header: null,
    title: 'Second Screen'
  }

  render() {
    var {params} = this.props.navigation.state;
    return (
      <View>
        <Text>This is screen 2.</Text>
        <Text>
          Parameters from screen 1:
          firstName = {params.firstName},
          lastName = {params.lastName}
        </Text>
      </View>
    )
  }
}
