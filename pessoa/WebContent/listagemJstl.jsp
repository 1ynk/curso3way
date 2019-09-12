<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de Pessoas</title>
</head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<body>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>NOME</th>
				<th>ID</th>
				<th>IDADE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.listarPessoas}" var="pessoa">
				<tr>
					<td><c:out value="${pessoa.nome }"></c:out></td>
					<td><c:out value="${pessoa.id }"></c:out></td>
					<td><c:out value="${pessoa.idade }"></c:out></td>
				</tr>
			</c:forEach>
			</tbody>
	</table>
</body>
</html>