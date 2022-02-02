/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet.Tarea;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JavW11trial
 */
@WebServlet(name = "SvTareaAlta", urlPatterns = {"/SvTareaAlta"})
public class SvTareaAlta extends HttpServlet {

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
        processRequest(request, response);
        String nombreTarea = request.getParameter("nombre");
        String descripcionTarea = request.getParameter("descripcion");
        Date fechaCaducidad = new Date();
        try{
            fechaCaducidad = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fechaCaducidad"));
        }catch(ParseException e){}
        
        control.tareaAlta(nombreTarea, descripcionTarea, fechaCaducidad);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
