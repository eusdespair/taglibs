<%@taglib uri="/WEB-INF/tlds/tags" prefix="ex" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de Taglibs personalizados</title>
    </head>
    <body>
        <h1>Ejemplo de Taglibs personalizados</h1>
        <ex:welcome/>
        <br>
        <ex:upperCase>
            esto esta en minusculas pero, pasara a mayusculas.
        </ex:upperCase>
    </body>
</html>
