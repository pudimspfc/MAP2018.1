package atividade02;

public class Tripulante {
	
	private Pessoa pessoa;
	private int idTripulante;
	
	public Tripulante(Pessoa pessoa, int idTripulante) {
		this.pessoa = pessoa;
		this.idTripulante = idTripulante;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getIdTripulante() {
		return idTripulante;
	}

	public void setIdTripulante(int idTripulante) {
		this.idTripulante = idTripulante;
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
