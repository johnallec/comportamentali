package com.johnny.comportamentali.Backtracking_TM.backtracking;

import com.johnny.comportamentali.Backtracking_TM.StruttureInterface;

public abstract class Backtracking {
	
	protected Object minVal;
	
	protected Backtracking(Object minVal) {
		this.minVal = minVal;
	}
	
	protected boolean noMoreValues(Object x, StruttureInterface soluzione) { return false; }
	protected boolean canAdd(Object x,StruttureInterface soluzione) { return false; }
	protected void add(Object x,StruttureInterface soluzione) {}
	protected boolean isComplete(StruttureInterface soluzione) { return false; }
	protected void remove(Object x, StruttureInterface soluzione) {}
	protected Object next(Object x) { return null; }
	
	public boolean solve(StruttureInterface soluzione) {
		Object x = minVal;
		while(!noMoreValues(x, soluzione))
			if(canAdd(x,soluzione)) {
				
				add(x,soluzione);
				
				if(isComplete(soluzione)) { return true; }
				else if(solve(soluzione)) { return true;};

				remove(x,soluzione);
				x = next(x);
			}
			else{
				x = next(x);
			}
			
		return false;
	}
}
