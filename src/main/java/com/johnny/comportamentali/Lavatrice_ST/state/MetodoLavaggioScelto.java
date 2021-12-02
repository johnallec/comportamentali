package com.johnny.comportamentali.Lavatrice_ST.state;

public class MetodoLavaggioScelto extends StatoLavatrice {

	public MetodoLavaggioScelto(Lavatrice lavatrice) {
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
		System.out.println("Metodo già impostato.");
	}

	@Override
	public void portelloneChiuso() {
		lavatrice.setStato(lavatrice.getStatoPortelloneChiuso());
		System.out.println("Portellone chiuso.");
	}

	@Override
	public void avvioLavaggio() {
		System.out.println("Chiudere il portellone.");
	}
}
