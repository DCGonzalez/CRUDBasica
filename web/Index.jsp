<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Inicio Sesión: CRUD Básica</title>
        <link rel="stylesheet" media="screen" href="CSS/Style.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="InicioSesion" method="POST">
            <section class="secgen">
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
                    <label class="labmen">${mensaje}</label>
                </section>
                <input type="submit" class="btndat" value="Iniciar Sesión">
            </section>
        </form>
    </body>
</html>
