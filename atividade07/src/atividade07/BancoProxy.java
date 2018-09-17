package atividade07;

public class BancoProxy implements IBanco {
	
	protected BancoUsuarios banco;
	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		banco = new BancoUsuarios();
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return banco.getNumeroDeUsuarios();
		}
		return null;
	}

	@Override
	public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return banco.getUsuariosConectados();
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}

}