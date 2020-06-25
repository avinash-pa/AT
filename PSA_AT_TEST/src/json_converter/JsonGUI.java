package json_converter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JsonGUI implements  ActionListener{

	int count;
	
	private JFrame jframe;
	private JPanel jpanel;
	private JLabel headerField;
	private JTextField headerText;
	private JLabel headerFieldCount;
	private JTextField headerFieldText;
	private JLabel jlabel2;
	
	public JsonGUI() {
		
		jframe = new JFrame();
		jpanel = new JPanel(); 
		
		headerField = new JLabel("Header Value");
		headerField.setBounds(10 ,20, 30, 25);
		jpanel.add(headerField);
	
		headerFieldCount = new JLabel("NO OF Header");
		headerFieldCount.setBounds(20 ,20, 30, 25);
		jpanel.add(headerFieldCount);
		
		headerText = new JTextField(10);
		headerText.setBounds(10 ,50, 20, 25);
		jpanel.add(headerText);

		headerFieldText = new JTextField(10);
		headerFieldText.setBounds(20 ,50, 20, 25);
		jpanel.add(headerFieldText);
		
		jlabel2 = new JLabel("AT JSON FIELDS");
		JButton jbutton = new JButton("Next");
		jbutton.addActionListener(this);
		Image frameicon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\P1324363\\eclipse-workspace\\PSA_AT_TEST\\template_json\\jsonicon.jpg");		
		
		jpanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 50));
		jpanel.setLayout(new GridLayout(2,3));
		jpanel.add(headerFieldCount);
		jpanel.add(jlabel2);
		jpanel.add(jbutton);
		
		jframe.add(jpanel,BorderLayout.AFTER_LAST_LINE);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setTitle("TEST DATA(JSON)");
		jframe.setIconImage(frameicon);
		jframe.setSize(800, 400);
		jframe.setVisible(true);
	}
	
	
	public static void main(String[] args) {
	
		new JsonGUI();
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		count++;
		headerFieldCount.setText("Next clicked : " + count);
		
	}
	
	
}
