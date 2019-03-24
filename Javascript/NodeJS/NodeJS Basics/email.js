//nodemailer module
var nodemailer = require('nodemailer');

//sender (or transporter) of the email
var sender = nodemailer.createTransport({
  service: 'gmail',
  auth: {
    user: 'pravat.bhusal@gmail.com',
    pass: 'password'
  }
});

//set the mail headers
var mailHeader = {
  from: 'pravat.bhusal@gmail.com',
  to: 'friend@gmail.com',
  subject: 'This is an email test',
  text: 'Hello World!'
}

//send the e-mail
sender.sendMail(mailHeader, (error, data) => {
  console.log("Sent email: " + data.response);
});
