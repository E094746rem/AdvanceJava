
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class trying {

	public static void main(String[] args) {	
        // JPanel GUI component that function as container of component
        
		ImageIcon image = new ImageIcon("javaec.java/compressed_1679155105312.png");

		JLabel label = new JLabel();
		label.setText("hello there");
        label.setIcon(image);
        //this will move my image to the top of the contianer
        //it is not necessry using V and H align if i am using the layout to null
        //label.setVerticalAlignment(JLabel.BOTTOM);
        // label.setHorizontalAlignment(JLabel.RIGHT);
       label.setBounds(100, 100, 100, 100);

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        // redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
       // bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);

		JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        //this will set the green border in x,y direction and the W,H as well as
        greenPanel.setBounds(0, 250, 580, 400);
        //this will let it use thte original lay out
        //greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);

		JFrame frame = new JFrame();
		// seting a closing for our app EXIT,DO_NOTHING,HIDE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Seting a diemention of x and y axisis
		frame.setSize(680, 780);
		// by seting this value to true we can see our page
		frame.setVisible(true);
		// to show a text in our JFrame by adding
        frame.setLayout(null);
        frame.setTitle("The JFrame Title goes HERE!!<[^]_[^]>"); 
        greenPanel.add(label);
        //redPanel.add(label);
       // bluePanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);

	}

}
