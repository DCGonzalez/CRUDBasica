/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controlador;

import com.Modelo.Regional;
import java.sql.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DANIELTS
 */
@WebServlet(name = "GestionRegional", urlPatterns = {"/GestionRegional"})
public class GestionRegional extends HttpServlet 
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GestionRegional</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GestionRegional at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        if(request.getParameter("btnRegistrar") != null)
        {
            try
            {
                Regional objRegional = new Regional();
                objRegional.RegistrarRegional(Integer.parseInt(request.getParameter("txtnregional")), request.getParameter("txtzonaregional"), request.getParameter("txtnombreregional"), request.getParameter("txtnombredirectorregional"), request.getParameter("txtdireccionregional"), request.getParameter("txttelefonoregional"));
                response.sendRedirect("GestionRegional.jsp");
            }
            catch(Exception e)
            {
                System.out.println("ERROR EN LA TRANSACCIÓN " + e);
                response.sendRedirect("GestionRegional.jsp");
            }
        }
        
        else if(request.getParameter("btnConsultar") != null)
        {
            try
            {
                ResultSet resultadoconexion;
                Regional objRegional = new Regional();
                resultadoconexion = objRegional.ConsultarRegional(Integer.parseInt(request.getParameter("txtnregional")));
                while(resultadoconexion.next())
                {
                    String gnregional = request.getParameter("txtnregional");
                    String gzonaregional = resultadoconexion.getString("zona_regional");
                    String gnombreregional = resultadoconexion.getString("nombre_regional");
                    String gnombredirectorregional = resultadoconexion.getString("nombre_director_regional");
                    String gdireccionregional = resultadoconexion.getString("direccion_regional");
                    String gtelefonoregional = resultadoconexion.getString("telefono_regional");
                    request.setAttribute("gnregional", gnregional);
                    request.setAttribute("gzonaregional", gzonaregional);
                    request.setAttribute("gnombreregional", gnombreregional);
                    request.setAttribute("gnombredirectorregional", gnombredirectorregional);
                    request.setAttribute("gdireccionregional", gdireccionregional);
                    request.setAttribute("gtelefonoregional", gtelefonoregional);
                    RequestDispatcher rd = null;
                    rd=request.getRequestDispatcher("GestionRegional.jsp");
                    rd.forward(request, response);
                }
                response.sendRedirect("GestionalRegional.jsp");
                System.out.println("LA REGIONAL NO SE ENCUENTRA REGISTRADA.");
            }
            catch(Exception e)
            {
                System.out.println("ERROR EN LA TRANSACCIÓN: " + e);
            }
        }
        
        else
        {
            try
            {
                Regional objRegional = new Regional();
                objRegional.ModificarRegional(Integer.parseInt(request.getParameter("txtnregional")), request.getParameter("txtzonaregional"), request.getParameter("txtnombreregional"), request.getParameter("txtnombredirectorregional"), request.getParameter("txtdireccionregional"), request.getParameter("txttelefonoregional"));
                response.sendRedirect("GestionRegional.jsp");
            }
            catch(Exception e)
            {
                System.out.println("ERROR EN LA TRANSACCIÓN " + e);
                response.sendRedirect("GestionRegional.jsp");
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }// </editor-fold>

}
