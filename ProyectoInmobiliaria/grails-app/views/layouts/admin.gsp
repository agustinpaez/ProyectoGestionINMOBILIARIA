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
        a{
            padding-left: 2px;
            color: #000000;
            text-decoration: none;
        }
        .navbar-default a{
            color: black;
        }

        li{
            padding-right: 20px;
        }

        .footer {
            font-size: 15px;
            font-weight: bold;
        }

        .navbar{
            list-style:none;
        }

    </style>

    <g:layoutHead/>
</head>

<body id="cuerpo">

     <nav class="navbar navbar-expand-md fixed-top top-nav" style="background-color: blue">
            <div class="container">
                  <a class="navbar-brand" href="#"><img id="logoInm" src="https://www.termasentrerios.com/wp-content/uploads/2018/01/casa.jpg"></a>
                  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"><i class="fa fa-bars" aria-hidden="true"></i></span>
                  </button>

                  <div class="collapse navbar-collapse" id="navbarSupportedContent" >
                    <ul class="navbar-nav ml-auto">
                      <li class="nav-item">
                        <a class="nav-link" href="${createLink(uri: '/')}">Home <span class="sr-only">(current)</span></a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link"><g:link controller="propiedad" action="index" >PROPIEDADES</g:link></a>
                      </li>
                       <li class="nav-item">
                        <a class="nav-link"><g:link controller="cliente" action="index" >CLIENTES</g:link></a>
                      </li>
                       <li class="nav-item">
                        <a class="nav-link"><g:link controller="usuario" action="index" >USUARIOS</g:link></a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link"><g:link controller="usuario" action="create" >Incorporar Cliente</g:link></a>
                      </li>
                       <li class="nav-item">
                         <a class="nav-link"><g:link controller="propiedad" action="create">Incorporar propiedad</g:link></a>
                      </li>
                       <li class="nav-item">
                         <a class="nav-link"><g:link controller="ingresar" action="ingresar">INGRESAR</g:link></a>
                      </li>
                    </ul>
                  </div>    
            </div>
        </nav>

    <g:layoutBody/>

    <div class="footer" role="contentinfo">
    </div>

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>
    <asset:javascript src="application.js"/>

</body>
</html>