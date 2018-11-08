<!doctype html>
<html lang="en" class="no-js">
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
     <style>
        #logo{
          width:50px;
          height:50px;
          border-radius:50px;
        }

         a{
            padding-left: 2px;
            color: white;
            text-decoration: none;
        }

        .navbar{
            list-style:none;
        }

      </style>
    <g:layoutHead/>
</head>

<body id="cuerpo">

    <nav class="navbar navbar-expand navbar-dark bg-dark">
        <a class="navbar-brand" href="${createLink(uri: '/')}"><img id="logo" src="https://www.termasentrerios.com/wp-content/uploads/2018/01/casa.jpg"><g:link controller="propiedad" action="indexPrincipal" ></g:link></a>
                  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"><i class="fa fa-bars" aria-hidden="true"></i></span>
                  </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">

                    <!--      <li class="nav-item">
                        <a class="nav-link"><g:link controller="propiedad" action="oferta" >Propiedades en OFERTAS</g:link></a>
                      </li>
                      
                      <li class="nav-item">
                        <a class="nav-link"><g:link controller="propiedad" action="venta" >Propiedades en Venta</g:link></a>
                      </li>

                      <li class="nav-item">
                        <a class="nav-link"><g:link controller="propiedad" action="alquiler" >Propiedades en Alquiler</g:link></a>
                      </li>
                      
                      <li class="nav-item">
                        <a class="nav-link"><g:link controller="consulta" action="consultar" >Preguntas Frecuentes</g:link></a>
                      </li> -->
                        <a class="nav-link"><g:link controller="propiedad" action="oferta" >OFERTAS</g:link></a>
                

                <li class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle active" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Propiedades</a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="nav-link"><g:link controller="propiedad" action="venta" >Propiedades en Venta</g:link></a>
                        <a class="nav-link"><g:link controller="propiedad" action="alquiler" >Propiedades en Alquiler</g:link></a>
                    </div>
                </li>
                        <a class="nav-link"><g:link controller="consulta" action="consultar" >Preguntas Frecuentes</g:link></a>
              
            </ul>

            <g:form action="#" method="post" class="form-inline my-2 mylg-0">
                <input type="search" name="buscar" id="buscar" class="form-control mr-sm-2" placeholder="Buscar..." aria-label="Buscar">
                <button class="btn btn-outline-success" type="submit">Buscar</button>
            </g:form>
        </div>
    </nav>

    <g:layoutBody/>

    <!-- <div class="footer" role="contentinfo">
    </div> -->

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>
    <asset:javascript src="application.js"/>

</body>
</html>