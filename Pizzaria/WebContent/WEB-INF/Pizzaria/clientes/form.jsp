<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Clientes</title>

<style>
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
</style>
</head>
<body>
<c:import url="../menu.jsp"></c:import>
	<div class="container">
		<h1>Cadastro</h1>
		<form action="/Pizzaria/clientes" method="post">

			<div class="row">
				<div class="caixa2">
					<label for="fname">Nome</label>
				</div>
				<div class="caixa1">
				<input type="text" id="fname" name="nome"
						placeholder=" Nome...">
				</div>
			</div>

			<div class="row">
				<div class="caixa2">
					<label for="lname">Telefone</label>
				</div>
				<div class="caixa1">
					<input type="text" id="lname" name="telefone" placeholder="Telefone...">
				</div>
			</div>

			<div class="row">
				<div class="caixa2">
					<label for="country">CPF</label>
				</div>
				<div class="caixa1">
					<input type="text" id="lname" name="cpf"
						placeholder="Digite o Cpf...">
				</div>
			</div>

			<div class="row">
				<div class="caixa2">
					<label for="country">Endereço</label>
				</div>
				<div class="caixa1">
					<input type="text" id="lname" name="endereco"
						placeholder="Endereço...">
				</div>
			</div>

			<div class="row">
				<input type="submit" value="Cadastre-se agora">
			</div>
		</form>
	</div>

</body>
</html>