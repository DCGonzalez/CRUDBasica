<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Inicio Sesi�n: CRUD B�sica</title>
        <link rel="stylesheet" media="screen" href="CSS/Style.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="InicioSesion" method="POST">
            <section class="secgen">
                <label class="labtit">Inicio Sesi�n</label>
                <section>
                    <label class="labinf">Usuario:</label>
                    <input type="text" class="txtdat" name="txtnickname" value="" required>
                </section>
                <section>
                    <label class="labinf">Contrase�a:</label>
                    <input type="password" class="txtdat" name="txtpassword" value="" required>
                </section>
                <section>
                    <label class="labmen">${mensaje}</label>
                </section>
                <input type="submit" class="btndat" value="Iniciar Sesi�n">
            </section>
        </form>
    </body>
</html>
