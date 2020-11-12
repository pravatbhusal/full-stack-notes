import React from 'react';
import {StyleSheet, Text, View, Button} from 'react-native';

export default class FirstScreen extends React.Component {
  //settings variable to set the screen options
  static navigationOptions = {
  	header: null,
    title: 'First Screen'
  }

  render() {
    var {navigate} = this.props.navigation;
    return (
      <View style={styles.container}>
        <Text>This is screen 1.</Text>
        <Button
          title = "Go to screen 2."
          onPress = {
            () => navigate("Second", {firstName: "Pravat", lastName: "Bhusal"})
          }
        />
        <View style={[styles.boxContainer, styles.boxOne]}>
          <Text>Box One</Text>
          <Text>Box One</Text>
          <Text>Box One</Text>
        </View>
        <View style={[styles.boxContainer, styles.boxTwo]}>
          <Text>Box Two</Text>
        </View>
        <View style={[styles.boxContainer, styles.boxThree]}>
          <Text>Box Three</Text>
          <Text>Box Three</Text>
          <Text>Box Three</Text>
        </View>
      </View>
    )
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1, //1:1 ratio (or 100%),
    flexDirection: 'column' //items are organized from top to bottom
    //flexDirection: 'column-reverse' //reverses the layout
  },
  boxContainer: {
    flex: 1, //1:3 is the default layout of each box
    alignItems: 'center', //items inside the container are centered, horizontally
    justifyContent: 'center' //items inside the container are centered, vertically
  },
  boxOne: {
    flex: 3, //3:6
    backgroundColor: '#FFEEE4',
    justifyContent: 'space-around' //equal padding (space), vertically
  },
  boxTwo: {
    flex: 1, //1:6
    backgroundColor: '#F17F42'
  },
  boxThree: {
    flex: 2, //2:6
    flexDirection: 'row', //items are organized from left to right
    justifyContent: 'space-between', //sets equal padding to the very sides
    alignItems: 'flex-end', //sets the items to the very bottom of the box
    backgroundColor: '#CE6D39'
  }
});
