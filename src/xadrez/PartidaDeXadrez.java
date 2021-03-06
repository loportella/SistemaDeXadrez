package xadrez;

import jogodetabuleiro.Posicao;
import jogodetabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
	private Tabuleiro tabuleiro;
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		InicialSetup();
	}
	public PecaDeXadrez[][] PegarPecas(){
		PecaDeXadrez[][] mat=new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0;i<tabuleiro.getLinhas();i++) {
			for(int j=0;j<tabuleiro.getColunas();j++) {
				mat[i][j]=(PecaDeXadrez) tabuleiro.peca(i,j);
			}
		}return mat;
	}
	private void InicialSetup() {
		tabuleiro.ColocarPeca(new Torre(tabuleiro, Cor.branco), new Posicao(2, 1));
		tabuleiro.ColocarPeca(new Rei(tabuleiro, Cor.preto), new Posicao(0,4));
		
	}
}
