package com.johnny.comportamentali.TextEditor_MMT.memento;

public class Memento {
	
	private String command;
	
	Memento(String command) {
		this.command = command;
	}
	
	public void setCommand(String command) {
		this.command = command;
	}
	
	public String getCommand() {
		return command;
	}
}
