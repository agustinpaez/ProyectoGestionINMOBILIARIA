<!doctype html>
<html>
<head>
    <meta name="layout" content="main" />
    <meta name="layout" content="text/html; charset=UTF-8"/>
    <title>Ingresar</title>
    <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'estilo.css')}">
    <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'bootstrap.css')}">
</head>
<body>
    <div class="container">
    <g:if test="${message}">
      <div class="message" role="status">${message}</div>
    </g:if>
      <br><br><br><br><br>
      <div class="row">
        <div class="col-md-3">
          
        </div>
        <div class="col-md-6">
          <h1 class="text-center">Iniciar Sesion</h1>
          <g:form controller="ingresar" action="ingresar" method="post">
              <label for='email'>Ingrese su Email registrado:</label>
              <input type='email' id='email' name='email' class="form-control" required/>
              <br><br>
              <label for='password'>Ingrese su Contraseña:</label>
              <input type="password" id='password' name='password' class="form-control" required/>
              <br><br>
              <input type="submit" value="Ingresar" class="btn btn-prymary" />
          </g:form>
        </div>
        <div class="col-md-3">
          
        </div>
      </div>
    </div>

</body>
</html>
