package com.johnny.comportamentali.TextEditor_MMT.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.net.ssl.CertPathTrustManagerParameters;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.johnny.comportamentali.TextEditor_MMT.memento.Memento;
import com.johnny.comportamentali.TextEditor_MMT.memento.Originator;

public class GuiCreator {
	
	public static GuiCreator instance = null;
	private JFrame frame;
	private JPanel panel;
	private JTextArea textArea;
	private JTextField commandLine;
	private final String PATH_CONSOLE = "user@domain:~$";
	private Stack<Memento> stackMemento;
	private Stack<Memento> stackPreviousMemento;
	private Originator creatoreMemento;
	
	private GuiCreator(int w, int h) {
		stackMemento = new Stack<Memento>();
		stackPreviousMemento = new Stack<Memento>();
		creatoreMemento = new Originator();
		frame = new JFrame();
		frame.setSize(w, h);
		panel = new JPanel(new BorderLayout());
		textArea = new JTextArea();
		commandLine = new JTextField();
	}
	
	public static GuiCreator getInstance(int w, int h) {
		if(instance == null)
			instance = new GuiCreator(w, h);
		return instance;
	}
	
	public void createGui() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocation(500, 400);
		JScrollPane scrollTextArea = new JScrollPane(textArea);
		panel.add(scrollTextArea, BorderLayout.CENTER);
		JScrollPane scrollCommandLine = new JScrollPane(commandLine);
		panel.add(scrollCommandLine, BorderLayout.PAGE_END);
		frame.add(panel);
		
		textArea.setEditable(false);
		textArea.setVisible(true);
		textArea.setBackground(new Color(43,37,37));
		textArea.setFont(new Font("Bitstream Vera Sans Mono", Font.BOLD, 15));
		textArea.setForeground(Color.WHITE);
		textArea.setLineWrap(true);
		
		commandLine.setEditable(true);
		commandLine.setVisible(true);
		commandLine.setBackground(new Color(70,54,54));
		commandLine.setFont(new Font("Bitstream Vera Sans Mono", Font.BOLD, 17));
		commandLine.setForeground(Color.WHITE);
		commandLine.setCaretColor(Color.WHITE);
		commandLine.setText(PATH_CONSOLE);
		commandLine.addKeyListener(new KeyListener() {	
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					String tmp = commandLine.getText();
					tmp = tmp.substring(tmp.indexOf('$')+1);
					creatoreMemento.set(tmp);
					textArea.append(tmp.substring(tmp.indexOf('$')+1)+"\n");
					commandLine.setText(PATH_CONSOLE);
					stackMemento.add(creatoreMemento.creaMemento());
					e.consume();
				}
				else if(e.getKeyCode()==KeyEvent.VK_UP) {
					if(!stackMemento.isEmpty()) {
						String tmp = commandLine.getText().substring(commandLine.getText().indexOf('$')+1);
						if(tmp.compareTo(stackMemento.get(stackMemento.size()-1).getCommand())==0) {
							Memento m = stackMemento.pop();
							stackPreviousMemento.add(m);
						}
						Memento m = stackMemento.pop();
						stackPreviousMemento.add(m);
						commandLine.setText(PATH_CONSOLE+m.getCommand());
						e.consume();
					}
				}
				else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					if(!stackPreviousMemento.isEmpty()) {
						String tmp = commandLine.getText().substring(commandLine.getText().indexOf('$')+1);
						if(tmp.compareTo(stackPreviousMemento.get(stackPreviousMemento.size()-1).getCommand())==0) {
							Memento m = stackPreviousMemento.pop();
							stackMemento.add(m);
						}
						Memento m = stackPreviousMemento.pop();
						stackMemento.add(m);
						commandLine.setText(PATH_CONSOLE+m.getCommand());
						e.consume();
					}
				}
			}});
	}
}
