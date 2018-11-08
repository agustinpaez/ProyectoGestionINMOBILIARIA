<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="nav" />
        <g:set var="entityName" value="${message(code: 'operador.label', default: 'Operador')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
        <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'portada.css')}">
    </head>
    <body>
        <!-- <a href="#list-operador" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div> -->
        <div id="list-operador" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${operadorList}" />

            <div class="pagination">
                <g:paginate total="${operadorCount ?: 0}" />
            </div>
        </div>
    </body>
</html>