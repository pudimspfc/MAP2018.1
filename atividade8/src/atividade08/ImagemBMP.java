package atividade08;

public class ImagemBMP implements Imagem {

	@Override
	public void carregarImagem() {
		System.out.println("Carregando img");
	}

	@Override
	public void desenharImagem() {
		System.out.println("Desenhando img");
	}

}