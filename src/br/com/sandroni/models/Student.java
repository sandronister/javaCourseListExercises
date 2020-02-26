package br.com.sandroni.models;

public class Student {

	private String nome;
	private int numeroMatricula;
	
	
	public Student(String nome, int numeroMatricula) {
		super();
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}


	public String getNome() {
		return nome;
	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "{nome:"+this.nome+",matircula:"+this.numeroMatricula+"}";
	}
	
	
}
