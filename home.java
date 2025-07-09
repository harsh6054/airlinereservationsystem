import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class home extends JFrame implements ActionListener
{
    ImageIcon i1,i2,i3,i4;
    JLabel l1,l2,l3;
    JButton b1,b2;
    home()
    {
        setSize(200,200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Home Page");
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
        setIconImage(icon); 

        //logo image
        i2=new ImageIcon("logo.png");
        l2=new JLabel(i2);
        l2.setBounds(100,30,700,250);
        add(l2);

        //login button
        i3=new ImageIcon("login.png");
        b1=new JButton(i3);
        b1.setBounds(60,600,120,50);
        add(b1);
        b1.addActionListener(this);
        
        //register button
        i4=new ImageIcon("registration.png");
        b2=new JButton(i4);
        b2.setBounds(190,600,120,50);
        add(b2);
        b2.addActionListener(this);

       
        
        //background image
        i1=new ImageIcon("bg.jpg");
        l1=new JLabel(i1);
        l1.setBounds(0,0,1400,1000);
         add(l1);  
         
        

    }
    public static void main(String a[])
    {
        home h=new home();
       
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            login l1=new login();
            l1.show();
            dispose();
        }
        if(ae.getSource()==b2)
        {
            registration r1=new registration();
            r1.show();
            dispose();
        }


    }
}