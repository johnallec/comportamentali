package com.johnny.comportamentali.Stampanti_CoR;

import com.johnny.comportamentali.Lavatrice_ST.state.Lavatrice;

public class Main {

	public static void main(String[] args) {
		Lavatrice lavatrice = new Lavatrice();
		lavatrice.avvioLavaggio();
		lavatrice.chiudiPortellone();
		lavatrice.scegliMetodoDiLavaggio();
		lavatrice.inserisciDetersivo();
		System.out.println("\nIn ordine logico:\n");
		lavatrice.inserisciGettone();
		lavatrice.inserisciDetersivo();
		lavatrice.scegliMetodoDiLavaggio();
		lavatrice.chiudiPortellone();
		lavatrice.avvioLavaggio();
	}

}
