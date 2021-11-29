package com.johnny.comportamentali.Stampanti_CoR.chainOR;

public class Stampante2 extends Chain {

	public Stampante2() {
		super();
		nomeStampante = "Stampante2";
	}
	
	@Override
	public void stampa(String s) {
		if(!getStampando()) {
			Thread t = new Thread(new Slave(s, this));
			t.start();
		}
		else this.stampanteSuccessiva.stampa(s);
	}
}