package br.com.lista.model;

public class Objeto {
	private String nome;
	private String id;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Objeto [nome=" + nome + ", id=" + id + "]";
	}
	
	
}
