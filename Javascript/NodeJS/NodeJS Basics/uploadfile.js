//http, formidable (file upload), and filesystem modules
var http = require('http');
var formidable = require('formidable');
var fs = require('fs');

//create the web-server server, by default it's on localhost
http.createServer(function (req, res) {
  //if the request was "fileupload"
  if (req.url == '/fileupload') {
    var form = new formidable.IncomingForm();
    //parse the form data
    form.parse(req, function (err, fields, files) {
      //move the file from its default uploaded path to a specified path
      var oldpath = files.filetoupload.path;
      var newpath = '/media/pravat/Data/Google Drive/GitHub/archives/references/Javascript/NodeJS/NodeJS Basics';
      fs.rename(oldpath, newpath, function (err) {
        res.write('File uploaded and moved!');
        res.end();
      });
    });
  } else {
    //create the file upload form, and send it back to the client
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write('<form action="fileupload" method="post" enctype="multipart/form-data">');
    res.write('<input type="file" name="filetoupload"><br>');
    res.write('<input type="submit">');
    res.write('</form>');
    res.end();
  }
//set the web-server port to be 3000
}).listen(3000);
