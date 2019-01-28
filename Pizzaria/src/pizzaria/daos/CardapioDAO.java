package pizzaria.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pizzaria.modelos.Cardapio;

public class CardapioDAO {

	private Connection connection;

	public CardapioDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir(Cardapio cardapio) {

		String sql = "insert into cardapio (pizza, descricao, tamanho, preco) values (?, ?, ?, ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, cardapio.getPizza());
			stmt.setString(2, cardapio.getDescricao());
			stmt.setString(3, cardapio.getTamanho());
			stmt.setDouble(4, cardapio.getPreco());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public List<Cardapio> getLista() {
		List<Cardapio> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from cardapio;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Cardapio cardapio = new Cardapio();
				cardapio.setId(rs.getLong("id"));
				cardapio.setPizza(rs.getString("pizza"));
				cardapio.setDescricao(rs.getString("descricao"));
				cardapio.setTamanho(rs.getString("tamanho"));
				cardapio.setPreco(rs.getDouble("preco"));

				result.add(cardapio);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public boolean alterar(Cardapio cardapio) {
		String sql = "update clientes set nome=?, telefone=?, cpf=?, endereco=? where id=?;";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cardapio.getPizza());
			stmt.setString(2, cardapio.getDescricao());
			stmt.setString(3, cardapio.getTamanho());
			stmt.setDouble(4, cardapio.getPreco());
			stmt.setLong(5, cardapio.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean remover(Cardapio cardapio) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from cardapio where id=?;");
			stmt.setLong(1, cardapio.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Cardapio getById1(Long id) {
		Cardapio result = null;

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from cardapio where id = ?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				
				result = new Cardapio();
				result.setId(rs.getLong("id"));
				result.setPizza(rs.getString("pizza"));
				result.setDescricao(rs.getString("descricao"));
				result.setTamanho(rs.getString("tamanho"));
				result.setPreco(rs.getDouble("preco"));

			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public Cardapio getPizza() {
		// TODO Auto-generated method stub
		return null;
	}
}
