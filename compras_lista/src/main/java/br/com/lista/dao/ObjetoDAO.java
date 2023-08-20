package br.com.lista.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.lista.factory.ConnectionFactory;
import br.com.lista.model.Objeto;

public class ObjetoDAO {
	ConnectionFactory conexao;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public ObjetoDAO() {
		this.conexao = new ConnectionFactory();
		this.conn = conexao.getConexao();
	}
	
	public void saveAcabou(Objeto objeto) {
		String sql = "INSERT INTO acabou(nome) VALUES (?)";
		
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, objeto.getNome());
			pstmt.execute();
			System.out.println("Insercao feita com sucesso!");
			
		}catch(SQLException e) {
			System.out.println("Não foi possivel inserir os dados" + e.getMessage());
		}finally {
			try {
				if(conn != null) {
					System.out.println("Feita a desconexão!");
					pstmt.close();
					conn.close();
				}
			}catch(SQLException e) {
				System.out.println("Não foi possivel ser feita a desconexão!");
			}
		}
	}
	
	
	public void saveQuase(Objeto objeto) {
		String sql = "INSERT INTO quase_acabou(nome) VALUES (?)";
		
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, objeto.getNome());
			pstmt.execute();
			System.out.println("Insercao feita com sucesso!");
			
		}catch(SQLException e) {
			System.out.println("Não foi possivel inserir os dados" + e.getMessage());
		}finally {
			try {
				if(conn != null) {
					System.out.println("Feita a desconexão!");
					pstmt.close();
					conn.close();
				}
			}catch(SQLException e) {
				System.out.println("Não foi possivel ser feita a desconexão!");
			}
		}
	}
	
	public List<Objeto> getListaAcabou(){
		String sql = "SELECT * FROM acabou";
		List<Objeto> lista_compras = new ArrayList<Objeto>();
		try {
			pstmt = this.conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Objeto objeto = new Objeto();
				objeto.setId(rs.getString("ID"));
				objeto.setNome(rs.getString("NOME"));
				lista_compras.add(objeto);	
			}
			
			return lista_compras;
		}catch(Exception e) {
			System.out.println("Não foi possivel efetuar a QUERY");
			return null;
		}finally {
			try {
				if(conn!= null) {
					System.out.println("Feita a desconexão!");
					pstmt.close();
					conn.close();
				}
			}catch(SQLException e) {
				System.out.println("Não foi possivel ser feita a desconexão!");
			}
		}
	}
	
	public List<Objeto> getListaQuase(){
		String sql = "SELECT * FROM quase_acabou";
		List<Objeto> lista_compras = new ArrayList<Objeto>();
		try {
			pstmt = this.conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Objeto objeto = new Objeto();
				objeto.setId(rs.getString("ID"));
				objeto.setNome(rs.getString("NOME"));
				lista_compras.add(objeto);	
			}
			
			return lista_compras;
		}catch(Exception e) {
			System.out.println("Não foi possivel efetuar a QUERY");
			return null;
		}finally {
			try {
				if(conn!= null) {
					System.out.println("Feita a desconexão!");
					pstmt.close();
					conn.close();
				}
			}catch(SQLException e) {
				System.out.println("Não foi possivel ser feita a desconexão!");
			}
		}
	}	
	
	public void updateAcabou(String consulta, Objeto objeto) {
		try {
			String sql = "UPDATE acabou SET NOME = ? WHERE ID = ?";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, objeto.getNome());
			pstmt.setString(2, consulta);
			pstmt.execute();
			System.out.println("Alteração feita com sucesso!");
			
			
		}catch(SQLException e) {
			System.out.println("Não foi possivel alterar os dados!");
			
		}finally {
			try {
				if(conn != null) {
					System.out.println("Feita a desconexão!");
					conn.close();
					pstmt.close();
				}
			}catch(SQLException e) {
				System.out.print("Não foi possivel ser feita a desconexão");
			}
		}
	}
	
	
	public void updateQuase(String consulta, Objeto objeto) {
		try {
			String sql = "UPDATE quase_acabou SET NOME = ? WHERE ID = ?";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, objeto.getNome());
			pstmt.setString(2, consulta);
			pstmt.execute();
			System.out.println("Alteração feita com sucesso!");
			
			
		}catch(SQLException e) {
			System.out.println("Não foi possivel alterar os dados!");
			
		}finally {
			try {
				if(conn != null) {
					System.out.println("Feita a desconexão!");
					conn.close();
					pstmt.close();
				}
			}catch(SQLException e) {
				System.out.print("Não foi possivel ser feita a desconexão");
			}
		}
	}
	
	public void deleteAcabou(String consulta) {
		try {
			String sql = "DELETE FROM acabou WHERE ID = ?";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, consulta);
			pstmt.execute();
			System.out.println("Exclusao feita com sucesso!");
			
			
		}catch(SQLException e) {
			System.out.println("Não foi possivel a exclusao dos dados!");
			
		}finally {
			try {
				if(conn != null) {
					System.out.println("Feita a desconexão!");
					conn.close();
					pstmt.close();
				}
			}catch(SQLException e) {
				System.out.print("Não foi possivel ser feita a desconexão");
			}
		}
	}
	
	
	public void deleteQuase(String consulta) {
		try {
			String sql = "DELETE FROM quase_acabou WHERE ID = ?";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, consulta);
			pstmt.execute();
			System.out.println("Exclusao feita com sucesso!");
			
			
		}catch(SQLException e) {
			System.out.println("Não foi possivel a exclusao dos dados!");
			
		}finally {
			try {
				if(conn != null) {
					System.out.println("Feita a desconexão!");
					conn.close();
					pstmt.close();
				}
			}catch(SQLException e) {
				System.out.print("Não foi possivel ser feita a desconexão");
			}
		}
	}
	
}
