<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="./styles/Login.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,600;0,800;1,900&display=swap" rel="stylesheet">
    </head>
    <body>

      <div class="container">
        
        <img src="../src/Images/alt-main.png" alt="">

        <div class="login">
          <h1>Iniciar sesion</h1>
          <br><br>

          <div class="log-container">
            <form action="../SvPersonaLogin" method="POST">
              <input required type="text" placeholder="Nombre" id="nombreUsuario" name="nombreUsuario">
              <br><br>
              <input required type="password" placeholder="Password" id="passwordUsuario" name="passwordUsuario">
              <br><br>
              <button type="submit">Submit</button>
            </form>
          </div>


        </div>





      </div>


    </body>
</html>

