<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Inmobiliaria</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../assets/stylesheets/estilo.css">
</head>
<<<<<<< HEAD


<body>
=======
<body id="principal">
>>>>>>> d70f7b93ea6af91554f9a50ab4a5d4c5378d60ad

   

   <br><br><br><br><br>
            <div id="controllers" role="navigation">
                <h2>Controladores Disponibles</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                </ul>
            </div>
        </section>
    </div>

</body>
</html>
