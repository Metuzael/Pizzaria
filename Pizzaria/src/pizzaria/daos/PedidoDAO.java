package pizzaria.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pizzaria.modelos.Cardapio;
import pizzaria.modelos.Cliente;
import pizzaria.modelos.Pedido;

public class PedidoDAO {

	private Connection connection;

	public PedidoDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir(Pedido pedido) {

		String sql = "insert into pedidos (cliente, cardapio, quantidade, endereco) values ( ?, ?, ?, ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			
			stmt.setLong(1, pedido.getCliente().getId());
			stmt.setLong(2, pedido.getCardapio().getId());
			stmt.setInt (3, pedido.getQuantidade());
			stmt.setString(4, pedido.getEndereco());
			

			stmt.execute();
			stmt.close();
			System.out.println("Salvo");

		} catch (SQLException e) {
			e.printStackTrace();
			return true;
  }
		return false;
	}
	
		public List<Pedido> getLista() {
			try {

				List<Pedido> pedidos = new ArrayList<Pedido>();
				PreparedStatement stmt = connection.prepareStatement("select * from pedidos;");
				ResultSet rs = stmt.executeQuery();

				while (rs.next()) {
					pedidos.add(montarPedidos(rs));
				}
				rs.close();
				stmt.close();
				return pedidos;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}

		}
		
		private Pedido montarPedidos(ResultSet rs) throws SQLException {
			Pedido pedido = new Pedido();

			pedido.setId(rs.getLong("id"));
			Cliente cliente = new ClienteDAO().getById1(rs.getLong("clientes"));
			pedido.setCliente(cliente);
			Cardapio cardapio = new CardapioDAO().getById1(rs.getLong("cardapio"));
			pedido.setCardapio(cardapio);

			return pedido;
	}
		public Pedido getPedidoByID1(Long id) {
			try {

				Pedido pedido = null;
				PreparedStatement stmt = this.connection.prepareStatement("select * from pedidos where id=?;");
				stmt.setLong(1, id);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					pedido = montarPedidos(rs);
				}
				rs.close();
				stmt.close();
				return pedido;
			} catch (SQLException e) {
				throw new RuntimeException(e);

			}
		}
		
		public boolean remover(Pedido pedido) {
			try {
				PreparedStatement stmt = connection.prepareStatement("delete from pedidos where id=?;");
				stmt.setLong(1, pedido.getId());
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
	}

