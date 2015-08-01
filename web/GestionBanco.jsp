<%-- 
    Document   : GestionBanco
    Created on : 31/07/2015, 09:51:38 AM
    Author     : DANIELTS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión Banco: CRUD Básica</title>
    </head>
    <body>
        <form action="GestionBanco" method="POST">
            <section>
                <label class="labtit">Gestión Banco</label>
                <section>
                    <label class="labinf">Id Banco:</label>
                    <input type="text" class="txtdat" name="txtidbanco" value="${gidbanco}" required>
                </section>
                <section>
                    <label class="labinf">Nombre Banco:</label>
                    <input type="text" class="txtdat" name="txtnombrebanco" value="${gnombrebanco}">
                </section>
                <input type="submit" name="btnRegistrar" class="btndat" value="Registrar">
                <input type="submit" name="btnConsultar" class="btndat" value="Consultar">
                <input type="submit" name="btnModificar" class="btndat" value="Modificar">
                <section>
                    <label class="labinf" onclick="location.href='PGestionAdministrador.jsp'">Gestión Administrador</label>
                </section>
            </section>
        </form>
    </body>
</html>
