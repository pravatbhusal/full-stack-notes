from http.server import HTTPServer, BaseHTTPRequestHandler


class Serv(BaseHTTPRequestHandler):
    def do_GET(self):
        # if the path is ROOT, send back index.html
        if self.path == '/':
            self.path = '/index.html'
        try:
            # use a file with a name that equals to the Route
            file_to_open = open(self.path[1:]).read()
            self.send_response(200)
        except:
            file_to_open = "Error 404: File not found!"
            self.send_response(404)
        self.end_headers()
        self.wfile.write(bytes(file_to_open, 'utf-8'))  # HTTP Response (send back to client)


# start the HTTP Server at localhost:8080
httpd = HTTPServer(('localhost', 8080), Serv)

# serve the HTTP Server forever, as long as we don't stop the Python file from running
httpd.serve_forever()
