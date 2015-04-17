package main;

import java.awt.Toolkit;

import window.DebugWindow;

public class Main {
	
	public static void main (String [] args){
		DebugWindow win = new DebugWindow();
		win.view();
	}
	
	public static int centerX(int width){
		return (Toolkit.getDefaultToolkit().getScreenSize().width/2) - (width/2);
	}

	public static int centerY(int height){
		return (Toolkit.getDefaultToolkit().getScreenSize().height/2) - (height/2);
	}
}
