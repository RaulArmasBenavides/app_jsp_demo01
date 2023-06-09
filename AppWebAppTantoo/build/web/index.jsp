<!DOCTYPE>
<html>
    <head>
        <title>Sistema de Inventario BODEGA TANTOO</title>
        <!-- Include one of jTable styles. -->
        <link href="css/metro/blue/jtable.css" rel="stylesheet" type="text/css" />
        <link href="css/jquery-ui-1.10.3.custom.css" rel="stylesheet" type="text/css" />
        <!-- Include jTable script file. -->
        <script src="js/jquery-1.8.2.js" type="text/javascript"></script>
        <script src="js/jquery-ui-1.10.3.custom.js" type="text/javascript"></script>
        <script src="js/jquery.jtable.js" type="text/javascript"></script>

        <script type="text/javascript">
            $(document).ready(function () {
                $('#StudentTableContainer').jtable({
                    title: 'Lista de Productos',
                    actions: {
                        listAction: 'Controller?action=list',
                        createAction: 'Controller?action=create',
                        updateAction: 'Controller?action=update',
                        deleteAction: 'Controller?action=delete'
                    },
                    fields: {
                         IdProducto: {
                            title: 'ProductoId',
                            width: '30%',
                            key: true,
                            list: true,
                            edit: false,
                            create: true
                        },
                        NombreProducto: {
                            title: 'NombreProducto',
                            width: '30%',
                            edit: true
                        },
                        IdProveedor: {
                            title: 'idProveedor',
                            width: '30%',
                            edit: true
                        },
                        IdCategoria: {
                            title: 'IdCategor�a',
                            width: '20%',
                            edit: true
                        }
                    }
                });
                $('#StudentTableContainer').jtable('load');
            });
                   
        </script>

    </head>
    <body>
        <div style="width: 80%; margin-right: 10%; margin-left: 10%; text-align: center;">

            <h4>Sistema de Inventario BODEGA TANTOO</h4>
            <div id="StudentTableContainer"></div>
        </div>
    </body>
</html>