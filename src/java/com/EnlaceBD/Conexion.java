/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EnlaceBD;

import java.sql.*;

/**
 *
 * @author DANIELTS
 */
public class Conexion 
{
    protected Connection conexion = null;
    protected Statement comando;
    protected PreparedStatement comandoavanzado;
    private String basedatosnombre = "crudbasicabd";
    private String usuario = "root";
    private String contrasena = "";
    private String url = "jdbc:mysql://localhost/"+basedatosnombre;
    
    public Connection Conectar()
    {
        try
        {
            //Se utiliza para especificar el driver con el que se va a trabajar
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Se utiliza para establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            //Se crea la conexión
            comando = conexion.createStatement();
            //Muestra mensaje en la consola si la conexión fue exitosa
            System.out.println("CONEXIÓN CON MYSQL EXITOSA.");
        }
        catch(Exception e)
        {
            //Muestra mensaje con error en la consola si la conexión no fue exitosa
            System.out.println("ERROR AL CONECTAR CON MYSQL: " + e);
            return null;
        }
        return conexion;
    }
    
    public void Desconectar()
    {
        try
        {
            //Se cierran las conexiones
            comando.close();
            comandoavanzado.close();
            conexion.close();
        }
        catch(SQLException ex)
        {
            System.out.println("ERROR AL DESCONECTAR CON MYSQL: " + ex);
        }
    }
    
    public Statement getComando()
    {
        return this.comando;
    }
    
    public int Ejecutar(String Query) throws Exception
    {
        int Ejecutar = 0;
        Ejecutar = comando.executeUpdate(Query);
        return Ejecutar;
    }
}
