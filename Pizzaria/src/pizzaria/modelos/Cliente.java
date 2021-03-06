package pizzaria.modelos;

public class Cliente {
	
	private Long id;
	private String nome;
	private String telefone;
	private String cpf;
	private String endereco;
	
	@Override
	public String toString() {
		return "clientes [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", endereco=" + endereco 
				+ "]";
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
