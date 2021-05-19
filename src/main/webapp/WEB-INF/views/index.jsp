<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Lita de Deputados</h1>
    <c:forEach items="${deputados}" var="deputados">
       <div>
        <h1>${deputados.nome}</h1>
        <h2>${deputados.email}</h2>
        <h3>${deputados.siglaPartido}</h3>
            
       </div> 
        
        
    </c:forEach>
        

        
</body>
</html>