"""
Routing references for Flask applications.
"""

from flask import Flask, request

# set the name of the application, using its module or package
app = Flask(__name__)


# home route
@app.route("/")
def landing():
    return "Landing Page: The root/home route"


# about route
@app.route("/about")
def about():
    return "About page: This is an application to study Flask routing."


# user route with a URL converter for id; if no data-type specified then converter is a String
@app.route("/user/", defaults={'id': '0'})
@app.route("/user/<id>")
def user(id):
    return "User Id: " + id


# game route with an integer URL converter for id
@app.route("/game/", defaults={'id': 0})
@app.route("/game/<int:id>")
def game(id):
    return "Game Id: " + str(id)


# multiple URL converters
@app.route("/group/", defaults={'id': 0, 'name': 'Synced'})
@app.route("/group/<int:id>/<string:name>")
def group(id, name):
    return "Group Id: " + str(id) + " and Group Name: " + name


# receive path of URL (receive any "slashes" aka routes at and after the path declaration)
@app.route("/path/<path:url_path>")
def path(url_path):
    return "The path is: " + url_path


# if running as the main program, initiate the flask web-server on localhost:8080
if __name__ == "__main__":
    app.debug = True  # NOTE: disable debug mode when deploying to production
    app.run('localhost', 80)
