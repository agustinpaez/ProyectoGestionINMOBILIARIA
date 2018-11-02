<!doctype html>
<html>
<head>
    <meta name="layout" content="main" />
      <!-- <g:set var="entityName" value="${message(code: 'cliente.label', default: 'Cliente')}" /> -->
      <title>LOGIN</title>
      <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'estilo.css')}">
      <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'bootstrap.css')}">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
      <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
      <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
  <br><br><br><br><br><br><br>
      <h1>INGRESAR</h1>
      <g:form  controler="cliente" action="login" method="POST">
          <label for='email'>Ingrese su Email</label>
          <input type='email' id='email' name='email' required/>
          <br><br>
          <label for='password'>Ingrese su Contraseña:</label>
          <input type="password" id='password' name='password' required/>
          <br><br>
          <input type="submit" class="btn btn-primary" value="Login"/>
      </g:form>
</body>
</html>