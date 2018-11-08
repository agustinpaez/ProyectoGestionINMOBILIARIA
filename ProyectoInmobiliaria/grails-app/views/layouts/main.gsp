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
            min-height:50px !important;
        }
       
        a{
            padding-left: 2px;
            color: #000000;
            text-decoration: none;
        }
        .navbar-default a{
            color: black;
        }

        li{
            font-size: 12px;
            padding-top: 20px;
            padding-right: 20px;
        }

        .footer {
            font-size: 15px;
            font-weight: bold;
        }


        }
       #logo{
          width:35px;
          height:35px;
          border-radius:35px;
        }

        #login{
          margin-left: 100px
        }

        footer{
          background-color: blue;
          width: 100%;
          height: 40px;
          border-top: 2px solid #000;
          position: absolute;
          bottom: 0;
          margin-bottom: 0px;
          color: white;
        }

    </style>

    <g:layoutHead/>
</head>

<body id="cuerpo">

     <nav class="navbar navbar-expand-md fixed-top top-nav" style="background-color: blue">
            <div class="container">
                  <a class="navbar-brand" href="${createLink(uri: '/')}"><img id="logo" class="img-circle" height="50%" width="50%" src="https://www.termasentrerios.com/wp-content/uploads/2018/01/casa.jpg"><g:link controller="propiedad" action="indexPrincipal" ></g:link></a>
                  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"><i class="fa fa-bars" aria-hidden="true"></i></span>
                  </button>

                  <div class="collapse navbar-collapse" id="navbarSupportedContent" >
                    <ul class="navbar-nav ml-auto">

                      <li class="nav-item">
                        <g:link controller="propiedad" action="oferta" >Propiedades en Oferta</g:link>
                      </li>
                      
                      <li class="nav-item">
                       <g:link controller="propiedad" action="venta" >Propiedades en Venta</g:link>
                      </li>

                      <li class="nav-item">
                        <g:link controller="propiedad" action="alquiler" >Propiedades en Alquiler</g:link>
                      </li>
                      
                      <li class="nav-item">
                       <g:link controller="consulta" action="consultar">Preguntas Frecuentes</g:link>
                      </li>
                     <g:form action="#" method="post" class="form-inline my-2 mylg-0">
                          <input type="search" name="buscar" id="buscar" class="form-control mr-sm-2" placeholder="Buscar..." aria-label="Buscar">
                          <button class="btn btn-primary" type="submit">Buscar</button>
                      </g:form>
                      <li class="nav-item navbar-right" id="login">
                        <g:link controller="ingresar" action="ingresar">Ingresar</g:link>
                      </li>
                    </ul>
                  </div>    
            </div>
        </nav>

    <g:layoutBody/>

    <footer class="page-footer font-small blue">

      <!-- Copyright -->
      <div class="footer-copyright text-center py-3">© 2018 Copyright: Facultad de Tecnologia y Ciencias Aplicadas - Programacion III
      </div>
      <!-- Copyright -->

    </footer>

   <!--  <div class="footer" role="contentinfo">
    </div> -->

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>
    <asset:javascript src="application.js"/>

</body>
</html>