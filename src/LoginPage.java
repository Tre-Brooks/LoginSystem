import java.awt.Color;
import java.awt.Font;
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
	JLabel message = new JLabel();
	HashMap<String,String> logininfo = new HashMap<>();
	
	public LoginPage(HashMap<String,String> map) {
		
		logininfo = map;
		
		userIdLabel.setBounds(50,100,75,25);
		userpassLabel.setBounds(50,150,75, 25);
		
		message.setBounds(125,250,250,35);
		message.setFont(new Font(null, Font.ITALIC,25));
		
		
		userID.setBounds(125, 100 , 200, 25);
		userPass.setBounds(125, 150 , 200, 25);
		
		loginbut.setBounds(125 , 200, 100, 25);
		loginbut.addActionListener(this);
		
		resetbut.setBounds(225 , 200, 100, 25);
		resetbut.addActionListener(this);
		
		frame.add(userIdLabel);
		frame.add(userpassLabel);
		frame.add(message);
		frame.add(userID);
		frame.add(userPass);
		frame.add(loginbut);
		frame.add(resetbut);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource() == resetbut) {
			userID.setText("");
			userPass.setText("");
		}
		if(e.getSource() == loginbut) {
			String user = userID.getText();
			String password = String.valueOf(userPass.getPassword());
			
			if(logininfo.containsKey(user)) {
				if(logininfo.get(user).equals(password)) {
					message.setForeground(Color.green);
					message.setText("Login Sucessfull");
					WelcomePage welcome = new WelcomePage();
				}
				else {
					message.setForeground(Color.red);
					message.setText("Wrong password");
				}
			}
		}
		
	}

}
