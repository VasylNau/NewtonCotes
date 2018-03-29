<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Методи проектування</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
    <link rel="stylesheet" type="text/css" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/common.css"/>" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/lab-two-res.css"/>">

</head>

<body>
    <jsp:include page="header.jsp" />
    
    <main class="container-fluid">
    	<c:if test="${not empty error}">
        	<div class="block-container">
	        	<c:out value="${error }"/>
	        </div>
		</c:if>
		<c:if test="${empty error}">
			<div class="parent">
				<h3>
					Результати обчислень
				</h3>
				<div class="block-container">
					<table class="table table-responsive">
                        <tr>
                            <td>Функція</td>
                            <td><c:out value="${result.function}"/></td>
                        </tr>
                        <tr>
                            <td>Проміжок</td>
                            <td><c:out value="${result.startPoint} ; ${result.endPoint}"/></td>
                        </tr>
                        <tr>
                            <td>Результат</td>
                            <td><c:out value="${result.result}"/></td>
                        </tr>
                    </table>
				</div>
				
			</div>

		</c:if>
    </main>

	<script src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>
    <script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>

</body>
</html>
