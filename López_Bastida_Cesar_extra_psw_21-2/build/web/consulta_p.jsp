<%-- 
    Document   : consulta_p
    Created on : 17/06/2021, 11:53:22 AM
    Author     : river
--%>

<%-- 
    Document   : consultas_G
    Created on : 17/06/2021, 11:02:48 AM
    Author     : river
--%>

<%@page import="Control.AccionesUsuario"%>
<%@page import="MODELO.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%

 
 //String nombre = (String)session.getAttribute("Usuario");
 //session2.setAttribute("Usuario", usuario);
 //sessionUSU.setAttribute("Usuario", e.getNombre_usu());
 
                          



%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="preconnect" href="https://fonts.gstatic.com/%22%3E">
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap" rel="stylesheet">
    </head>
    <body>
        <div id="main-container">
        <br><br>

		<table>
			<thead>
				<tr>
					<th>Nombre</th><th>Contraseña</th><th>Puesto</th><th>Sueldo</th>
				</tr>
			</thead>
                        
			<tr>
				<td>Cesar</td><td>ringue</td><td>Jefe</td><td>10</td>
			</tr>
			
                       
		</table>
	</div>

    <a href="index.html">Regresar</a>
    </body>
</html>
