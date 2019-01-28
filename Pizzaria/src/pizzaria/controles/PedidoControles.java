package pizzaria.controles;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pizzaria.daos.CardapioDAO;
import pizzaria.daos.ClienteDAO;
import pizzaria.daos.PedidoDAO;
import pizzaria.modelos.Cardapio;
import pizzaria.modelos.Cliente;
import pizzaria.modelos.Pedido;

@Controller
public class PedidoControles {

	@RequestMapping("/pedidos/formarPedidos")
	public ModelAndView form() {
		System.out.println("Chamou o meu método");
		ClienteDAO clienteDao = new ClienteDAO();
		List<Cliente> listaC = clienteDao.getLista();

		CardapioDAO cardapioDao = new CardapioDAO();
		Cardapio listaCA = cardapioDao.getPizza();

		ModelAndView model = new ModelAndView("pedidos/formarPedidos");

		model.addObject("clientes", listaC);
		model.addObject("cardapio", listaCA);

		return model;

	}
	
	@PostMapping("/pedidos")
	public String adicionar(Pedido pedido) throws SQLException {
		System.out.println("Chamou o método de adicionar");
		PedidoDAO pedidoDAO = new PedidoDAO();
		
		System.out.println(pedido.getCliente());
		System.out.println(pedido.getCardapio());
		System.out.println(pedido.getQuantidade());
		System.out.println(pedido.getEndereco());
		
	    pedidoDAO.inserir(pedido);
				return "redirect:pedidos/";
	}
	
	
	@GetMapping("/pedidos")
	public ModelAndView listar() {
		System.out.println("Chamou o metódo de listagem");
		PedidoDAO pedidoDao = new PedidoDAO();
		List<Pedido> lista = pedidoDao.getLista();
		ModelAndView model = new ModelAndView("pedidos/listarPedidos");
		model.addObject("pedidos", lista);
		return model;
	}
	
	@RequestMapping("/pedidos/remover")
	public String remover(Pedido pedido) {
		System.out.println("Chamou o método remover");
		PedidoDAO pedidoDao = new PedidoDAO();
		pedidoDao.remover(pedido);
		return "redirect:../pedidos";

	}
}
