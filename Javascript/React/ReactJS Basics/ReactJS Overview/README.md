# ReactJS Basics (Overview)
This folder represents the basic overview of modern ReactJS, a client-side library for JavaScript.

Here's a helpful React 2022 cheat sheet: https://www.freecodecamp.org/news/the-react-cheatsheet/amp/

# Commands
- Use "npm start" to start the react application in development mode
- Use "npm run build" to build for production
- Use "serve -s build" to run the production build

# Packages
- Use "npm install create-react-app -g" to install a boilerplate command to create a react application
- Use "npm install serve -g" to install a server startup command for the react application whenever using a production build

# React Developer Tools (Google Chrome)
https://chrome.google.com/webstore/detail/react-developer-tools/fmkadmapgofadopljbjfkapdkoienihi/related?hl=en

# Webpack Bundling & Scalability
Using create-react-app, it uses webpack to bundle all the JS code in one script file.

"As your app grows, your bundle will grow too. Especially if you are including large third-party libraries. You need to keep an eye on the code you are including in your bundle so that you don’t accidentally make it so large that your app takes a long time to load." - React Docs

To solve this, implement lazy loading so it splits your code up into more scripts.

Read here to learn how: https://reactjs.org/docs/code-splitting.html

You can only lazy load default components, if you want to lazy load a non-default component then use
```js
const OtherComponent = React.lazy(
  () => import('./OtherComponent').then(module => ({ default: module.OtherComponent }))
);
```
