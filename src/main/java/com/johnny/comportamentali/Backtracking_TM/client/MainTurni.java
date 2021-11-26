package com.johnny.comportamentali.Backtracking_TM.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.johnny.comportamentali.Backtracking_TM.backtracking.BacktrackingTurni;

public class MainTurni {

	public static void main(String[] args) {
		List<String> turni = Arrays.asList("Luned� mattina", "Luned� pomeriggio", "Marted� mattina", 
				"Marted� pomeriggio", "Mercoled� mattina", "Mercoled� pomeriggio", "Gioved� mattina", "Gioved� pomeriggio", 
				"Venerd� mattina", "Venerd� pomeriggio");
		List<String> persone = Arrays.asList("Salvatore","Perfusionista2","Perfusionista3");
		ArrayList<String> t = new ArrayList<String>();
		ArrayList<String> p = new ArrayList<String>();
		for(String s : turni)
			t.add(s);
		for(String s : persone)
			p.add(s);
		BacktrackingTurni backtracking = new BacktrackingTurni(0);
		backtracking.turni2(t, p, 4);
	}

}
