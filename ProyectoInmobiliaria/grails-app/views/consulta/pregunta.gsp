<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'consulta.label', default: 'Consulta')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>

        <!-- <div class="row">
            <div class="col-md-3">
                
            </div>

            <div id="duda" class="col-md-6">
                <div id="create-consulta" class="content scaffold-create" role="main">
                    <g:form class="form-control" method="POST">
                        <fieldset class="form">
                            <label>Ingrese su consulta:</label>
                            <g:textArea name="pregunta" value="pregunta"/>
                            <g:submitButton name="create" class="save btn btn-primary" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                        </fieldset>
                     </g:form>
                </div>
            </div>

            <div class="col-md-3">
                
            </div>
            
        </div> -->
        

        <div id="list-consulta" class="content scaffold-list" role="main">
            <h1>Preguntas Frecuentes:</h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${consultaList}" />
        </div>
    </body>
</html>