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
public class Banco extends Conexion 
{
    private int idbanco;
    private String nombrebanco;
    private ResultSet resultadoconexion = null;
    
    public Banco()
    {
        Conectar();
    }
    
    public void RegistrarBanco(int gidbanco, String gnombrebanco)
    {
        try
        {
            String Registro = ("INSERT INTO banco VALUES ('"+gidbanco+"', '"+gnombrebanco+"');");
            if(this.Ejecutar(Registro) > 0)
            {
                System.out.println("BANCO REGISTRADO EXITOSAMENTE.");
            }
            else
            {
                System.out.println("ERROR EN EL REGISTRO DEL BANCO.");
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR EN PROCEDIMIENTO: " + e);
        }
    }
    
    public ResultSet ConsultarBanco(int gidbanco) throws Exception
    {
        try
        {
            getComando();
            resultadoconexion = comando.executeQuery("SELECT nombre_banco FROM banco WHERE id_banco='"+gidbanco+"';");
            return resultadoconexion;
        }
        catch(SQLException ex)
        {
            System.out.println("ERROR EN PROCEDIMIENTO: " + ex);
            return null;
        }
    }
    
    public void ModificarBanco(int gidbanco, String gnombrebanco)
    {
        try
        {
            String Modificar = ("UPDATE banco SET nombre_banco='"+gnombrebanco+"' WHERE id_banco="+gidbanco+";");
            if(this.Ejecutar(Modificar) > 0)
            {
                System.out.println("BANCO ACTUALIZADO EXITOSAMENTE.");
            }
            else
            {
                System.out.println("ERROR AL ACTUALIZAR EL BANCO.");
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR EN PROCEDIMIENTO: " + e);
        }
    }
}
