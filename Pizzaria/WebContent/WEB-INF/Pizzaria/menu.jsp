<!DOCTYPE html>
<html>
<head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: white;
}

body {
	background-image: url("http://pastapizza.com.br/site/wp-content/uploads/2014/03/banner_site_pedepizza.jpg");
    background-repeat: no-repeat;
	background-size: 1366px 700px;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: #B22222;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: 	DarkCyan;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #B22222;
    min-width: 140px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
</head>

<ul>
  <li><a href="/Pizzaria/">Home</a></li>
  
  <li class= "dropdown">
  <a href="javascript:void(0)" class= "dropbtn">Cliente</a>
  <div class="dropdown-content">
      <a href="/Pizzaria/clientes/form">Cadastre-se </a>
      <a href="/Pizzaria/clientes/">Clientes cadastrados</a>
    </div>
  </li>
  
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Cardápio</a>
    <div class="dropdown-content">
      <a href="/Pizzaria/cardapio/">Nosso Cardápio</a>
    </div>
  </li>
 
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Pedidos</a>
    <div class="dropdown-content">
      <a href="/Pizzaria/pedidos/formarPedidos">Faça seu Pedido</a>
      <a href="/Pizzaria/pedidos/">Pedidos Realizados</a>
    </div>
  </li>
  
 </ul>


</body>
</html>
