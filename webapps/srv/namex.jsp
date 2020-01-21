<!DOCTYPE html>
<html>
    <head>
        <meta charset=utf8>
    </head><body>
        
<div>
    <h1>This is the Home Page</h1>
</div>
        
<div>
<% if( request.getSession().getAttribute("name") == null ) { %>
    You are not logged in.
<% } else { %>
    <!-- in HTML, we can expand a session variable with the {} notation -->
    You are logged in as: ${name}
<% } %>
</div>
</body>
</html>
