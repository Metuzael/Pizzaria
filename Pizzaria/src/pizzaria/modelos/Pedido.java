package pizzaria.modelos;

public class Pedido {

	private Long id;
	private Cliente cliente;
	private Cardapio cardapio;
	private int quantidade;
	private String endereco;
	
	@Override
	public String toString() {
		return " pedidos [id=" + id + ", cliente=" + cliente + ", cardapio=" + cardapio + ", quantidade=" + 
			quantidade + ", endereco=" + endereco + "]";
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
