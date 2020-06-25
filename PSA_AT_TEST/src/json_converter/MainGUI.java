package json_converter;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class MainGUI extends JFrame{

	public MainGUI() {
		
		JPanel panel = new JPanel();
		
		JLabel JSONTitle = new JLabel("JSON APPLICATION");
		JSONTitle.setBounds(20,20,30,55);
		panel.add(JSONTitle);
		
		JLabel ATTitle = new JLabel("AT APPLICATION");
		ATTitle.setBounds(10,30,30,25);
		panel.add(ATTitle);
		
		JLabel SQLTitle = new JLabel("SQL APPLICATION");
		SQLTitle.setBounds(10,40,30,25);
		panel.add(SQLTitle);		
		
		JLabel QUEUETitle = new JLabel("QUEUE APPLICATION");
		QUEUETitle.setBounds(10,50,30,25);
		panel.add(QUEUETitle);
		
		JTextField textfield = new JTextField("Header data",2);
		textfield.setBounds(10,60,50,25);
		panel.add(textfield);
		
		panel.setBackground(Color.cyan);
		
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	
		add(panel,BorderLayout.CENTER);
		setSize(800, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
			new MainGUI();
	}
}
