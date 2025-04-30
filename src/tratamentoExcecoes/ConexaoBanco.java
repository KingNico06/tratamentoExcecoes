package tratamentoExcecoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoBanco {

	public static void main(String[] args) {
		
		try {
			conectarBanco();
		} catch (SQLException e) {
			System.out.println("Erro ao conectar Banco de Dados!");
			e.printStackTrace();
		}
		

	}
	

	public static void conectarBanco() throws SQLException {
	
		String url = "jdbc:mysql://localhost:3306/sistema";
		String usuario = "root";
		String senha = "";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexao com o Banco de Dados estabelecida com sucesso!");
		
		String sql = "INSERT INTO usuario (nome, email, senha) VALUES (?, ?, ?)";
		
		PreparedStatement consQuery = conexao.prepareStatement(sql);
		consQuery.setString(1, "Nicolas");
		consQuery.setString(2, "reidelas@gmail.com");
		consQuery.setString(3, "Admin123");
		
		consQuery.executeUpdate();		
		
		
		consQuery.close();
		conexao.close();
		
	}

}
