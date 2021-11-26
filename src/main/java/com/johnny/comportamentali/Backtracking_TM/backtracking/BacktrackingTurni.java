package com.johnny.comportamentali.Backtracking_TM.backtracking;

import java.util.ArrayList;
import com.johnny.comportamentali.Backtracking_TM.Strutture;
import com.johnny.comportamentali.Backtracking_TM.Strutture.SoluzioneTurni;
import com.johnny.comportamentali.Backtracking_TM.StruttureInterface;

public class BacktrackingTurni extends Backtracking{
	
	public BacktrackingTurni(Object minVal) {
		super(minVal);
	}
	
	public boolean turni2(ArrayList<String> turni, ArrayList<String> persone, int k) {
		Strutture.SoluzioneTurni soluzione = new Strutture().new SoluzioneTurni(turni, persone, k);
		boolean b = solve(soluzione);
		for(int i = 0; i < soluzione.turni.size(); ++i) {
			System.out.print(soluzione.turni.get(i) + " -> ");
			System.out.println(soluzione.soluzione.get(i));
		}
		for(int i=0; i<soluzione.turniPersone.length; ++i) {
			System.out.print(soluzione.persone.get(i) + " ore: ");
			System.out.println(soluzione.turniPersone[i]);
		}
		return b;
	}
	
	@Override
	protected boolean noMoreValues(Object x, StruttureInterface soluzione) {
		if(soluzione instanceof Strutture.SoluzioneTurni) {
			SoluzioneTurni soluzioneCasted = (Strutture.SoluzioneTurni) soluzione;
			if((int) x < soluzioneCasted.persone.size())
				return false;
			return true;
		}
		System.out.println("Soluzione non � istanza di Strutture.SoluzioneTurni in noMoreValues");
		return true;
	}

	@Override
	protected boolean canAdd(Object x, StruttureInterface soluzione) {
		if(soluzione instanceof Strutture.SoluzioneTurni) {
			SoluzioneTurni soluzioneCasted = (Strutture.SoluzioneTurni) soluzione;
			if(soluzioneCasted.soluzione.isEmpty()) 
				return true;
			if(soluzioneCasted.soluzione.size()+1 > soluzioneCasted.turni.size())
				return false;
			if(soluzioneCasted.soluzione.get(soluzioneCasted.soluzione.size()-1).compareTo(soluzioneCasted.persone.get((int) x))==0)
				return false;
			int count = 0;
			for(String s : soluzioneCasted.soluzione)
				if(s.compareTo(soluzioneCasted.persone.get((int) x))==0)
					count++;
			if(count>soluzioneCasted.massimoNumeroDiTurni) 
				return false;
			return true;
		}
		System.out.println("Soluzione non � istanza di Strutture.SoluzioneTurni in canAdd");
		return false;
	}

	@Override
	protected void add(Object x, StruttureInterface soluzione) {
		if(soluzione instanceof Strutture.SoluzioneTurni) {
			SoluzioneTurni soluzioneCasted = (Strutture.SoluzioneTurni) soluzione;
			soluzioneCasted.soluzione.add(soluzioneCasted.persone.get((int) x));
			soluzioneCasted.turniPersone[(int) x]++;
		}
		else System.out.println("Soluzione non � istanza di Strutture.SoluzioneTurni in add");
	}

	@Override
	protected boolean isComplete(StruttureInterface soluzione) {
		if(soluzione instanceof Strutture.SoluzioneTurni) {
			SoluzioneTurni soluzioneCasted = (Strutture.SoluzioneTurni) soluzione;
			for(int i = 0; i < soluzioneCasted.turniPersone.length; ++i)
				if(soluzioneCasted.turniPersone[i] < (soluzioneCasted.turni.size()/soluzioneCasted.persone.size()) || soluzioneCasted.turniPersone[i] > soluzioneCasted.massimoNumeroDiTurni)
					return false;
			return true;
		}
		System.out.println("Soluzione non � istanza di Strutture.SoluzioneTurni in isComplete");
		return false;
	}

	@Override
	protected void remove(Object x, StruttureInterface soluzione) {
		if(soluzione instanceof Strutture.SoluzioneTurni) {
			SoluzioneTurni soluzioneCasted = (Strutture.SoluzioneTurni) soluzione;
			soluzioneCasted.soluzione.remove(soluzioneCasted.soluzione.size()-1);
			soluzioneCasted.turniPersone[(int) x]--;
		}
	}

	@Override
	protected Object next(Object x) {
		if(x instanceof Integer) {
			return ((Object) (((Integer) x)+1));
		}
		else return null;
	}

	@Override
	public boolean solve(StruttureInterface soluzione) {
		return super.solve(soluzione);
	}	
	
}
