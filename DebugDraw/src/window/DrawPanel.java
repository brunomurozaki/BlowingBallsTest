package window;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPanel extends JPanel implements SimpleShowInterface{

	private JFrame parent;
	
	public DrawPanel(JFrame parent) {
		
		this.parent = parent;
		
		this.setSize(this.parent.getWidth() - 150, this.parent.getHeight()-10);
		this.setLocation(5, 5);
		this.setLayout(null);
		this.setBackground(Color.white);
	}
	
	@Override
	public void paint(Graphics arg0) {
		super.paint(arg0);
		Graphics2D g = (Graphics2D)arg0;
		
	}

	public void view() {
		this.setVisible(true);
		this.repaint();
	}
	
	@Override
	public void hide() {
		this.setVisible(false);
	}

	public void close() {
		
	}
}
