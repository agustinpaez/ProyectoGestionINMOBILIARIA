<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'consulta.label', default: 'Consulta')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
        <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'portada.css')}">
        <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'fondo.css')}">
    </head>
    <body>
        <br>
        <div class="row">
            <div class="col-md-3">
                
            </div>

            <div id="duda" class="col-md-6">
                    <g:form controller="consulta" action="crearPregunta" method="POST">
                       
                            <label>Ingrese su consulta:</label>
                            <textarea name="pregunta" placeholder="Ingrese su consulta"></textarea>
                            <button class="btn btn-primary" type="submit">ENVIAR</button>
                        
                     </g:form>
            </div>

            <div class="col-md-3">
                
            </div>
            
        </div>


        <br>
        

        <div id="list-consulta" class="content scaffold-list" role="main">
            <h1>Preguntas:</h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${consultaList}" />
        </div>
    </body>
</html>