<%@page import="java.util.List"%>
<%@page import="Logica.Tarea"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Princial</title>
        <link rel="stylesheet" type="text/css" href="./styles/index.css" media="screen" />
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,600;0,800;1,900&display=swap" rel="stylesheet">
    </head>
    <body>

      <nav>
        <h2>Navbar</h2>
        <button>hola</button>
        <button>hola</button>

      </nav>

      <header>
        <h1>Inventa el nombre!</h1>
      </header>

      <div class="container">

        <div class="choose-cont">

          <h2>Choose One</h2>

          <div class="choose-input">

            <!-- Cambiar html por jsp -->
            <form action="./Tareas/CrearTarea.html">
              <input type="image" src="./src/Images/icon-navbar.png" alt="crearTarea">
            </form>

            <form action="./Tareas/TodasLasTareas.html">
              <input type="image" src="./src/Images/icon-navbar.png" alt="todasTareas">
            </form>


          </div>




        </div>

        <div class="tasks-cont">
          
          <div class="tasks">
            <%
                Controladora control = new Controladora();
                List<Tarea> tareaLista = control.tareaMostrar();
                int i = 0;
                for(Tarea tarea : tareaLista){
                    i++;
                    if (i > 2){break;}
                
            %>
            ///////////MODIFICAS ESTO DE ACA
            <p><%=tarea.getNombre() %></p>
            /////////////HASTA ACA
            <%} %>
          </div>


        </div>




      </div>

</body>
</html> 

