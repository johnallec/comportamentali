package com.johnny.comportamentali.Stampanti_CoR.client;

import com.johnny.comportamentali.Stampanti_CoR.chainOR.Chain;
import com.johnny.comportamentali.Stampanti_CoR.chainOR.Stampante1;
import com.johnny.comportamentali.Stampanti_CoR.chainOR.Stampante2;
import com.johnny.comportamentali.Stampanti_CoR.chainOR.Stampante3;

public class Main {

	public static void main(String[] args) {
		Chain p1 = new Stampante1();
		Chain p2 = new Stampante2();
		Chain p3 = new Stampante3();
		p1.setStampanteSuccessiva(p2);
		p2.setStampanteSuccessiva(p3);
		p1.stampa("AAAA");
		p1.stampa("BBBB");
		p1.stampa("CCCC");
		p1.stampa("DDDD");
		p1.stampa("EEEE");
		p1.stampa("FFFF");
		p1.stampa("GGGG");
		p1.stampa("HHHH");
	}

}
