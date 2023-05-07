# NextJS
[NextJS](https://nextjs.org/) is a React framework that enables full-stack applications that provides in-built functionality for data fetching, CSS support (Tailwind), fonts, routing, API routes, middleware, and more.

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

### Prisma
[Prisma](https://www.prisma.io/) is an ORM (Object Relational Mapping) tool that maps your SQL database as objects in the Database. It is a replacement for SQL queries and migrations. Prisma is used to connect to the database and perform CRUD operations. It speeds up development and makes your code more readable.

Prisma [supports multiple SQL databases](https://www.prisma.io/docs/reference/database-reference/supported-databases): MySQL, PostgresSQL, SQLite, SQL Server, and even NoSQL databases like MongoDB.

To install Prisma: `npm install prisma --save`.

To initialize Prisma with SQLite: `npx prisma init --datasource-provider sqlite`. SQLite is a starting point database to use if you don't want to host a database from a separate server and are OK with using the same server as the application. After initializing Prisma, it creatse a schema.prisma and .env files that specify the connection to your database server.

If you already have data in your database, you can run `npx prisma db pull` to pull the data into your Prisma schema. But this will only be necessary if you have existing data in your databases, otherwise no need to pull.

### Modelling Data
To model your schema, in schema.prisma you can create `model` types that represent the object that you are trying to store.

For example, a User linked to its blog Posts would look like so:
```
model User {
  id    Int     @id @default(autoincrement())
  email String  @unique
  name  String?
  posts Post[]
}

model Post {
  id        Int     @id @default(autoincrement())
  title     String
  content   String?
  published Boolean @default(false)
  author    User    @relation(fields: [authorId], references: [id])
  authorId  Int
}
```

### Migrate Database
At this point, we have a schema but no database so let's run `npx prisma migrate dev --name init` to initialize the `Post` table in our SQLite database defined as dev.db. The `--name` flag is used to name the migration for version control.

### Prisma Client
The client.ts file is the boilerplate code for Prisma to communicate with the database in our webserver. It is used to perform CRUD operations on the database. It is imported into the API routes to perform database operations.