# NextJS
NextJS is a React framework that enables full-stack applications that provides in-built functionality for data fetching, CSS support (Tailwind), fonts, routing, API routes, middleware, and more.

https://nextjs.org/

## NextJS Tech Stack
The default tech stack for NextJS includes: TypeScript, React, ESLint, and Tailwind CSS. NextJS has its own server framework instead of using ExpressJS. In addition, it provides in-built routing and API routes, so react-router-dom is not necessary.

### NextJS v13 Folder and Files Structure
Folders:
1. pages - Pages for the website
2. public - Static files
3. styles - CSS files
4. api - API routes

Files:
1. _app.tsx - App component to import global files (e.g. global.scss), app configuration, and more
2. _document.tsx - Document component to add attributes to HTML (e.g. `lang="en"`)
3. index.tsx - Boilerplate for index page, starting point of the application's code

We will be modifying these boilerplate files for this tutorial project. This tutorial deletes the boilerplate TSX code in index.tsx to be replaced with our own code.

