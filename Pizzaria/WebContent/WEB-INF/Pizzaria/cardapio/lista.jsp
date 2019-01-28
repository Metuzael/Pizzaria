<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cardápio</title>
<style type="text/css">

#container {
 	position: absolute;
    top: 50%;
    left: 50%;
    width: 45%;
    transform: translateY(-50%) translateX(-50%);
	center;
	border-radius: 5px;
	background-color: #ccc;
	padding: 20px;
}

</style>
</head>
<body>
<c:import url= "../menu.jsp"></c:import>
<div class="container">
<div align="center">
<h1>Cardapio Pizzaria M&E</h1>
		

	<table border="4" align="center">
		<thead>
			<tr>
				
				<th>Id</th>
				<th>Pizza</th>
				<th>Descricao</th>
				<th>Tamanho</th>
				<th>Preço</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cardapio" items="${cardapio }">
				<tr>
					<td>${cardapio.id }</td>
					<td>${cardapio.pizza }</td>
					<td>${cardapio.descricao }</td>
					<td>${cardapio.tamanho }</td>
					<td>${cardapio.preco }</td>
					
				</tr>
			</c:forEach>

		</tbody>

	</table>
	</div>
	</div>
</body>
</html>