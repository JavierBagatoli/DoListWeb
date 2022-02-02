<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persona Alta</title>
        <link rel="stylesheet" href="./styles/Alt.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,600;0,800;1,900&display=swap" rel="stylesheet">

    </head>
    <body>

      <div class="container">

        <img src="../src/Images/alt-main.png" alt="alt-image">

        <div class="alt">

          <h1>Registrate!</h1>

          <br><br>

          <div class="alt-container">
            <form action="../SvPersonaAlta" method="POST">
              <input required type="text" id="nombrePersona" name="nombrePersona" placeholder="Nombre">
              <br><br>
              <input required type="text" id="apellidoPersona" name="apellidoPersona" placeholder="Apellido">
              <br><br>
              <input required type="password" id="passwordPersona" name="passwordPersona" placeholder="Password">
              <br><br>
              <input required type="date" id="nacimientoPersona" name="nacimientoPersona">
              <button type="submit">Submit</button>
            </form>
          </div>

          <div class="login">
            <h3>Ya tienes cuenta? <a href="./PersonaLogin.html">Ingresa!</a></h3>
          </div>

        </div>


      </div>

   
</body>
</html>
