package aplication;

import xadrez.PartidaDeXadrez;


public class Main {

	public static void main(String[] s) { 
			PartidaDeXadrez px= new PartidaDeXadrez();
			UI.PrintTabuleiro(px.PegarPecas());
	}

}
