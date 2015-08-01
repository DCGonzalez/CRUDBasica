<%-- 
    Document   : PGestionAdministrador
    Created on : 31/07/2015, 09:07:29 AM
    Author     : DANIELTS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión Administrador: CRUD Básica</title>
    </head>
    <body>
        <section>
            <label class="labtit">Gestión Administrador</label>
        </section>
        <section>
            <label class="labinf" onclick="location.href='GestionFuncionario.jsp'">Gestión Funcionario</label>
        </section>
        <section>
            <label class="labinf" onclick="location.href='GestionBanco.jsp'">Gestión Banco</label>
        </section>
        <section>
            <label class="labinf" onclick="location.href='GestionRegional.jsp'">Gestión Regional</label>
        </section>
        <section>
                <label class="labinf" onclick="location.href='Index.jsp'">Cerrar Sesión</label>
        </section>
    </body>
</html>
