<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'propiedad.label', default: 'Propiedad')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
        <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'fondo.css')}">
    </head>
    <body>
        <!-- <a href="#list-propiedad" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a> -->
        <!-- <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div> -->
        <div id="list-propiedad" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${propiedadList}" />

           <br>
           
      <div class="album py-5 bg-light">
        <div class="container">
       
       <g:each in="${listadoOferta?}"  

 

          <div class="row">
              <div class="col-md-4">
                  <div class="card mb-4 shadow-sm">
                    <img class="card-img-top" src="#acavalaimg" style="height: 225px; width: 100%; display: block;" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22348%22%20height%3D%22225%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20348%20225%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_1665675b983%20text%20%7B%20fill%3A%23eceeef%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A17pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_1665675b983%22%3E%3Crect%20width%3D%22348%22%20height%3D%22225%22%20fill%3D%22%2355595c%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%22116.7265625%22%20y%3D%22120.3%22%3EThumbnail%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true">
                    <div class="card-body">
                      <p class="card-text">${it.calle} ${it.numero} <br> $${it.precio}
                      </p>


                      <div class="d-flex justify-content-between align-items-center">
                        
                        <div class="btn-group">
                            <a href="#aconsulta"><button type="button" class="btn btn-sm btn-outline-secondary">Consultar</button></a>             
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