package br.com.lista.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	Connection conn;
	
	public Connection getConexao() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lista_de_compras?serverTimezone=UTC", "root", "19942375Henrique");
			System.out.println("Conexão com o banco de dados Obtida");
			return conn;
		}catch(Exception e) {
			System.out.println("Não foi possivel estabelecer a conexão com o Banco de Dados" + e.getMessage());
			return null;
		}
	}
		
		
}

