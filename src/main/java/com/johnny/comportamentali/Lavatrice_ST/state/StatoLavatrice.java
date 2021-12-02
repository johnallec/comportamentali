package com.johnny.comportamentali.Lavatrice_ST.state;

public abstract class StatoLavatrice {

	protected Lavatrice lavatrice;
	
	public StatoLavatrice() {
		lavatrice = null;
	}
	
	public StatoLavatrice(Lavatrice lavatrice) {
		this.lavatrice = lavatrice;
	}
	
	public abstract void inserisciGettone();
	public abstract void inserisciDetersivo();
	public abstract void scegliMetodoDiLavaggio();
	public abstract void portelloneChiuso();
	public abstract void avvioLavaggio();
}
