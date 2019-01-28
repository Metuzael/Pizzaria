<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pedidos</title>
<style>
	
</style>
</head>
<body>
<c:import url="../menu.jsp"></c:import>

		<h1>Lista de Pedidos:</h1>

	<table border="4" align="center">
		<thead>
			<tr>
				<th>Id</th>
				<th>Cliente</th>
				<th>Pizza</th>
				<th>Quantidade</th>
				<th>Endereço para Entrega</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pedido" items="${pedidos }">
				<tr>
					<td>${pedido.id }</td>
					<td>${pedido.clientes.nome }</td>
					<td>${pedido.cardapio.pizza }</td>
					<td>${pedido.quantidade }</td>
					<td>${pedido.endereco }</td>
				    <td><a href="/Pizzaria/pedidos/remover?id=${pedido.id}">Cancelar Pedidos</a></td>
				</tr>
			</c:forEach>
       
		</tbody>
    
	</table>
</body>
</html>