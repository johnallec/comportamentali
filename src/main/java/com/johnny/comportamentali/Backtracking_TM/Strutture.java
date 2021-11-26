package com.johnny.comportamentali.Backtracking_TM;

import java.util.ArrayList;

public class Strutture {
	public class SoluzioneTurni implements StruttureInterface{
		public ArrayList<String> turni;
		public ArrayList<String> persone;
		public ArrayList<String> soluzione;
		public int massimoNumeroDiTurni;
		public int[] turniPersone;
		public SoluzioneTurni(ArrayList<String> turni, ArrayList<String> persone, int k) {
			this.turni = turni;
			this.persone = persone;
			this.soluzione = new ArrayList<String>();
			this.massimoNumeroDiTurni = k;
			this.turniPersone = new int[persone.size()];
		}
	}
}
