<%-- 
    Document   : Agregar
    Created on : 26/11/2020, 05:17:15 PM
    Author     : AxelHOOLIC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>agregar alumno</title>
    </head>
    <body>
        <form action="controlador" method="POST">
            <div>
                <header>Agregar persona</header>
            </div>
            <div>
                Nombres
                <input type="text" name="txtnombre"/>
            </div>
            <div>
                Apellido
                <input type="text" name="txtapellido"/>
            </div>
            <div>
                Nota1
                <input type="number" name="txtnota1"/>
            </div>
            <div>
                Nota2
                <input type="number" name="txtnota2"/>
            </div>
            <div>
                <input type="submit" value="nuevo" name="accion"/>
                <br>
                <a href="controlador?accion=listar">volver</a>
            </div>
        </form>
    </body>
</html>
