package json_converter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test{


	public static void main(String[] args) {

		Frame mainFrame = new Frame();
		Panel mainPanel = new Panel();
		Label label = new Label("Welcome to AT application", Label.CENTER);
		
//		mainPanel.add(label);
//		mainPanel.setVisible(true);
		mainFrame.add(label);
		mainFrame.setFont(new Font(Font.SERIF, Font.PLAIN, 11));
//		Window w = new Window(mainFrame);
		mainFrame.setBounds(400, 210, 500, 300);
//		w.setBackground(new Color(176, 17, 214));
		mainFrame.toFront();
		mainFrame.setVisible(true);
		
//		JPanel mainPanel = new JPanel();
//

//		
//		mainPanel.setForeground(new Color(176, 17, 194));
//		mainPanel.setBounds(500, 200, 508, 304);
//		mainPanel.setVisible(true);
//		
//		mainFrame.setBounds(600, 250, 578, 374);
//		mainFrame.setForeground(new Color(176, 17, 194));
//		mainFrame.setVisible(true);
//		mainFrame.add(mainPanel);
		System.out.println("called main process");
//		mainContainer.setBackground(new Color(199, 60, 214));
//		mainContainer.setSize(1000, 500);
		
	}

}
