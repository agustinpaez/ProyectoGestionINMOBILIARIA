<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="admin" />
        <g:set var="entityName" value="${message(code: 'cliente.label', default: 'cliente')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
        <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'portada.css')}">
    </head>
    <body>
        <br>       
        <div id="list-cliente" class="content scaffold-list" role="main">
            <h1>Clientes Registrados</h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${clienteList}" />
        </div>
    </body>
</html>