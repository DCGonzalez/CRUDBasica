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
public class Regional extends Conexion
{
    private int nregional;
    private String zonaregional;
    private String nombreregional;
    private String nombredirectorregional;
    private String direccionregional;
    private String telefonoregional;
    private ResultSet resultadoconexion = null;
    
    public Regional()
    {
        Conectar();
    }
    
    public void RegistrarRegional(int gnregional, String gzonaregional, String gnombreregional, String gnombredirectorregional, String gdireccionregional, String gtelefonoregional)
    {
        try
        {
            String Registro = ("INSERT INTO regional VALUES ('"+gnregional+"', '"+gzonaregional+"', '"+gnombreregional+"', '"+gnombredirectorregional+"', '"+gdireccionregional+"', '"+gtelefonoregional+"');");
            if(this.Ejecutar(Registro) > 0)
            {
                System.out.println("REGIONAL REGISTRADA EXITOSAMENTE.");
            }
            else
            {
                System.out.println("ERROR EN EL REGISTRO DE LA REGIONAL.");
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR EN PROCEDIMIENTO: " + e);
        }
    }
    
    public ResultSet ConsultarRegional(int gnregional) throws Exception
    {
        try
        {
            getComando();
            resultadoconexion = comando.executeQuery("SELECT zona_regional, nombre_regional, nombre_director_regional, direccion_regional, telefono_regional FROM regional WHERE n_regional='"+gnregional+"';");
            return resultadoconexion;
        }
        catch(SQLException ex)
        {
            System.out.println("ERROR EN PROCEDIMIENTO: " + ex);
            return null;
        }
    }
    
    public void ModificarRegional(int gnregional, String gzonaregional, String gnombreregional, String gnombredirectorregional, String gdireccionregional, String gtelefonoregional)
    {
        try
        {
            String Modificar = ("UPDATE regional SET zona_regional='"+gzonaregional+"', nombre_regional='"+gnombreregional+"', nombre_director_regional='"+gnombredirectorregional+"', direccion_regional='"+gdireccionregional+"', telefono_regional='"+gtelefonoregional+"' WHERE n_regional="+gnregional+";");
            if(this.Ejecutar(Modificar) > 0)
            {
                System.out.println("REGIONAL ACTUALIZADA EXITOSAMENTE.");
            }
            else
            {
                System.out.println("ERROR AL ACTUALIZAR LA REGIONAL.");
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR EN PROCEDIMIENTO: " + e);
        }
    }
    
}
