<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags always come first -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
      <title>Postcode Finder</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css" integrity="sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd" crossorigin="anonymous">
  </head>
  <body>
      
      <div class="container">
    <h1>Postcode Finder</h1>
        <p>Enter a partial address to get the postcode.</p>
          <div id="message"></div>
      <form>
  <fieldset class="form-group">
    <label for="address">Address</label>
    <input type="text" class="form-control" id="address" placeholder="Enter partial address">
  </fieldset>
  
  <button class="btn btn-primary" id="find-postcode">Submit</button>
</form>
      </div>

    <!-- jQuery first, then Bootstrap JS. -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/js/bootstrap.min.js" integrity="sha384-vZ2WRJMwsjRMW/8U7i6PWi6AlO1L79snBrmgiDpgIWJ82z8eA5lenwvxbMV1PAh7" crossorigin="anonymous"></script>
      
      <script type="text/javascript">
      
          $("#find-postcode").click(function(e) {
      
        e.preventDefault();
              
        $.ajax({
            url: "https://maps.googleapis.com/maps/api/geocode/json?address=" + encodeURIComponent($("#address").val()) + "&key=AIzaSyAgTh9VUNLMrNef0PySILvqQTKK0Z__gKg",
            type: "GET",
            success: function (data) {
                
                console.log(data);
                
                if (data["status"] != "OK") {
                    
                    $("#message").html('<div class="alert alert-warning" role="alert">Postcode could not be found - please try again.</div>');
                    
                } else {
                
                $.each(data["results"][0]["address_components"], function (key, value) {
                    
                    if (value["types"][0] == "postal_code") {
                        
                    $("#message").html('<div class="alert alert-success" role="alert"><strong>Postcode found!</strong> The postcode is ' + value["long_name"] + '.</div>');
                    
                    }
                    
                })
                
                }
            }
            
        })
      })
      
      </script>
      
  </body>
</html>