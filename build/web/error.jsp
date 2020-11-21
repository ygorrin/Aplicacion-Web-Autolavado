<%-- 
    Document   : error
    Created on : 11/09/2020, 02:52:30 PM
    Author     : Ranny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Error</title>
    <link href="css/styles.css" rel="stylesheet" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">


</head>

<body style="background-color: rgb(75, 184, 164);">
    <div id="error">
        <h1 style="text-align: center;"><b> Error, falta ingresar datos</b> </h1>
    </div>
    <form action="pagina2.jsp" method="POST" style="text-align: center;">
        <button type="submit" class="btn btn-secondary btn-lg">Regresar</button>
    </form>
    <div>
        <img style="margin:0px 130px;" src="https://josefacchin.com/wp-content/uploads/2018/05/solucionar-error-500.png"
            alt="error">
    </div>


</body>

</html>