import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

class Fishing
{
       public static void main(String[] args) 
    {
        
        JFrame frame = new JFrame("Fish APP"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);
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