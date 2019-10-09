import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.FileWriter;
import java.util.Date;

class fishapp
{
	

	public static void main(String[] args) 
	 {
	        
	        JFrame frame = new JFrame("Fish APP"); 
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(350,400);
	        //JButton button = new JButton("Press");
	        //frame.getContentPane().add(button);
	        
	        
	        JMenuBar topmenu = new JMenuBar();

	        JMenu m1 = new JMenu("New");
	        JMenu m2 = new JMenu("Save");

	        topmenu.add(m1);
	        topmenu.add(m2);

	        JMenuItem m11 = new JMenuItem("New Trip");
	        JMenuItem m22 = new JMenuItem("Save Trip");

	        m1.add(m11);
	        m2.add(m22);

	        frame.getContentPane().add(BorderLayout.NORTH, topmenu);

	        JLabel label1 = new JLabel("Welcome to FishScribe");
	        JLabel speciesLabel = new JLabel("Fish Species");
	        JLabel weightLabel = new JLabel("Fish Weight");
	        JLabel lengthLabel = new JLabel("Fish Length");

	        label1.setBounds(100,30,200,20);
	        speciesLabel.setBounds(60,100,75,20);
	        weightLabel.setBounds(60,150,75,20);
	        lengthLabel.setBounds(60,200,75,20);

	        frame.add(label1);
	        frame.add(speciesLabel);
	        frame.add(weightLabel);
	        frame.add(lengthLabel);
	        frame.setLayout(null);
	        
	        JTextField speciesField = new JTextField(20);
	        JTextField weightField = new JTextField(20);
	        JTextField lengthField = new JTextField(20);

	        speciesField.setBounds(150,100,150,20);
	        weightField.setBounds(150,150,150,20);
	        lengthField.setBounds(150,200,150,20);

	        frame.add(speciesField);
	        frame.add(weightField);
	        frame.add(lengthField);

	        JButton subBut = new JButton("Submit");
	        subBut.setBounds(120,275,100,20);
	        frame.add(subBut);
	        frame.setVisible(true);
	        

	        subBut.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                System.out.println("Pressed");
	                try 
	                {
	                	FileWriter fw = new FileWriter("fish.txt",true);
	                	BufferedWriter bw = new BufferedWriter(fw);
	                	
	                	String speciesText = speciesField.getText();
	                	String weightText = weightField.getText();
	                	String lengthText = lengthField.getText();
	                	
	                	bw.write("Species: "+speciesText);
	                	bw.write('\n');
	                	bw.write("Weight: "+weightText);
	                	bw.write('\n');
	                	bw.write("Length: "+lengthText);
	                	bw.write('\n');	
	                	Date date = new Date();
	                	String numberAsString = Long.toString(date.getTime());
	                    bw.write(numberAsString);
	                	bw.write('\n');
	                	bw.write('\n');
	                	
	                	speciesField.setText("");
	                	weightField.setText("");
	                	lengthField.setText("");
	                	
	                	bw.close();
	                }
	                catch(IOException ex)
	                {
	                	System.out.println("you a dumbass");
	                }
	            }   
	        });
	    }
	        

	         //Needs to be last line to initialize

}
   

	//C:\Users\Adam\Documents\GitHub\JAVA-Code
	//"C:\Users\Adam Kedra\\Documents\\Code\\JAVA Code"
	//C:\\Users\Adam\\Documents\\GitHub


