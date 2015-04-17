package window;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Main;

public class DebugWindow extends JFrame implements SimpleShowInterface{

	private JPanel myPanel;
	
	public DebugWindow() {
		this.setTitle("Debug Draw");
		this.setSize(500, 300);
		this.setLayout(null);
		this.setLocation(Main.centerX(this.getWidth()), Main.centerY(this.getHeight()));
		this.myPanel = new DrawPanel(this);
	}
	
	private void initializeComponents(){
		this.initializeEvents();
		this.addPanel();
	}
	
	private void initializeEvents(){
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				super.windowClosing(arg0);
				System.exit(0);
			}
		});
	}

	private void addPanel(){
		this.add(myPanel);
	}
	
	public void view(){
		this.setVisible(true);
		initializeComponents();
	}

	public void hide(){
		this.setVisible(false);
	}

	public void close() {
		
	}
}
