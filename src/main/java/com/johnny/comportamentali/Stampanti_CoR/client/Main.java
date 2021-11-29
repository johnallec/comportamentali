package com.johnny.comportamentali.Stampanti_CoR.client;

import com.johnny.comportamentali.Stampanti_CoR.chainOR.Chain;
import com.johnny.comportamentali.Stampanti_CoR.chainOR.Stampante1;
import com.johnny.comportamentali.Stampanti_CoR.chainOR.Stampante2;
import com.johnny.comportamentali.Stampanti_CoR.chainOR.Stampante3;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Chain p1 = new Stampante1();
		Chain p2 = new Stampante2();
		Chain p3 = new Stampante3();
		p1.setStampanteSuccessiva(p2);
		p2.setStampanteSuccessiva(p3);
		for(int i=0; true; ++i) {
			Thread.sleep(50);
			p1.stampa(String.valueOf(i));
		}
	}

}
