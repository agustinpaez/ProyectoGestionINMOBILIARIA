<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="admin" />
        <g:set var="entityName" value="${message(code: 'cliente.label', default: 'Cliente')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
        <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'portada.css')}">
        <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'bootstrap.css')}">
        <link rel="stylesheet" href="${resource(dir:'stylesheet', file:'forms.css')}">

    </head>
    <body>
       <!--  <a href="#create-cliente" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="create-cliente" class="content scaffold-create" role="main">
            <h1><g:message code="default.create.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.cliente}">
            <ul class="errors" role="alert">
                <g:eachError bean="${this.cliente}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
            </g:hasErrors>-->

       <!--      <div class="container">
                <g:form resource="${this.cliente}" method="POST">
                    <fieldset class="form-control">
                        <f:all bean="cliente"/>
                    </fieldset>
                    <fieldset class="buttons">
                        <g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                    </fieldset>
                </g:form>
            </div>
        </div> -->
        <div class="row">
            <div class="col-md-3">
                
            </div>
             <div class="col-md-6">
                 <br>
                    <h1 class="text-center" align="text-center">REGISTRO DE CLIENTE</h1><br>
                    <div class="row">
                        <g:hasErrors bean="${this.cliente}">
                        <ul class="errors" role="alert">
                            <g:eachError bean="${this.cliente}" var="error">
                            <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                            </g:eachError>
                        </ul>
                        </g:hasErrors>
                        <div class="col-md-2">
                            
                        </div>
                        <div class="col-md-8">
                            <g:form resource="${this.cliente}" method="POST">
                            <fieldset class="form">
                                <f:all bean="cliente"/>
                                <g:submitButton name="create" class="save" class="btn btn-primary" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                            </fieldset>     
                        </g:form>
                        </div>
            <div class="col-md-2">
                
            </div>
            
        </div>
            </div>
             <div class="col-md-3">
                
            </div>
            
        </div>

        <br>
        <h1 class="text-center" align="text-center">REGISTRO DE CLIENTE</h1><br>
        <div class="row">
            <g:hasErrors bean="${this.cliente}">
            <ul class="errors" role="alert">
                <g:eachError bean="${this.cliente}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
            </g:hasErrors>
            <div class="col-md-3">
                
            </div>
            <div class="col-md-6">
                <g:form resource="${this.cliente}" method="POST">
                <fieldset class="form">
                    <f:all bean="cliente"/>
                    <g:submitButton name="create" class="save" class="btn btn-primary" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                </fieldset>     
            </g:form>
            </div>
            <div class="col-md-3">
                
            </div>
            
        </div>
    </body>
</html>
