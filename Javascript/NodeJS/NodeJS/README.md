# NodeJS Basics
This folder represents the basic features of modern NodeJS, a server-side run-time for JavaScript. Node comes with two command line (CLI) tools:
1. `node` - the CLI for NodeJS
2. `npm` - the package manager to manage dependencies for NodeJS projects

To get started, install the latest LTS version of Node from https://nodejs.org/en.

# Node Version Management
Many times the `node` version changes, and you'll have to also update the corresponding `npm` version as well. To make things simpler, you can use the [n](https://www.npmjs.com/package/n) package, which is an NPM package that handles the version of your node and npm command-line tools.

```
npm install n -g
n stable // To use latest stable version of node and npm
n latest / To use latest version of node and npm
```

# Commands
- Use "npm init" on a file folder to initiate the package.json file
- Use "node [FILE_NAME]" to start the web-server from a
specific JavaScript file

# Packages
- Use "npm install formidable --save" to install the file upload system and add it to the package.json
- Use "npm install mysql --save" to install the MySQL module and add it to the package.json
- Use "npm install mongodb --save" to install the MongoDB module and add it to the package.json (We don't use MongoDB in this tutorial)
