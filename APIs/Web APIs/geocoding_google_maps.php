<html>
    <head>
        <title>Geocoding An Address</title>
    </head>
    <body>
    
    </body>
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    
    <script type="text/javascript">
    
    $.ajax({
        url : "https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyAgTh9VUNLMrNef0PySILvqQTKK0Z__gKg",
        type: "GET",
        success: function (data) {
        
            $.each(data["results"][0]["address_components"], function(key, value) {
              
                if (value["types"][0] == "country") {
                    
                    alert(value["short_name"]);
                    
                }
                
            })
        }
    })
 
    </script>
    
</html>