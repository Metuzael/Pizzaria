<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fazer Pedido</title>
<style>

body {
	background-image: url("http://midias.gazetaonline.com.br/_midias/jpg/2016/11/21/pizza_site_or-4723742.jpg");
    background-repeat: no-repeat;
	background-size: 1366px 655px;
	background-color: #2E8B57;
}
* {
	box-sizing: border-box;
}
input[type=text], select, textarea {
	width: 70%;
	padding: 12px;
	border: 1px solid #B22222;
	border-radius: 5px;
	resize: vertical;
}
input[type=password], select, textarea {
	width: 70%;
	padding: 12px;
	border: 1px solid DarkCyan;
	border-radius: 5px;
	resize: vertical;
}
label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}
input[type=submit] {
	background-color: #B22222;
	color: white;
	padding: 10px 10px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: right;
	margin-top: 8px;
	
}
input[type=submit]:hover {
	background-color: DarkCyan;
}
.container {
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
.centralizado {
	text-align: left;
	margin: 0 auto;
}
.col-25 {
	float: left;
	width: 25%;
	margin-top: 8px;
	margin-left: 1px;
}
.col-75 {
	float: left;
	width: 30%;
	margin-top: 5px;
}
.col-76 {
	float: left;
	width: 15%;
	margin-top: 5px;
}
.row:after {
	content: "";
	display: table;
	clear: both;
}
@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
	
}
<style>
body {
  font-family: Arial;
}
* {
  box-sizing: border-box;
}
form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid DarkCyan;
  float: left;
  width: 80%;
  background: #B22222;
}
form.example button {
  float: right;
  width: 30%;
  padding: 10px;
  background: DarkCyan;
  color: white;
  font-size: 17px;
  border: 1px solid DarkCyan;
  border-left: none;
  cursor: pointer;
}
form.example button:hover {
  background: DarkCyan;
}
form.example::after {
  content: "";
  clear: both;
  display: table;
}
  
</style>
</head>
<body>
<c:import url="../menu.jsp"></c:import>
    
    <div class="container">
       <div class="centralizado">
       
	<h1>Realizar Pedido</h1>
	
	<form action="/Pizzaria/pedidos" method="post">
		<h3>
			Cliente <select name="cliente.id">
				<c:forEach var="cliente" items="${clientes }">
					<option value="${cliente.id }">${cliente.nome }</option>
				</c:forEach>
			</select>
		</h3>

		<h3>
			Pizza <select name="cardapio.id">
				<c:forEach var="cardapio" items="${cardapio }">
					<option value="${cardapio.id }">${cardapio.pizza }</option>
				</c:forEach>
			</select>
		</h3>
		
		<h3>
		  Quantidade <select name="pedido.id">
				<option value="${pedido.quantidade}" >1</option> 
  				<option value="${pedido.quantidade}" >2</option> 
 				<option value="${pedido.quantidade}" >3</option>
 				<option value="${pedido.quantidade}" >4</option>
 				<option value="${pedido.quantidade}" >5</option>
				</select>
		</h3>
		
		<h3>
		 <div class="row">
				<div class="caixa2">
					<label for="country">Entregar em:</label>
				</div>
				<div class="caixa1">
					<input type="text" id="lname" name="endereco"
						placeholder="Endereço...">
				</div>
			</div>
		</h3>
		<input type="submit" value="Fazer Pedido">
	</form>
	</div>
	</div>
</body>
</html>