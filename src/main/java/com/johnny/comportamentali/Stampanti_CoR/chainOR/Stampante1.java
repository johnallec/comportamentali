package com.johnny.comportamentali.Stampanti_CoR.chainOR;

public class Stampante1 extends Chain {

	public Stampante1() {
		super();
		nomeStampante = "Stampante1";
	}
	
	@Override
	public void stampa(String s) {
		Thread t = new Thread(new Slave(s, this));
		t.start();
	}
}
