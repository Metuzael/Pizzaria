package pizzaria.modelos;

public class Cardapio {
	
    private Long id;
	private String pizza;
	private String descricao;
	private String tamanho;
	private Double preco;
	
	@Override
	public String toString() {
		return "cardapio [id=" + id + ", pizza=" + pizza + ", descricao=" + descricao + ", tamanho=" + tamanho + ", preco=" + preco 
				+ "]";
	}
	
	public Long getId () {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getPizza() {
		return pizza;
	}
	public void setPizza(String pizza) {
		this.pizza = pizza;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
