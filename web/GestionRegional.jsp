<%-- 
    Document   : GestionRegional
    Created on : 31/07/2015, 11:11:55 PM
    Author     : DANIELTS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión Regional: CRUD Básica</title>
        <link rel="stylesheet" media="screen" href="CSS/Style.css">
    </head>
    <body>
        <form action="GestionRegional" method="POST">
            <section>
                <label class="labtit">Gestión Regional</label>
                <section>
                    <label class="labinf">N° Regional:</label>
                    <input type="text" class="txtdat" name="txtnregional" value="${gnregional}" required>
                </section>
                <section>
                    <label class="labinf">Zona Regional:</label>
                    <input type="text" class="txtdat" name="txtzonaregional" value="${gzonaregional}">
                </section>
                <section>
                    <label class="labinf">Nombre Regional:</label>
                    <input type="text" class="txtdat" name="txtnombreregional" value="${gnombreregional}">
                </section>
                <section>
                    <label class="labinf">Nombre Director Regional:</label>
                    <input type="text" class="txtdat" name="txtnombredirectorregional" value="${gnombredirectorregional}">
                </section>
                <section>
                    <label class="labinf">Dirección Regional:</label>
                    <input type="text" class="txtdat" name="txtdireccionregional" value="${gdireccionregional}">
                </section>
                <section>
                    <label class="labinf">Teléfono Regional:</label>
                    <input type="text" class="txtdat" name="txttelefonoregional" value="${gtelefonoregional}">
                </section>
                <section>
                    <label class="labmen">${mensaje}</label>
                </section>
                <input type="submit" name="btnRegistrar" class="btndat" value="Registrar">
                <input type="submit" name="btnConsultar" class="btndat" value="Consultar">
                <input type="submit" name="btnModificar" class="btndat" value="Modificar">
                <section>
                    <label class="labact" onclick="location.href='PGestionAdministrador.jsp'">Gestión Administrador</label>
                </section>
            </section>
        </form>
    </body>
</html>
