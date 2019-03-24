"""
Very simple HTTP server in python.

Usage::
    ./dummy-web-server.py [<port>]

Send a GET request::
    curl http://localhost

Send a HEAD request::
    curl -I http://localhost

Send a POST request::
    curl -d "foo=bar&bin=baz" http://localhost

"""
from http.server import HTTPServer, BaseHTTPRequestHandler


class Serv(BaseHTTPRequestHandler):
    def _set_headers(self):
        self.send_response(200)
        self.send_header('Content-type', 'text/html')
        self.end_headers()

    # Handle GET Requests
    def do_GET(self):
        self._set_headers()
        self.wfile.write("<html><body><h1>hi!</h1></body></html>")

    # Handle Header
    def do_HEAD(self):
        self._set_headers()

    # Handle POST Requests
    def do_POST(self):
        content_length = int(self.headers['Content-Length'])  # <--- Gets the size of POST data
        post_data = self.rfile.read(content_length)  # <--- Gets the POST data itself
        self._set_headers()
        self.wfile.write("<html><body><h1>POST!</h1><pre>" + post_data + "</pre></body></html>")


# run the server with the specified default parameters  
def run(server_class=HTTPServer, handler_class=Serv, port=8080):
    server_address = ('localhost', port)
    httpd = HTTPServer(server_address, handler_class)
    print("HTTP Server is now running...")
    httpd.serve_forever()


run();  # run the HTTP server
