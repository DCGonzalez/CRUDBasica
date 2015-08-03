/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;

import com.EnlaceBD.Conexion;
import java.sql.*;
/**
 *
 * @author DANIELTS
 */
public class Usuario extends Conexion 
{
    private String nickname;
    private String password;
    private String rol;
    private ResultSet resultadoconexion = null;

    public Usuario()
    {
        //Se inicia la conexión con MySQL
        Conectar();
    }
    
    public ResultSet IniciarSesion(String isnickname, String ispassword) throws Exception
    {
        try
        {
            getComando();
            resultadoconexion = comando.executeQuery("SELECT rol FROM usuario WHERE nickname='"+isnickname+"' AND password='"+ispassword+"';");
            return resultadoconexion;
        }
        catch(SQLException ex)
        {
            System.out.println("ERROR EN PROCEDIMIENTO: " + ex);
            return null;
        }
    }
}
