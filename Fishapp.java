import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

class Fishing
{
       public static void main(String[] args) 
    {
        
        JFrame frame = new JFrame("Fish APP"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
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

        label1.setBounds(125,30,200,20);
        speciesLabel.setBounds(60,100,75,20);
        weightLabel.setBounds(60,150,75,20);
        lengthLabel.setBounds(60,200,75,20);

        frame.add(label1);
        frame.add(speciesLabel);
        frame.add(weightLabel);
        frame.add(lengthLabel);
        frame.setLayout(null);
        
        JTextField speciesField = new JTextField();
        JTextField weightField = new JTextField();
        JTextField lengthField = new JTextField();

        speciesField.setBounds(150,100,150,20);
        weightField.setBounds(150,150,150,20);
        lengthField.setBounds(150,200,150,20);

        frame.add(speciesField);
        frame.add(weightField);
        frame.add(lengthField);

        frame.setVisible(true); //Needs to be last line to initialize
        
        
        /*
        System.out.println("hello");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the location you were fishing");
        String location = input.next();
        System.out.println("The location is: "+location);
        System.out.println("Enter the species that you caught");
        String species = input.next();
        System.out.println("The species you caught was: "+species);
        */

    }


}