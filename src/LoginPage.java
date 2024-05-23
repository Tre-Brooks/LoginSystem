import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton loginbut = new JButton("Login");
	JButton resetbut = new JButton("Reset");
	JTextField userID = new JTextField();
	JPasswordField userPass = new JPasswordField();
	JLabel userIdLabel = new JLabel("userID:");
	JLabel userpassLabel = new JLabel("password:");
	HashMap<String,String> logininfo = new HashMap<>();
	
	public LoginPage(HashMap<String,String> map) {
		
		logininfo = map;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
