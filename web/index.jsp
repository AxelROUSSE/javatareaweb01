<%-- 
    Document   : index
    Created on : 26/11/2020, 04:37:29 PM
    Author     : AxelHOOLIC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>tarea senati</title>
    </head>
    <body>
        <h1>Agregar alumnos</h1>
        <div>
            <a href="controlador?accion=listar">Listar</a>
            <a href="controlador?accion=agregar">Agregar</a>
        </div>
        <table border="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>nombre</th>
                    <th>apellido</th>
                    <th>nota 1</th>
                    <th>nota 2</th>
                    <th>promedio</th>
                    <th>acciones</th>
                </tr>
            </thead>
            <c:forEach var="alumno" items="${Alumnos}">
            <tbody>
                <tr>
                    <td>${alumno.id}</td>
                    <td>${alumno.nombre}</td>
                    <td>${alumno.apellido}</td>
                    <td>${alumno.nota1}</td>
                    <td>${alumno.nota2}</td>
                    <td>${alumno.promedio}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </body>
</html>
