package pizzaria.controles;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pizzaria.daos.ClienteDAO;
import pizzaria.modelos.Cliente;

@Controller
public class ClienteControles {

	@RequestMapping("/clientes/form")
	public String form() {
		System.out.println("Chamou meu método de formulário");
		return "clientes/form";
	}
	
	@PostMapping("/clientes")
	public String adicionar(Cliente cliente) {
		System.out.println("Chamou o método de adicionar");
		System.out.println(cliente);
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.inserir(cliente);
		return "redirect:clientes/";
	}
	
	@GetMapping("/clientes")
	public ModelAndView listar() {
		System.out.println("Chamou método de listagem");
		ClienteDAO ClienteDAO = new ClienteDAO();
		List<Cliente> lista = ClienteDAO.getLista();
		ModelAndView model = new ModelAndView("clientes/lista");
		model.addObject("clientes", lista);
		return model;
	}
	
	@RequestMapping("/clientes/remover")
	public String remover(Cliente cliente) {
		System.out.println("Chamou o método remover.");
		ClienteDAO ClienteDAO = new ClienteDAO();
		ClienteDAO.remover(cliente);
		
		return "redirect:../clientes";
	}
	
	@RequestMapping("clientes/selecionar")
	public ModelAndView selecionar(Cliente cliente) {
		ClienteDAO clienteDAO = new ClienteDAO();
		cliente = clienteDAO.getById1(cliente.getId());
		
		ModelAndView model = new ModelAndView("clientes/AlterarClientes");
		model.addObject("cliente", cliente);
		return model;
	}
	@RequestMapping ("clientes/alterar")
	public String alterar(Cliente cliente) {
		System.out.println("Chamou o metodo alterar");
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.alterar(cliente);
		
		return "redirect:../clientes";
}
}
