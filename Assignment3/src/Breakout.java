import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		
		
		// TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setSize(400, 500);
		// TODO: Set the title
		setTitle(Settings.WINDOW_NAME);
		// TODO: Set the background colour to white
		getContentPane().setBackground(Color.WHITE);
		// TODO: Set resizable to false
		setResizable(false);
		// TODO: Set visible to true
		panel = new BreakoutPanel(this);
        add(panel);
		
		setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
	}

	public static void main(String[] args) {
		new Breakout();	
		
	}

}
