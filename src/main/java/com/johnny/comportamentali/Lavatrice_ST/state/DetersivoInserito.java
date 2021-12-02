package com.johnny.comportamentali.Lavatrice_ST.state;

public class DetersivoInserito extends StatoLavatrice {

	public DetersivoInserito(Lavatrice lavatrice) {
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
		lavatrice.setStato(lavatrice.getStatoMetodoScelto());
		System.out.println("Metodo di lavaggio impostato.");
	}

	@Override
	public void portelloneChiuso() {
		System.out.println("Inserire metodo di lavaggio.");
	}

	@Override
	public void avvioLavaggio() {
		System.out.println("Chiudere il portellone.");
	}
}
