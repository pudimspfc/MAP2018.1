package atividade02;

public class Passageiro  {
	
	private Pessoa pessoa;
	private int numeroSmile;
	
	public Passageiro(Pessoa pessoa, int idTripulacao) {
		this.pessoa = pessoa;
		this.numeroSmile = idTripulacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getIdTripulacao() {
		return numeroSmile;
	}

	public void setIdTripulacao(int idTripulacao) {
		this.numeroSmile = idTripulacao;
	}
	
	public String getNome() {
		return pessoa.getNome();
	}
	
	
	public void setNome(String nome ) {
		pessoa.setNome(nome);
		
	}
	
	public String getEndereco() {
		return pessoa.getEndereco();
	}
	
	public void setEndereco(String endereco ) {
		pessoa.setNome(endereco);
		
	}
	
	
		
	
	

}
