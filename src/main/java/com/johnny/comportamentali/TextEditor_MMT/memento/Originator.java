package com.johnny.comportamentali.TextEditor_MMT.memento;

public class Originator {
	private String command;
	
	public void set(String command) {
		this.command = command;
	}
	
	public Memento creaMemento() {
		return new Memento(command);
	}
}
