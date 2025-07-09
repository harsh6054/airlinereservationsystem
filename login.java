import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class login extends JFrame implements ActionListener
{
    ImageIcon i1,i2,i3,i4,i5,i6,i7;
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1;
    JTextField t1;
    TextField t2;
    String msg="Login Successfully";
    String pmsg="Incorrect Password - Please ReEnter Password";
    String umsg="Incorrect Username - Please ReEnter Password";
    login()
    {
        setSize(200,200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login Page");
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
        setIconImage(icon); 

        //login png
        i7  = new  ImageIcon("Login to fly.png");
        l6=new JLabel(i7);
        l6.setBounds(240,30,300,400);
        add(l6);


         //logo for login
        i3=new ImageIcon("logo1.png");
        l3=new JLabel(i3);
        l3.setBounds(960,230,180,150);
        add(l3);


        //username
        i4 =new ImageIcon("username.png");
        l4=new JLabel(i4);
        l4.setBounds(920,330,80,90);
        t1 = new JTextField();
        t1.setBounds(1000,361,150,30);
        t1.setFont(new Font("Courier",Font.BOLD,20));
        add(t1);
        add(l4);

        //password
        i5=new ImageIcon("pass.png");
        l5=new JLabel(i5);
        l5.setBounds(920,400,80,90);
        t2=new TextField(12);
        t2.setEchoChar('*');
        t2.setFont(new Font("Courier",Font.BOLD,30));
        t2.setBounds(1000,437,150,30);
        add(t2);
        add(l5);

        //login button
        i6=new ImageIcon("loginbtn1.png");
        b1=new JButton(i6);
        b1.setBounds(990,500,110,35);
        add(b1);
        b1.addActionListener(this);

    

        //login baground
        i2=new ImageIcon("white1.png");
        l2=new JLabel(i2);
        l2.setBounds(750,20,606,770);
        add(l2);
       

        //background image
        i1=new ImageIcon("airoplan.jpg");
        l1=new JLabel(i1);
        l1.setBounds(0,0,1300,800);
        add(l1); 

    }  
    public static void main(String args[]) 
    {
        login log=new login();
    }
    public void  actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            if(t1.getText().equals("admin"))
            {
                if(t2.getText().equals("pass"))
                {
                    JOptionPane.showMessageDialog(this, msg);
                    reservantion r=new reservantion();
                    r.show();
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this, pmsg);
                    t2.setText("");
                    t1.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, umsg);
                t1.setText("");
                 
            }
        }
    }
}
