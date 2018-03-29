<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Методи проектування</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" type="text/css" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/common.css"/>" >
</head>
<body>

    <jsp:include page="header.jsp"/>
    <main class="container-fluid">
        <form action="/calculate" method="post" id="input-data">
            <div class="form-group">
                <label for="function">Function:</label>
                <input type="text" class="form-control" name="function" id="function">
            </div>
            <div class="form-group">
                <label for="min">Start:</label>
                <input type="text" class="form-control" name="min" id="min">
            </div>
            <div class="form-group">
                <label for="max">End:</label>
                <input type="text" class="form-control" name="max" id="max">
            </div>

            <button class="btn btn-success" type="submit">Надіслати </button>
        </form>
    </main>

    <script src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>
    <script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>

</body>
</html>
