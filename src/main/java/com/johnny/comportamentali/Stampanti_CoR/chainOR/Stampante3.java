package com.johnny.comportamentali.Stampanti_CoR.chainOR;

public class Stampante3 extends Chain {

	public Stampante3() {
		super();
		nomeStampante = "Stampante3";
	}
	
	@Override
	public void stampa(String s) {
		if(!getStampando()) {
			Thread t = new Thread(new Slave(s, this));
			t.start();
		}
		else System.out.println("STAMPANTI-TERMINATE");;
	}
}
