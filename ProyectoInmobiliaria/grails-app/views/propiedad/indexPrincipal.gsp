<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'propiedad.label', default: 'Propiedad')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <!-- <a href="#list-propiedad" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a> -->
        <!-- <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div> -->
        <%-- <div id="list-propiedad" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${propiedadList}" /> --%>

           <br>
           
      
      <div class="album py-5 bg-light">
        <div class="container">
       
       <g:each in="${listadoTodo?}"  

 

          <div class="row">
              <div class="col-md-4">
                  <div class="card mb-4 shadow-sm">
                    <img class="card-img-top" src=${createLink(controller:"propiedad", action:"verImagen", id:"${it.id}")} style="height: 225px; width: 100%; display: block;" data-holder-rendered="true">
                    <div class="card-body">
                      <p class="card-text">Direccion:${it.calle} ${it.numero} 
                    
                    <br> Localidad: ${it.localidad}
                    <%-- <br> Ciudad: ${it.ciudad} --%>
                    <br>  
                    <br> Precio: $${it.precio}
                      </p>


                      <div class="d-flex justify-content-between align-items-center">
                        
                        <div class="btn-group">
                            <button type="button" class="btn btn-sm btn-outline-secondary"><g:link controller="consulta" action="consultar">Consultar</g:link></button>             
                        </div>

                    
                      </div>
                    </div>
                  </div>
                </div>
           
       </g:each>
        </div>
        </div>


        </div>
    </body>
</html>