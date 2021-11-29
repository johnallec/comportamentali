package com.johnny.comportamentali.Stampanti_CoR.chainOR;

public abstract class Chain {
	protected Chain stampanteSuccessiva;
	protected boolean stampando;
	protected String nomeStampante;
	public Chain() {
		stampanteSuccessiva = null;
		stampando = false;
		nomeStampante = "NOME-NON-ASSEGNATO";
	}
	public Chain(String nomeStampante) {
		stampanteSuccessiva = null;
		stampando = false;
		this.nomeStampante = nomeStampante;
	}
	public Chain(Chain nextChain) {
		this.stampanteSuccessiva = nextChain;
		stampando = false;
		nomeStampante = "NOME-NON-ASSEGNATO";
	}
	public void setStampanteSuccessiva(Chain nextChain) {
		this.stampanteSuccessiva = nextChain;
	}
	public abstract void stampa(String s);
	public String getNomeStampante() {
		return nomeStampante;
	}
	public void setStampando(boolean b) {
		stampando = b;
	}
	public synchronized boolean getStampando() {
		return stampando;
	}
}
