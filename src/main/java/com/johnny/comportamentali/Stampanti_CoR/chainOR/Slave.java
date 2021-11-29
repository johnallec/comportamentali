package com.johnny.comportamentali.Stampanti_CoR.chainOR;

public class Slave implements Runnable{

	private String s;
	private Chain c;
	
	public Slave(String s, Chain c) {
		this.s=s;
		this.c = c;
	}
	@Override
	public void run() {
		if(!c.getStampando()) {
			try {
				c.setStampando(true);
				System.out.println(s + " <" + c.nomeStampante + ">");
				Thread.sleep(200);
				c.setStampando(false);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else if(c.stampanteSuccessiva!=null)
			c.stampanteSuccessiva.stampa(s);
		else System.out.println("IMPOSSIBILE-STAMPARE <-> " + s);
	}

}
