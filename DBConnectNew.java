import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class DBConnectNew extends Frame implements ActionListener
{
	TextField t1,t2;
	Button b1;
	Connection con;
	String user,pass;
	String nm,sql;
	DBConnectNew()
	{
		System.out.println("In Construtor");
		
		this.setSize(400,400);
		this.setVisible(true);
		this.setTitle("JDBC Demo");
		this.setLayout(new FlowLayout());

		t1=new TextField(15);
		t2=new TextField(15);
		b1=new Button("Submit");
		add(t1);
		add(t2);
		add(b1);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		//System.out.println("Button is working..");
		user=t1.getText();
		pass=t2.getText();	
		System.out.println("UserName="+user+" , Password="+pass);	
		try
		{
			sql="insert into login values (?,?)";
			PreparedStatement ps=con.prepareStatement(sql);	
			ps.setString(1,user);
			ps.setString(2,pass);
			ps.executeUpdate();
			con.close();
		}catch(Exception e){}
		
	}
	public static void main(String a[])throws Exception
	{
		TextField t1,t2;
	Button b1;
	Connection con;
	String user,pass;
	String nm,sql;
		//DBConnectNew db=new DBConnectNew();
		
		// Step 1: Creation of URL
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		
		
		//Step 2: Connection
		con=DriverManager.getConnection("jdbc:odbc:MP");

		System.out.println("Connection created..");

		// Step 3: Statement interface

		Statement stmt=con.createStatement();

		
		
		ResultSet rs=stmt.executeQuery("select * from login");

		while(rs.next())
		{
			System.out.println("UserName: "+rs.getString("user_name"));
			System.out.println("Password: "+rs.getString("password"));
		}
		con.close();
		
	}
}