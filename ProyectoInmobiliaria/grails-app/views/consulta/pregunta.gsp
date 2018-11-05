<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'consulta.label', default: 'Consulta')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div id="list-consulta" class="content scaffold-list" role="main">
            <h1>Preguntas Frecuentes:</h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${consultaList}" />

            <div class="pagination">
                <g:paginate total="${consultaCount ?: 0}" />
            </div>
        </div>
    </body>
</html>