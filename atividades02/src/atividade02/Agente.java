package atividade02;

public class Agente {
	
	
	private Pessoa pessoa;
	private int idAgente;
	
	public Agente(Pessoa pessoa, int idAgente) {
		this.pessoa = pessoa;
		this.idAgente = idAgente;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
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
