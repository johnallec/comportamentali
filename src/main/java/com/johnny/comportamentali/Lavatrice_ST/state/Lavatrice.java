package com.johnny.comportamentali.Lavatrice_ST.state;

public class Lavatrice {

	private StatoLavatrice gettoneInserito;
	private StatoLavatrice nessunGettone;
	private StatoLavatrice detersivoInserito;
	private StatoLavatrice metodoLavaggioScelto;
	private StatoLavatrice portelloneChiuso;
	
	private StatoLavatrice statoCorrente;
	
	private int numeroGettoni;
	
	public Lavatrice() {
		gettoneInserito = new GettoneInserito(this);
		nessunGettone = new NessunGettone(this);
		detersivoInserito = new DetersivoInserito(this);
		metodoLavaggioScelto = new MetodoLavaggioScelto(this);
		portelloneChiuso = new PortelloneChiuso(this);
		
		statoCorrente = nessunGettone;
		
		numeroGettoni = 0;
	}
	
	public void addGettone() {
		numeroGettoni++;
	}
	
	public void remGettone() {
		numeroGettoni--;
	}
	
	public void setStato(StatoLavatrice stato) {
		statoCorrente = stato;
	}
	
	public void inserisciGettone() {
		statoCorrente.inserisciGettone();
	}
	
	public void inserisciDetersivo() {
		statoCorrente.inserisciDetersivo();
	}
	
	public void scegliMetodoDiLavaggio() {
		statoCorrente.scegliMetodoDiLavaggio();
	}
	
	public void chiudiPortellone() {
		statoCorrente.portelloneChiuso();
	}
	
	public void avvioLavaggio() {
		statoCorrente.avvioLavaggio();
	}
	
	StatoLavatrice getStatoGettoneInserito() {
		return gettoneInserito;
	}
	
	StatoLavatrice getStatoGettoneNonInserito() {
		return nessunGettone;
	}
	
	StatoLavatrice getStatoDetersivoInserito() {
		return detersivoInserito;
	}
	
	StatoLavatrice getStatoMetodoScelto() {
		return metodoLavaggioScelto;
	}
	
	StatoLavatrice getStatoPortelloneChiuso() {
		return portelloneChiuso;
	}
}
