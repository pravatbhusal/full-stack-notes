# ES6 (ECMAScript 6) Overview

# About Babel
- Is a transpiler that converts ES6 (ES 2015) to older versions of JS
- Can convert TypeScript or ES6 to ES5
- Online Babel compiler: https://babeljs.io/repl

# About Webpack
- Is a bundler for all js modules into one .js file
- It comes with a dev-server for live code updating
- We use Webpack to host Babel

# About NPM
- Node package manager allows us to install modules from npm
- You must install Node in order to use the npm commands https://nodejs.org/en/download/

# NPM Commands and Notes
- Use "npm init -y" on a directory to initiate the npm project
- We use "npm install [Package]" it installs the package, add the -g and it makes it a global package
- We use "npm update [Package]" to update a package
- We use "npm uninstall [Package]" to delete a package
- To see local modules use "npm list --depth=0" and global is "npm list -g --depth=0"
- Adding "scripts" into the package.json file allows us to
write new commands in the cmd, just use "npm run [Command]"

# Automatically Install ALL Babel, React, and Webpack Dependencies
- Install create-react-app boilerplate: "npm install -g create-react-app"
- Then use "create-react-app [Project Name]"
- Install serve: "npm install -g serve"
- Build for production using: "npm run build"
- Run the production server using "npm serve build"
- Read more here: https://github.com/facebook/create-react-app

# ES6 Features with Create-React-App
- We're using the "create-react-app" boilerplate to make the webpack and babel production much simpler
- Use "npm run start" to start a live development server and "npm run build" to build files for production
- Install "serve" with "npm install serve -g" and run the serve server for production build with "serve build"

# File system and Management
- All the javascript files go inside the "src" folder
- The public folder holds the single page application's (SPA) index.html file
- Webpack and Babel transpile the ES6 to ES5 and merge index.js file into the index.html

# Test JavaScript ES6 Online
- http://www.webtoolkitonline.com/javascript-tester.html
