package pizzaria.controles;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pizzaria.daos.CardapioDAO;
import pizzaria.modelos.Cardapio;


@Controller
public class CardapioControles {

	@RequestMapping("/cardapio/form")
	public String form() {
		System.out.println("Chamou meu método de formulário");
		return "cardapio/form";
	}
	
	@PostMapping("/cardapio")
	public String adicionar(Cardapio cardapio) {
		System.out.println("Chamou o método de adicionar");
		System.out.println(cardapio);
		CardapioDAO cardapioDAO = new CardapioDAO();
		cardapioDAO.inserir(cardapio);
		return "redirect:cardapio/";
	}
	
	@GetMapping("/cardapio")
	public ModelAndView listar() {
		System.out.println("Chamou método de listagem");
		CardapioDAO CardapioDAO = new CardapioDAO();
		List<Cardapio> lista = CardapioDAO.getLista();
		ModelAndView model = new ModelAndView("cardapio/lista");
		model.addObject("cardapio", lista);
		return model;
	}
	
	@RequestMapping("/cardapio/remover")
	public String remover(Cardapio cardapio) {
		System.out.println("Chamou o método remover.");
		CardapioDAO CardapioDAO = new CardapioDAO();
		CardapioDAO.remover(cardapio);
		
		return "redirect:../cardapio";
	}
}
