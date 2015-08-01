<%-- 
    Document   : PError
    Created on : 31/07/2015, 09:07:45 AM
    Author     : DANIELTS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Sesión: CRUD Básica</title>
    </head>
    <body>
        <form action="InicioSesion" method="POST">
            <section>
                <label class="labtit">Inicio Sesión</label>
                <section>
                    <label class="labinf">Usuario:</label>
                    <input type="text" class="txtdat" name="txtnickname" value="" required>
                </section>
                <section>
                    <label class="labinf">Contraseña:</label>
                    <input type="password" class="txtdat" name="txtpassword" value="" required>
                </section>
                <section>
                    <label class="laberr">Usuario o Contraseña incorrecta, verifique sus datos e intente nuevamente.</label>
                </section>
                <input type="submit" class="btndat" value="Iniciar Sesión">
            </section>
        </form>
    </body>
</html>
