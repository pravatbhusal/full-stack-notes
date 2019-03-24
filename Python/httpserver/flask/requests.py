"""
A simple Flask website that handles HTTP requests.
"""

from flask import Flask, request
import json

# set the name of the application, using its module or package
app = Flask(__name__)


# home route
@app.route("/")
def landing():
    title = '<h4>Welcome to Shadowsych\'s Python Flask Website!</h4>'
    register = '<p><button onclick="window.location.href=\'/register\'">Register</button></p>'
    login = '<p><button onclick="window.location.href=\'/login\'">Login</button></p>'
    return title + register + login + send_program()


# login route (POST request form)
@app.route("/login")
def login():
    header = "<h4>Login Here!</h4>"
    form_header = '<form action="/account" method="POST">'
    username = '<p>Username: <input type="text" name="username"><br></p>'
    password = '<p>Password: <input type="password" name="password"><br></p>'
    submit = '<input type="submit" value="Submit">'
    form_footer = '</form>'
    return header + form_header + username + password + submit + form_footer


# account route (handles POST request form from the login route)
@app.route("/account", methods=['POST'])
def account():
    username = request.form.get('username')
    password = request.form.get('password')
    return "Your username was " + username + ", and your password was " + password + "."


# register route (GET request form)
@app.route("/register")
def register():
    header = "<h4>Register Here!</h4>"
    form_header = '<form action="/registration" method="GET">'
    username = '<p>Username: <input type="text" name="username"><br></p>'
    password = '<p>Password: <input type="password" name="password"><br></p>'
    submit = '<input type="submit" value="Submit">'
    form_footer = '</form>'
    return header + form_header + username + password + submit + form_footer


# registration route (handles GET request form from the register route)
@app.route("/registration", methods=['GET'])
def registration():
    username = request.args.get('username')
    password = request.args.get('password')
    return "Your username was " + username + ", and your password was " + password + "."


# send_program method used by the home route (POST request form)
def send_program():
    form_header = '<form action="/compile" method="POST" enctype="application/json">'
    json_value = json.dumps({"output": "Hello World!"})
    program = "<input type='hidden' name='program' value='" + json_value + "'>"
    submit = '<input type="submit" value="Send Program">'
    form_footer = '</form>'
    return form_header + program + submit + form_footer


# compile route (handles POST json request form from the home route)
@app.route("/compile", methods=['POST'])
def compile():
    program = json.loads(request.form.get("program"))
    return "The program's output was " + program["output"]


# if running as the main program, initiate the flask web-server on localhost:8080
if __name__ == "__main__":
    app.debug = True  # NOTE: disable debug mode when deploying to production
    app.run('localhost', 8080)
