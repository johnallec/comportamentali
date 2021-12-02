package com.johnny.comportamentali.Lavatrice_ST.state;

public class NessunGettone extends StatoLavatrice {

	public NessunGettone(Lavatrice lavatrice) {
		super(lavatrice);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void inserisciGettone() {
		lavatrice.addGettone();
		lavatrice.setStato(lavatrice.getStatoGettoneInserito());
		System.out.println("Gettone aggiunto.");
	}

	@Override
	public void inserisciDetersivo() {
		System.out.println("Inserire gettone.");
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
