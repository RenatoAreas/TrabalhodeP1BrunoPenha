<%@page import="exemplo.Contador"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>A quantidade de acessos é:</h1>
        <%=Contador.getQuantidade()%>
            
        
    </body>
</html>
