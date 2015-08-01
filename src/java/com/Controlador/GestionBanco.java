/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controlador;

import com.Modelo.Banco;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DANIELTS
 */
@WebServlet(name = "GestionBanco", urlPatterns = {"/GestionBanco"})
public class GestionBanco extends HttpServlet 
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
            out.println("<title>Servlet GestionBanco</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GestionBanco at " + request.getContextPath() + "</h1>");
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
                Banco objBanco = new Banco();
                objBanco.RegistrarBanco(Integer.parseInt(request.getParameter("txtidbanco")), request.getParameter("txtnombrebanco"));
                response.sendRedirect("GestionBanco.jsp");
            }
            catch(Exception e)
            {
                System.out.println("ERROR EN LA TRANSACCIÓN " + e);
                response.sendRedirect("GestionBanco.jsp");
            }
        }
        
        else if(request.getParameter("btnConsultar") != null)
        {
            try
            {
                ResultSet resultadoconexion;
                Banco objBanco = new Banco();
                resultadoconexion = objBanco.ConsultarBanco(Integer.parseInt(request.getParameter("txtidbanco")));
                while(resultadoconexion.next())
                {
                    String gidbanco = request.getParameter("txtidbanco");
                    String gnombrebanco = resultadoconexion.getString("nombre_banco");
                    request.setAttribute("gidbanco", gidbanco);
                    request.setAttribute("gnombrebanco", gnombrebanco);
                    RequestDispatcher rd = null;
                    rd=request.getRequestDispatcher("GestionBanco.jsp");
                    rd.forward(request, response);
                }
                response.sendRedirect("GestionBanco.jsp");
                System.out.println("EL BANCO NO SE ENCUENTRA REGISTRADO.");
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
                Banco objBanco = new Banco();
                objBanco.ModificarBanco(Integer.parseInt(request.getParameter("txtidbanco")), request.getParameter("txtnombrebanco"));
                response.sendRedirect("GestionBanco.jsp");
            }
            catch(Exception e)
            {
                System.out.println("ERROR EN LA TRANSACCIÓN " + e);
                response.sendRedirect("GestionBanco.jsp");
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
