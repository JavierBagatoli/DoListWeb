<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>CrearTarea</title>
      <link rel="preconnect" href="https://fonts.googleapis.com">
      <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
      <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,600;0,800;1,900&display=swap" rel="stylesheet">
  </head>

  <body>
    <div class="hola">
      <h1>hola Crear Tarea</h1>
      <form action="../SvTareaAlta" method="POST">
          <input type="text" name="nombre" placeholder="nombre">
          <input type="text" name="descripcion" placeholder="descripcion">
          <label>fecha caducidad</label>
          <input type="date" name="fechaCaducidad">
          <input type="submit">
      </form>
    </div>

    







  </body>




</html>
