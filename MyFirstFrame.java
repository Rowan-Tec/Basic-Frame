
package za.ac.tut.ul;


import java.awt.Color;
import javax.swing.JFrame;

public class MyFirstFrame extends JFrame{

    public MyFirstFrame(){
        setTitle("My First GUI");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.yellow);
        setVisible(true);
        
    }
    
}
