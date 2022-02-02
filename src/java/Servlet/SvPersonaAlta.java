/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JavW11trial
 */
@WebServlet(name = "SvPersonaAlta", urlPatterns = {"/SvPersonaAlta"})
public class SvPersonaAlta extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombrePersona = request.getParameter("nombrePersona");
        String apellidoPersona = request.getParameter("apellidoPersona");
        String passwordPersona = request.getParameter("passwordPersona");
        Date nacimientoPersona = new Date(); 
         //En caso de fallar esta sera la fecha a guardar
        try {
            nacimientoPersona = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("nacimientoPersona"));
        } catch (ParseException ex) {
            nacimientoPersona.setTime(01/01/1950);
            Logger.getLogger(SvPersonaAlta.class.getName()).log(Level.SEVERE, null, ex);
        }
        control.personaAlta(nombrePersona, apellidoPersona, passwordPersona, nacimientoPersona);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
