
package backgroudcolor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CSCOURSES extends JFrame implements ActionListener 
{
    JMenu courses, CSunits;
    public CSCOURSES()
    {
        JMenuBar menu=  new JMenuBar();
        setJMenuBar(menu);
        
        getContentPane().setBackground(Color.BLUE);
        JFrame frame= new JFrame("EXIT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        //CREATIING IMAGE ICON
        JButton bt= new JButton(new ImageIcon("image.png"));
        JLabel lab = new JLabel(new ImageIcon("image.png"));
        bt.setFocusPainted(false);
        frame.add(bt, BorderLayout.SOUTH);
        frame.add(lab, BorderLayout.CENTER);
        frame.setBackground(Color.yellow);
        frame.setBounds(50,50,200,200);
        frame.setVisible(true);
        courses= new JMenu("CS CORE COURSEA ".toUpperCase());
        CSunits= new JMenu("CS OPTIONS");
        //ADD MENU TO MENUbar
        menu.add(courses);
        menu.add(CSunits);
       
        //link with actionListener for event handling
        courses.addActionListener(this);
        CSunits.addActionListener(this);
        
        courses.add(new  JMenuItem("Computer Science"));
        courses.add(new JMenuItem("Iinformation Technology"));
        courses.add(new  JMenuItem("ETS"));
        
        CSunits.add(new JMenuItem("Network Programming"));
        CSunits.add(new  JMenuItem("Mobile Computing"));
        CSunits.add(new  JMenuItem("Python Programming"));
        
        setTitle("BCS 313 MENU");
        setSize(500,300);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String str1= e.getActionCommand();
        System.out.println("You selected "+ str1);
    }
    public static void main(String[]args)
    {
        new CSCOURSES();
        
    }
    
}
        
   
        
    

    

  

