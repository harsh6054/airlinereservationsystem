import javax.swing.*;
import java .awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.*;

public class registration extends JFrame implements ActionListener
{
    ImageIcon i1,i2,i3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t3,t4;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    ButtonGroup bg1;
    SimpleDateFormat dateFormat;
    JButton b1;
    String msg="Password does not match - Please Reset Password";
    registration()
    {
        setSize(200,200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration Page");
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
        setIconImage(icon);

        //Registration form 

        //full name
        l3=new JLabel("Full Name:");
        t1=new JTextField();
        t1.setToolTipText("Enter your Full Name"); 
        l3.setBounds(500, 300, 150, 30);
        t1.setBounds(590,300,150,30);
        t1.setFont(new Font("Courier",Font.BOLD,15));
        add(l3);
        add(t1);

        

        //User name
        l4=new JLabel("User Name:");
        t2=new JTextField();
        t2.setToolTipText("Enter User Name");
        t2.setFont(new Font("Courier",Font.BOLD,15)); 
        l4.setBounds(500, 350, 150, 30);
        t2.setBounds(590,350,150,30);
        add(l4);
        add(t2);

        //password
        l5=new JLabel("Password:");
        p1=new JPasswordField();
        p1.setFont(new Font("Courier",Font.BOLD,15));
        p1.setToolTipText("Create Password"); 
        l5.setBounds(500, 400, 150, 30);
        p1.setBounds(590,400,150,30);
        add(l5);
        add(p1);
        
        //Confirm Password
        l7=new JLabel("Confirm Password:");
        p2=new JPasswordField();
        p2.setToolTipText("Confirm Password"); 
        p2.setFont(new Font("Courier",Font.BOLD,15));
        l7.setBounds(470, 450, 150, 30);
        p2.setBounds(590,450,150,30);
        add(l7);
        add(p2);

        //email
        l8=new JLabel("Email:");
        t4=new JTextField();
        t4.setFont(new Font("Courier",Font.BOLD,15));
        t4.setToolTipText("Enter your Email"); 
        l8.setBounds(940, 300, 150, 30);
        t4.setBounds(990,300,150,30);
        add(l8);
        add(t4);

        //gender
        l9=new JLabel("Gender:");
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        bg1=new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        l9.setBounds(920, 350, 150, 30);
        r1.setBounds(990, 350, 60, 30);
        r2.setBounds(1050,350,80,30);
        add(l9);
        add(r1);
        add(r2);

        //phone
        l6=new JLabel("Phone No:");
        t3=new JTextField();
        t3.setFont(new Font("Courier",Font.BOLD,15));
        t3.setToolTipText("Enter your Phone no"); 
        l6.setBounds(920, 400, 150, 30);
        t3.setBounds(990,400,150,30);
        add(l6);
        add(t3);

        //date of brith
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        String date = dateFormat.format(cal.getTime());
        l6=new JLabel("Date of Birth:");
        t3=new JTextField();
        t3.setToolTipText("DD/MM/YYYY");
        l6.setBounds(900, 450, 150, 30);
        t3.setBounds(990,450,150,30);
        add(l6);
        add(t3);

        //Submit Button
        i3=new ImageIcon("submit.png");
        b1=new JButton(i3);
        b1.setBounds(740,530,220,50);
        add(b1);  
        b1.addActionListener(this);      


        //logo for registration
        i2=new ImageIcon("logo2.png");
        l2=new JLabel(i2);
        l2.setBounds(600,50,600,250);
        add(l2);


        //background image
        i1=new ImageIcon("bg2.jpg");
        l1=new JLabel(i1);
        l1.setBounds(0,0,1270,700);
        add(l1);
    }   
    public static void main(String args[])
    {
        new registration();
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(p1.getText().equals(p2.getText()))
        {
             if(ae.getSource()==b1)
        {
            login re=new login();
            re.show();
            dispose();

        }
        }
        else{
            JOptionPane.showMessageDialog(this, msg);
            p2.setText("");
        }
       
    }
}
