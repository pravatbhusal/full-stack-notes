//file system module (or "fs" for short)
var fs = require('fs');

//read the file "index.html" in our local directory
fs.readFile('index.html', (error, data) => {
  console.log(data); //outputs the binary data
});

//append (or add) new content to a file at the end
//if file doesn't exist, node will create the file
fs.appendFile('file.txt', 'Hello World!', (error) => {
  console.log("Appended file!");
});

//open a file and do the flag parameter [for this, it's w (writing)]
//if file doesn't exist, node will create the file
fs.open('file.txt', 'w', (error, file) => {
  console.log("The file is now open for writing!");
});

//replace the contents within a file with new written content
//if file doesn't exist, node will create the file
fs.writeFile('file.txt', 'Hello World!', (error) => {
  console.log("Wrote new content on the file!");
});

//deletes a file
fs.unlink('file.txt', (error) => {
  console.log("Deleted file!");
});

//renames a file
//if file doesn't exist, node will create the file
fs.rename('file.txt', 'file_renamed.txt', (error) => {
  console.log("Renamed the file!");
});
