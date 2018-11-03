<!doctype html>
<html>
<head>
    <meta name="layout" content="text/html; charset=UTF-8"/>
    <title>Login</title>
</head>
<body>
    <div class="container">
    <g:if test="${message}">
      <div class="message" role="status">${message}</div>
    </g:if>
    
      <h1>Login de Usuario</h1>
      <g:form controller="ingresar" action="ingresar" method="post">
          <label for='email'>Ingrese su Email registrado:</label>
          <input type='email' id='email' name='email' required/>
          <br><br>
          <label for='password'>Ingrese su Contraseña:</label>
          <input type="password" id='password' name='password' required/>
          <br><br>
          <input type="submit" value="Ingresar"/>
      </g:form>
    </div>

</body>
</html>
