<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>Inmobiliaria</title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <asset:stylesheet src="application.css"/>
    <style>

        .navbar{
            padding-top:0px !important; padding-bottom:0 !important;
            height:70px !important;
        }

        a{
            padding-left: 2px;
            color: #000000;
            text-decoration: none;
            text-decoration: none;
        }
        .navbar-default a{
            color: black;
        }


        li{
            margin-top: 10px;
            padding-right: 25px;
            text-decoration: none;
        }

        .footer {
            font-size: 15px;
            font-weight: bold;
            text-decoration: none;
        }

        .navbar{
            list-style:none;
            text-decoration: none;
        }
         #logo{
          margin-top: 2px;
          width:50px;
          height:50px;
          border-radius:35px;
        }

        #login{
          margin-left: 200px
        }

        footer{
          background-color: black;
          width: 100%;
          height: 40px;
          border-top: 2px solid #000;
          position: absolute;
          bottom: 0;
          margin-bottom: 0px;
        }

    </style>

    <g:layoutHead/>
</head>

<body id="cuerpo">

     <nav class="navbar navbar-expand-md fixed-top top-nav" style="background-color: black">
            <div class="container">
                  <g:link controller="cliente" action="portada" >
                  <a class="navbar-brand" href="#"><img id="logo" class="img-circle" src="https://www.termasentrerios.com/wp-content/uploads/2018/01/casa.jpg"></a>
                  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"><i class="fa fa-bars" aria-hidden="true"></i></span>
                  </button>
                  </g:link>

                  <div class="collapse navbar-collapse" id="navbarSupportedContent" >
                    <ul class="navbar-nav ml-auto">
                      <li class="nav-item">
                        <g:link controller="cliente" action="portada" >PRINCIPAL</g:link>
                      </li>
                      <li class="dropdown" >
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">PROPIEDADES<span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><g:link controller="propiedad" action="index" >Listar Propiedades</g:link></li>
                            <li><g:link controller="propiedad" action="create">Incorporar propiedad</g:link></li>
                        </ul>
                      </li>
                      <li class="dropdown" >
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">CLIENTES<span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><g:link controller="cliente" action="listar" >Listar Clientes</g:link></li>
                            <li><g:link controller="cliente" action="create">Incorporar Cliente</g:link></li>
                        </ul>
                      </li>
                      <li class="dropdown" >
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">USUARIOS<span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><g:link controller="usuario" action="index" >Listar Usuarios</g:link></li>
                            <li><g:link controller="usuario" action="create">Incorporar Usuario</g:link></li>
                        </ul>
                      </li>
                       <li class="nav-item">
                        <g:link controller="consulta" action="index" >Responder Consultas</g:link>
                      </li>
                       <li class="nav-item" id="login">
                         <g:link controller="ingresar" action="logout">CERRAR SESION</g:link>
                      </li>
                    </ul>
                  </div>    
            </div>
        </nav>

    <g:layoutBody/>

     <footer class="page-footer font-small blue">

      <div class="footer-copyright text-center py-3">© 2018 Copyright: Facultad de Tecnologia y Ciencias Aplicadas - Programacion III
      </div>


    </footer>

    <!-- <div class="footer" role="contentinfo">
    </div> -->

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>
    <asset:javascript src="application.js"/>

</body>
</html>