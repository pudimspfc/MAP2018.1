package atividade08;

public class ImagemAdapter implements ImagemTarget {

	@Override
	public void carregarImagem(Imagem imagem) {
		imagem.carregarImagem();
	}

	@Override
	public void desenharImagem(Imagem imagem) {
		imagem.desenharImagem();
	}
	

}