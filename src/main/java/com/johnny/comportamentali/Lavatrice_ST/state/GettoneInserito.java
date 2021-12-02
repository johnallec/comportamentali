package com.johnny.comportamentali.Lavatrice_ST.state;

public class GettoneInserito extends StatoLavatrice {

	public GettoneInserito(Lavatrice lavatrice) {
		super(lavatrice);
	}
	
	@Override
	public void inserisciGettone() {
		System.out.println("Un gettone per volta.");
	}

	@Override
	public void inserisciDetersivo() {
		lavatrice.setStato(lavatrice.getStatoDetersivoInserito());
		System.out.println("Detersivo inserito.");
	}
	
	@Override
	public void scegliMetodoDiLavaggio() {
		System.out.println("Inserire detersivo.");
	}

	@Override
	public void portelloneChiuso() {
		System.out.println("Inserire metodo.");
	}
	
	@Override
	public void avvioLavaggio() {
		System.out.println("Chiudere il portellone.");
	}
}
