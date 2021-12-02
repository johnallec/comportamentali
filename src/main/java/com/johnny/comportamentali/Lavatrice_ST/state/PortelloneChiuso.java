package com.johnny.comportamentali.Lavatrice_ST.state;

public class PortelloneChiuso extends StatoLavatrice {
	
	public PortelloneChiuso(Lavatrice lavatrice) {
		super(lavatrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void inserisciGettone() {
		System.out.println("Un gettone per volta.");
	}

	@Override
	public void inserisciDetersivo() {
		System.out.println("Detersivo già inserito");
	}

	@Override
	public void scegliMetodoDiLavaggio() {
		System.out.println("Metodo di lavaggio scelto.");
	}

	@Override
	public void portelloneChiuso() {
		System.out.println("Portellone già chiuso.");
	}

	@Override
	public void avvioLavaggio() {
		lavatrice.remGettone();
		System.out.println("Lavaggio avviato.");
		lavatrice.setStato(lavatrice.getStatoGettoneNonInserito());
	}
}
