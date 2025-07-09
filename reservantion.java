import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class reservantion extends JFrame implements ItemListener, ActionListener
{ 

    ImageIcon i1,i2,i3,i4,i5,i6;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton b1;
    JTextField t1;
    JComboBox c1,c2,c3,c4;
    JDialog d1;
    JFrame f;
    String type,from,to,klass;
    String msg="Flight Booked Successfully- Click on Ok to check Ticket";
    reservantion()
    {
        f=new JFrame();
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Reservation Page");
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");    
        f.setIconImage(icon);  
         
      

        //Labels
        l10 =new JLabel("Flight Type    : ");
        l10.setFont(new Font("Times New Roman",Font.BOLD,20));
        l10.setBounds(270,310,150,30);
        f.add(l10);


        l4 =new JLabel("From          : ");
        l4.setFont(new Font("Times New Roman",Font.BOLD,20));
        l4.setBounds(290,360,150,30);
        f.add(l4);

        l5 =new JLabel("To              : ");
        l5.setFont(new Font("Times New Roman",Font.BOLD,20));
        l5.setBounds(290,410,150,30);
        f.add(l5);

        l6 =new JLabel("Booking Date   : ");
        l6.setFont(new Font("Times New Roman",Font.BOLD,20));
        l6.setBounds(260,460,250,30);
        f.add(l6);

        l7 =new JLabel("Class           : ");
        l7.setFont(new Font("Times New Roman",Font.BOLD,20));
        l7.setBounds(290,510,250,30); 
        f.add(l7);


        //textfeild for Bookingdate
        t1 = new JTextField();
        t1.setToolTipText("DD-MM-YYYY");
        t1.setBounds(430,460,140,25);
        f.add(t1);


        //Comboxes
        String f1[] ={"Pune"};
        c1 = new JComboBox(f1);
        c1.setBounds(430,360,140,25);
        f.add(c1);

        c2 = new JComboBox();
        c2.setBounds(430,410,140,25);
        f.add(c2);

        String class1[]={"Economic","Business"};
        c3 = new JComboBox(class1);
        c3.setBounds(430,510,140,25);
        f.add(c3);
        //c3.addItemListener(this);

        String type[]={"Domastic","International"};
        c4 = new JComboBox(type);
        c4.setBounds(430,310,140,25);
        f.add(c4);
        c4.addItemListener(this);




        //book ticket
        i5=new ImageIcon("bookticket.png");
        b1=new JButton(i5);
        b1.setBounds(350,600,190,35);
        f.add(b1);
        b1.addActionListener(this);

        //Airoplane Logo
        i6=new ImageIcon("airoplane1.png");
        l11=new JLabel(i6);
        l11.setBounds(250,20,350,200);
        f.add(l11);


        //Booking Details
        l9 =new JLabel("Booking Details");
        l9.setFont(new Font("Courier",Font.BOLD,30));
        l9.setBounds(320,220,450,100);
        l9.setForeground(Color.RED);
        add(l9);


        //Reservation baground
        i3=new ImageIcon("white2.png");
        l8=new JLabel(i3);
        l8.setBounds(50,80,800,770);
        f.add(l8);

        //solgan
        i2=new ImageIcon("bookflight.png");
        l2=new JLabel(i2);
        l2.setBounds(800,20,350,200);
        f.add(l2);

        //Background
        i1=new ImageIcon("bg3.png");
        l1=new JLabel(i1);
        l1.setBounds(0,0,1290,700);
        f.add(l1);

    }
    public static void main(String args[])
    {
        new reservantion();
    }
    public void itemStateChanged(ItemEvent e)
	{
		
		if(c4.getSelectedItem().equals("Domastic"))
        {
            type = "Domastic";
            c2.removeAllItems();
            c2.addItem("Mumbai");
            c2.addItem("Kokata");
            c2.addItem("Bangalore");
            c2.addItem("Chennai");
            c2.addItem("Delhi");
            c2.addItem("Goa");
            c2.addItem("Hyderabad");
            c2.addItem("Lucknow");
            c2.addItem("Vishkhapatnam");

        }
        if(c4.getSelectedItem().equals("International"))
        {
            type="International";
            c2.removeAllItems();
            c2.addItem("United States");
            c2.addItem("Brazil");
            c2.addItem("Mexico");
            c2.addItem("Canada");
            c2.addItem("France");
            c2.addItem("Germany");
            c2.addItem("Russia");
            c2.addItem("Colombia");


        }
	}
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource().equals(b1))
        {
            JOptionPane.showMessageDialog(this, msg);

            JDialog dialog = new JDialog(f, "Ticket", true);
            dialog.setLayout(null);
            dialog.setSize(500, 380);
            JLabel dl1=new JLabel("Ticket Booked");
            dl1.setBounds(200,10,100, 25);
            dialog.add(dl1);

            JLabel dl2=new JLabel("Flight Type  :");
            dl2.setBounds(90,60,100,25);
            dialog.add(dl2);

            JLabel dl3=new JLabel("From:");
            dl3.setBounds(90,110,100,25);
            dialog.add(dl3);

            JLabel dl4=new JLabel("To:");
            dl4.setBounds(90,160,100,25);
            dialog.add(dl4);

            JLabel dl5=new JLabel("Booked date:");
            dl5.setBounds(90,210,100,25);
            dialog.add(dl5);
            JLabel dl6=new JLabel("Class :");
            dl6.setBounds(90,260,100,25);
            dialog.add(dl6);


            JLabel in1=new JLabel(type);
            in1.setBounds(270,60,100,25);
            dialog.add(in1);

            JLabel in2=new JLabel("Pune");
            in2.setBounds(270,110,100,25);
            dialog.add(in2);

            Object ob=new Object();
            ob=c2.getSelectedItem();
            to=ob.toString();
            JLabel in3=new JLabel(to);
            in3.setBounds(270,160,100,25);
            dialog.add(in3);

            JLabel in4=new JLabel(t1.getText());
            in4.setBounds(270,210,100,25);
            dialog.add(in4);

            Object ob1=new Object();
            ob1=c3.getSelectedItem();
            klass=ob1.toString();
            JLabel in5=new JLabel(klass);
            in5.setBounds(270,260,100,25);
            dialog.add(in5);

            Point location = new Point(750, 260); 
            dialog.setLocation(location);


            f.setVisible(true);

            dialog.setVisible(true);
        }
    }
}