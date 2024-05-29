import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
	JFrame frame = new JFrame();
	JLabel welcomel = new JLabel();
	
	public WelcomePage(String name) {
		
		welcomel.setBounds(0,0,200,35);
		welcomel.setFont(new Font(null , Font.PLAIN , 25));
		welcomel.setText("Hello " + name);
		
		frame.add(welcomel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
