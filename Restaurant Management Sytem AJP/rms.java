import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*; 
import java.sql.*;   
public class rms extends JFrame  
{  
  	Container co;  
  	public static String st1="",st2="",st3="",st4="",st5="",p_us="",p_ps="",smsg="",sres="";   	  	
	public static int i=0,p_val=0;   
	public static float samt=0;  
	JButton b1,b2,b3,b4;
	JPanel p1,p2;	
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	ImageIcon im1;
  
  	public rms()  
  	{  
  	  	co=getContentPane();  
  	  	JTabbedPane jtp=new JTabbedPane();  
  	  	jtp.add("Home",new home());   	  	 
   	  	jtp.add("Register",new Register());    	  	
	 	jtp.add("Menu",new menu());  	
		jtp.add("About Us",new as1());
		jtp.add("Exit",new exit());
		Font f=new Font("Comic Sans MS",Font.ITALIC,25);    	  	
		jtp.setFont(f);    	  	
		jtp.setForeground(Color.blue);    	  	
		jtp.setBackground(Color.black);    	  	
		co.add(jtp);  
  	  	  
  	  	setSize(1950,1150);    	  	
		setVisible(true);  
  
  	}  
  
  	public static void main(String args[])  
  	{  
  	  	rms t=new rms();  
  	  	  
  	}  
}  
class home extends JPanel 
{ 
 	ImageIcon img1,img2;  	
        	JLabel l1,l2,l3;  
	Font w;
			
	public home()
 	{ 
 	 	setLayout (null); 
		img1=new ImageIcon("login.jpg"); 
		l1=new JLabel(img1);
		ImageIcon img2= new ImageIcon();
		l2=new JLabel(img2);
		l2=new JLabel("Welcome to");
		l3=new JLabel("*THREEPETALS* Restaurant");

		l1.setBounds(0,0,1920,1200); 
		l2.setBounds(600,200,500,100);
		l3.setBounds(350,290,1000,100);
 		add(l1); l1.add(l2); l1.add(l3);
 	 	setVisible(true); 
	
		w=new Font("Comic Sans MS",Font.BOLD,70);   	 	
		l2.setFont(w);  
		w=new Font("Comic Sans MS",Font.ITALIC | Font.ITALIC,70);   	 	
		l3.setFont(w);  
		l2.setForeground(Color.orange); 
		l3.setForeground(Color.black); 

 	} 
} 
class Register extends JPanel implements ActionListener  
{  
  	JButton b1;  
  	JLabel l,l1,l2,l3,l4;  
  	JTextField t1,t3,t4;  
	JPasswordField t2;
  	ImageIcon im;  
  	JCheckBox c1;  
  	CardLayout c;  
 	JButton bt1; 
 
 	public Register()  	  
 	{ 
 	 	setVisible(true);  	 	
		setSize(1000,1000);  	  	
		setLayout(null);  
  	 	   	 
  	 	b1=new JButton("Register");   	 
  	  
 		b1.setOpaque(false);   	 	
		b1.addActionListener(this);     	  	
		b1.setBounds(550,60,300,50);   	  	 	 
 	 	l1=new JLabel("Name:");   	  	  	 	
		l2=new JLabel("Password:");     	 	 	  	 		
		l3=new JLabel("Contact No.:");   	  	 	  	 
 	 	l4=new JLabel("Address:");  
  
  	  	t1=new JTextField();    	 	
		t2=new JPasswordField();     	 	
		t3=new JTextField();    	 	
		t4=new JTextField();  
  
  	  	c1=new JCheckBox("I accept all terms & conditions");   	  	  	 		
		c1.setOpaque(false);  
  
  	  	bt1=new JButton("Register");   	  	  	 
		bt1.setContentAreaFilled(false);  	  
  
  	  	l1.setBounds(100,50,300,50);   	 	
		t1.setBounds(260,60,400,30); 
   	  	 
 	 	l2.setBounds(100,150,300,50);  	 	
		t2.setBounds(260,160,400,30);  
  	  	 
		l3.setBounds(100,250,300,50); 
		t3.setBounds(260,260,400,30);  
		l4.setBounds(100,350,500,60);   	
		t4.setBounds(260,360,400,60); 
   	  	  	 	
		bt1.setBounds(400,750,400,50); 
		c1.setBounds(100,780,500,40);   
  
  	  	Font f=new Font("Elephant",Font.BOLD,20);  
		Font f1=new Font("Calibri",Font.PLAIN,18);  
 
  	  	l1.setFont(f);    	 	t1.setFont(f1);  
  	  	 
 	 	l2.setFont(f);    	 	t2.setFont(f1);  
  	  	 
 	 	l3.setFont(f);    	 	t3.setFont(f1);  
  	  	 
 	 	l4.setFont(f);    	 	t4.setFont(f1);  
  	  	 
 	  	f=new Font("Consolas",Font.BOLD,40);   	 	
		c1.setFont(f);  
 	 	 
		f=new Font("Britanic Bold",Font.BOLD,30); 
		b1.setFont(f); 
		bt1.setFont(f);  
 	  
 	 	l1.setForeground(Color.black);   	 	
		l2.setForeground(Color.black);   	 	
		l3.setForeground(Color.black);   	  	 	
		l4.setForeground(Color.black);  	 	  	 
 	 	c1.setForeground(Color.black);  
  	  
  	 	b1.setForeground(Color.red);    	 	
		b1.setBackground(Color.green); 	   	  	
		bt1.setForeground(Color.red);  
 
 	 	add(l1);add(l2);add(l3);add(l4);  	 				
		add(t1);add(t2);add(t3);add(t4); 
		add(c1);
 
 	 	bt1.setBounds(0,0,1300,900); 
 	 	add(bt1); 
 	 	bt1.addActionListener(this); 
 
 	 	im=new ImageIcon("registration.jpg");  	 	
		l=new JLabel(im); 
 	 	l.setBounds(0,0,1600,900);  
 	 	add(l);  
  	}  
 	public void actionPerformed(ActionEvent ae)  
 	{   	  	 
	try  
 	{  
 	 	 	String s=ae.getActionCommand();  	  	    	  	  		
			if(ae.getSource()==bt1)  
  	  	  	{  
  	  	  	  	System.out.println("Ok");
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
  	  	  	 	Connection co=DriverManager.getConnection("jdbc:odbc:Restaurant");  
 	  	  	  	String nm=t1.getText(); 
 	 	 	 	String password=t2.getText(); 
 	 	   	  	String Contact=t3.getText(); 
 	 	 	   	String Address=t4.getText();  
  
      		        		PreparedStatement ps=co.prepareStatement("insert into Customer_reg(nm,password,Contact,Address)values(?,?,?,?)");  
  	  	  	  	  	  	  
  	  	  	  	ps.setString(1,nm);  	 	 	 	
				ps.setString(2,password);    	 	 	 	
				ps.setString(3,Contact);  	 	 	 	
				ps.setString(4,Address);   	  	  	 	
				ps.executeUpdate();  
  
 	  	  	 	JOptionPane.showMessageDialog(this,"Successfully Registeblack:- "+nm);  
  	  	 	 	ps.close();   	  	 
	 	 	co.close();  
	 	 	} 	  
	} catch(Exception e){}  
 	} 
} 
class menu extends JPanel implements ActionListener 
{ 
 	JButton b1; 
 	ImageIcon i1; 
 	JLabel l1,l2,l3,l4,l5,l6,l7,l8; 
 	JCheckBox 
	c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36; 
 	Font f1,f2,f3; 
 
 	public menu() 
 	{ 	 
 	 	 
 	setLayout(null);  	 	
	i1=new ImageIcon("menu.jpg");  	 	
	l1=new JLabel(i1); 	
	l1.setBounds(0,3,1350,760); 
  	JTabbedPane jt=new JTabbedPane();  

 
 	f1=new Font("Algerian",Font.BOLD | Font.ITALIC,60);  	 	
	f2=new Font("Mongolian Baiti",Font.BOLD,30);  
	f3=new Font("Serif",Font.ITALIC | Font.BOLD,20); 	 	
	b1=new JButton("Order");  	 	
	b1.setForeground(Color.red);  	 
	b1.setBackground(Color.yellow);	 	
	b1.setBounds(580,600,160,40);  	 	
	b1.addActionListener(this); 
 
 
	l2=new JLabel("OUR DAILY SPECIALS"); 
 	l3=new JLabel("SOUPS");  	 	
	l4=new JLabel("STARTERS");  	 	
	l5=new JLabel("ROTI & NAAN");  	 	
	l6=new JLabel("RICE & BIRYANI");  	 	
	l7=new JLabel("MAIN COURSE");  	 	
	l8=new JLabel("DESERT & BEVERAGES"); 
 
	b1.setFont(f3);
 	l2.setFont(f1);  	 		
	l2.setForeground(Color.yellow);  
                    l2.setBackground(Color.green);	 	
	l3.setFont(f2);l3.setForeground(Color.red);  	 	
	l4.setFont(f2);l4.setForeground(Color.pink);   	 
	l5.setFont(f2);l5.setForeground(Color.red);  	 	
	l6.setFont(f2);l6.setForeground(Color.pink);  	 	
	l7.setFont(f2);l7.setForeground(Color.red);  	 	
	l8.setFont(f2);l8.setForeground(Color.red); 
 	 	 
 	l2.setBounds(420,30,700,50);  	 	
	l3.setBounds(220,105,320,50);  	 	
	l4.setBounds(590,105,320,50);  	 	
	l5.setBounds(150,360,400,50);  	 	
	l6.setBounds(540,360,400,50); 
	l7.setBounds(980,105,320,50); 
	l8.setBounds(930,360,500,50); 
 
	c1=new JCheckBox("Veg Sweet Corn Soup                      Rs.100"); 
	c2=new JCheckBox("Veg Manchow Soup                          Rs.130");  	 
	c3=new JCheckBox("Veg Hot and Sour Soup                    Rs.100");  	 	
	c4=new JCheckBox("Veg Mushroom Soup                        Rs.110");  	 
	c5=new JCheckBox("Palak Soup                                          Rs.115");  	 	
	c6=new JCheckBox("Lime Coriander Soup			                       Rs.120"); 
 
 	c7=new JCheckBox("Veg Shezwan Chilli                                        Rs.170");  	
 	c8=new JCheckBox("Paneer Satay                                                  Rs.210");  	
 	c9=new JCheckBox("Paneer Crispy Garlic Sauce                        Rs.230");  	 
	c10=new JCheckBox("Gobi Manchurian                                            Rs.140");  	
 	c11=new JCheckBox("Baby Corn Chilli                                              Rs.220");  	
 	c12=new JCheckBox("Veg 65                                                               Rs.190"); 
 
 	c13=new JCheckBox("Veg Kadai                                          Rs.240");  	 
	c14=new JCheckBox("Mushroom Handi                              Rs.270");  	
 	c15=new JCheckBox("Paneer Rajwadi                                 Rs.245");  	 
	c16=new JCheckBox("Paneer Chingari                                 Rs.265");  	 
	c17=new JCheckBox("Kaju Makhanwala                               Rs.300");  	
 	c18=new JCheckBox("Veg Kolhapuri                                      Rs.280"); 
 
 	c19=new JCheckBox("Plain Roti                                              Rs.20"); 
	c20=new JCheckBox("Butter Roti                                           Rs.30"); 
	c21=new JCheckBox("Butter Naan                                         Rs.35"); 
	c22=new JCheckBox("Garlic Naan                                          Rs.50"); 
	c23=new JCheckBox("Kulcha                                                   Rs.45"); 
	c24=new JCheckBox("Rumali Roti                                          Rs.40"); 
  
 	c25=new JCheckBox("Plain Rice                                                         Rs.70");  	 
	c26=new JCheckBox("Jeera Rice                                                       Rs.80");  	 
	c27=new JCheckBox("Fried Rice                                                         Rs.120");  	
 	c28=new JCheckBox("Veg Biryani                                                      Rs.150");  	 
	c29=new JCheckBox("Paneer Biryani                                                Rs.170");  	 
	c30=new JCheckBox("Tava Pulav                                                       Rs.135"); 
 
 	c31=new JCheckBox("Sweet Lassi                                           Rs.80");  	 
	c32=new JCheckBox("Cold Coffee                                             Rs.50");  	 
	c33=new JCheckBox("Roasted Hazelnut Coffee                    Rs.100");  	
 	c34=new JCheckBox("Mojito                                                        Rs.120");  	
 	c35=new JCheckBox("Falooda                                                     Rs.90");  	 
	c36=new JCheckBox("Sizzling Chocolate Brownie                  Rs.210"); 
 
 
 	c1.setBounds(120,150,300,30);  	 
	c2.setBounds(120,180,300,30);  	 
	c3.setBounds(120,210,300,30);  	 
	c4.setBounds(120,240,300,30);  	 
	c5.setBounds(120,270,300,30); 
  	c6.setBounds(120,300,300,30); 
	c1.setForeground(Color.blue);
	c2.setForeground(Color.blue);
	c3.setForeground(Color.blue);
	c4.setForeground(Color.blue);
	c5.setForeground(Color.blue);
	c6.setForeground(Color.blue);
	

	c7.setBounds(515,150,300,30); 
	c8.setBounds(515,180,300,30); 	
	c9.setBounds(515,210,300,30); 
 	c10.setBounds(515,240,300,30);  	 	
	c11.setBounds(515,270,300,30);  	 	
	c12.setBounds(515,300,300,30); 
	c7.setForeground(Color.blue);
	c8.setForeground(Color.blue);
	c9.setForeground(Color.blue);
	c10.setForeground(Color.blue);
	c11.setForeground(Color.blue);
	c12.setForeground(Color.blue);
 
 	c13.setBounds(950,150,300,30);  		
 	c14.setBounds(950,180,300,30);  	 
	c15.setBounds(950,210,300,30);  	 
	c16.setBounds(950,240,300,30);  	
 	c17.setBounds(950,270,300,30);  	
 	c18.setBounds(950,300,300,30); 
	c13.setForeground(Color.blue);
	c14.setForeground(Color.blue);
	c15.setForeground(Color.blue);
	c16.setForeground(Color.blue);
	c17.setForeground(Color.blue);
	c18.setForeground(Color.blue);
 
 	c19.setBounds(120,405,300,30);  	
	c20.setBounds(120,435,300,30);  	
 	c21.setBounds(120,465,300,30);  	
 	c22.setBounds(120,495,300,30);  	 
	c23.setBounds(120,525,300,30);  	
 	c24.setBounds(120,555,300,30); 
	c19.setForeground(Color.blue);
	c20.setForeground(Color.blue);
	c21.setForeground(Color.blue);
	c22.setForeground(Color.blue);
	c23.setForeground(Color.blue);
	c24.setForeground(Color.blue);
 
 	c25.setBounds(515,405,300,30);  	
 	c26.setBounds(515,435,300,30);  	 
	c27.setBounds(515,465,300,30); 
  	c28.setBounds(515,495,300,30); 
	c29.setBounds(515,525,300,30); 
	c30.setBounds(515,555,300,30); 
	c25.setForeground(Color.blue);
	c26.setForeground(Color.blue);
	c27.setForeground(Color.blue);
	c28.setForeground(Color.blue);
	c29.setForeground(Color.blue);
	c30.setForeground(Color.blue);

	c31.setBounds(950,405,300,30); 
 	c32.setBounds(950,435,300,30);  	
 	c33.setBounds(950,465,300,30);  	
 	c34.setBounds(950,495,300,30);  	 
	c35.setBounds(950,525,300,30);  	
 	c36.setBounds(950,555,300,30); 
	c31.setForeground(Color.blue);
	c32.setForeground(Color.blue);
	c33.setForeground(Color.blue);
	c34.setForeground(Color.blue);
	c35.setForeground(Color.blue);
	c36.setForeground(Color.blue);
 	 	 
 
 	add(l2);  add(l3);  add(l4);  add(l5);  add(l6);  add(l7);  add(l8);  add(b1); 
 	 	 
 	add(c1);  add(c2);  add(c3);  add(c4);  add(c5);  add(c6);  add(c7);  add(c8);  add(c9); 
 	 	
        add(c10); add(c11); add(c12); add(c13); add(c14); add(c15); add(c16); add(c17); add(c18); 
 	 	 
 	add(c19); add(c20); add(c21); add(c22); add(c23); add(c24); add(c25); add(c26); add(c27); 

        add(c28); add(c29); add(c30); add(c31); add(c32); add(c33); add(c34); add(c35); add(c36);  add(l1); 
 	} 
 	public void actionPerformed(ActionEvent ae) 
 	{ 
 	 	float amt=0;  	 	String msg=" ";  	 	if(c1.isSelected()) 
 	 	{ 
 	 	 	amt=amt+100; 
 	 	 	msg=msg+"Veg Sweet Corn Soup Rs.100\n"; 
 	 	} 
 	 	if(c2.isSelected()) 
 	 	{ 
 	 	 	amt=amt+130; 
 	 	 	msg=msg+"Veg Manchow Soup Rs.130\n"; 
 	 	} 
       if(c3.isSelected()) 
            {
	 	amt=amt+100; 
	 	msg=msg+"Veg Hot and Sour Soup Rs.100\n"; 
 	 	} 
 
 	 	if(c4.isSelected()) 
 	 	{ 
 	 	 	amt=amt+110; 
 	 	 	msg=msg+"Veg Mushroom Soup Rs.110\n"; 
 	 	} 
 	 	if(c5.isSelected()) 
 	 	{ 
 	 	 	amt=amt+115; 
 	 	 	msg=msg+"Palak Soup Rs.115\n"; 
 	 	} 
 
 	 	if(c6.isSelected()) 
 	 	{ 
 	 	 	amt=amt+120; 
 	 	 	msg=msg+"Lime Coriander Soup Rs.120\n"; 
 	 	} 
 
 	 
 	 	if(c7.isSelected()) 
	 	{ 
	 	amt=amt+170; 
		msg=msg+"Veg Schezwan Chilli Rs.170\n"; 
		} 
		if(c8.isSelected()) 
 	 	{ 
 	 	 	amt=amt+210; 
 	 	 	msg=msg+"Paneer Satay Rs.210\n"; 
 	 	} 
 	 	if(c9.isSelected()) 
 	 	{ 
 	 	 	amt=amt+230; 
 	 	 	msg=msg+"Paneer Crispy Garlic Sauce Rs.230\n"; 
 	 	} 
 
 	 	if(c10.isSelected()) 
 	 	{ 
 	 	 	amt=amt+140; 
 	 	 	msg=msg+"Gobi Manchurian Rs.140\n"; 
 	 	} 
 
 	 	if(c11.isSelected()) 
 	 	{ 
 	 	 	amt=amt+220; 
 	 	 	msg=msg+"Baby Corn Chilli Rs.220\n"; 
 	 	} 
		if(c12.isSelected()) 
		{ 
			amt=amt+190;  	
			msg=msg+"Veg 65 Rs.190\n"; 
		} 
 	 	if(c13.isSelected()) 
 	 	{ 
 	 	 	amt=amt+240; 
 	 	 	msg=msg+"Veg Kadai Rs.240\n"; 
 	 	} 
 
 	 	if(c14.isSelected()) 
 	 	{ 
 	 	 	amt=amt+270; 
 	 	 	msg=msg+"Mushroom Handi Rs.270\n"; 
 	 	} 
 	 	if(c15.isSelected()) 
 	 	{ 
 	 	 	amt=amt+245; 
 	 	 	msg=msg+"Paneer Rajwadi Rs.245\n"; 
 	 	} 
 	 	if(c16.isSelected()) 
 	 	{ 
 	 	 	amt=amt+265; 
 	 	 	msg=msg+"Paneer Chingari Rs.265\n"; 
 	 	} 
		if(c17.isSelected()) 
		{
	 	amt=amt+300; 
	 	msg=msg+"Kaju Makhanwala Rs.300\n"; 
 	 	} 
 	 	if(c18.isSelected()) 
 	 	{ 
 	 	 	amt=amt+280; 
 	 	 	msg=msg+"Veg Kolhapuri Rs.280\n"; 
 	 	} 
 	 	if(c19.isSelected()) 
 	 	{ 
 	 	 	amt=amt+20; 
 	 	 	msg=msg+"Plain Roti Rs.20\n"; 
 	 	} 
 
 	 	if(c20.isSelected()) 
 	 	{ 
 	 	 	amt=amt+30; 
 	 	 	msg=msg+"Butter Roti Rs.30\n"; 
 	 	} 
 	 	if(c21.isSelected()) 
 	 	{ 
 	 	 	amt=amt+35; 
 	 	 	msg=msg+"Butter Naan Rs.35\n"; 
		} 
		if(c22.isSelected()) 
		{
	 	amt=amt+50; 
	 	msg=msg+"Garlic Naan Rs.50\n"; 
 	 	} 
 	 	if(c23.isSelected()) 
 	 	{ 
 	 	 	amt=amt+45; 
 	 	 	msg=msg+"Kulcha Rs.45\n"; 
 	 	} 
 	 	if(c24.isSelected()) 
 	 	{ 
 	 	 	amt=amt+40; 
 	 	 	msg=msg+"Rumali Roti Rs.40\n"; 
 	 	} 
 	 	if(c25.isSelected()) 
 	 	{ 
 	 	 	amt=amt+70; 
 	 	 	msg=msg+"Plain Rice Rs.70\n"; 
 	 	} 
 	 	if(c26.isSelected()) 
 	 	{ 
 	 	 	amt=amt+80; 
 	 	 	msg=msg+"Jeera Rice Rs.80\n"; 
 	 	} 
		if(c27.isSelected()) 
		{ 
			amt=amt+120;  	
			msg=msg+"Fried Rice Rs.120\n"; 
		} 
 	 	if(c28.isSelected()) 
 	 	{ 
 	 	 	amt=amt+150; 
 	 	 	msg=msg+"Veg Biryani Rs.150\n"; 
 	 	} 
 	 	if(c29.isSelected()) 
 	 	{ 
 	 	 	amt=amt+170; 
 	 	 	msg=msg+"Paneer Biryani Rs.170\n"; 
 	 	} 
 	 	if(c30.isSelected()) 
 	 	{ 
 	 	 	amt=amt+135; 
 	 	 	msg=msg+"Tava Pulav Rs.135\n"; 
 	 	} 
 	 	if(c31.isSelected()) 
 	 	{ 
 	 	 	amt=amt+80; 
 	 	 	msg=msg+"Sweet Lassi Rs.80\n"; 
 	 	} 
 	 	if(c32.isSelected()) 
		{ 
	 		amt=amt+50; 
			msg=msg+"Cold Coffee Rs.50\n"; 
		} 
		if(c33.isSelected()) 
 	 	{ 
 	 	 	amt=amt+100; 
 	 	 	msg=msg+"Roasted Hazelnut Coffee Rs.100\n"; 
 	 	} 
 	 	if(c34.isSelected()) 
 	 	{ 
 	 	 	amt=amt+120; 
 	 	 	msg=msg+"Mojito Rs.120\n"; 
 	 	} 
 	 	if(c35.isSelected()) 
 	 	{ 
 	 	 	amt=amt+90; 
 	 	 	msg=msg+"Falooda Rs.90\n"; 
 	 	} 
 	 	if(c36.isSelected()) 
 	 	{ 
 	 	 	amt=amt+210; 
 	 	 	msg=msg+"Sizzling Chocolate Brownie Rs.210\n"; 
 	 	} 
 	 	JOptionPane.showMessageDialog(this,msg+" Total : "+amt); 	 
 	 	rms.smsg=msg; 
	 	rms.samt=amt; 
}
}
class as1 extends JPanel 
{ 
 	ImageIcon img1; 
 	JTextArea jt1; 
 	JLabel l1,l3;  	
	Font f,f1;  	
	public as1() 
 	{ 
 	 	setLayout(null);  	 
		img1=new ImageIcon("aboutus.jpg");  	 	
		l1=new JLabel(img1);  	 		 	
 	 	l3=new JLabel("About Us");  			
	 	f1=new Font("BankGothic Md BT",Font.BOLD,60);  	
	 	l3.setFont(f1);  	
	 	l3.setForeground(Color.orange);  
	 	l3.setBounds(300,-30,400,300); 
 	 	add(l3); 
 	 	setVisible(true); 
 	 	jt1=new JTextArea("\nFor the first time in Sangli, ThreePetals has brought the Open Kitchen \nrestaurant and Fresh Beans Coffee varieties concept where you can \nenjoy a variety of dishes each prepared by the expert chef to give you the best dining \nexperience. We provide you with a wide variety of dishes to choose from, each \ncreated with the perfection which you can enjoy with your family and \nfriends in a peaceful environment.Upholding our motto of healthy eats \nwealthy treats, ThreePetals only serves fresh, hygienic, and highest \nquality food to our valuable customers in a due time. With an open \nkitchen concept, we are established to fill up the need of a place where \nquality comes with consistency in terms of both foods and services, and \na place where you can meet, relax and have a great time together."); 
 	 
 	 	f=new Font("Arial Narrow",Font.BOLD,30);  	 	
		jt1.setFont(f);  	 	
		jt1.setForeground(Color.white); 
 	 	 
 	 	jt1.setOpaque(false);  	 	
		jt1.setEditable(false);  	 
		jt1.setBounds(300,170,1030,500);  	 
		l1.setBounds(0,-10,1370,900);  	 	
		add(jt1);add(l1); 
 	} 
} 
/*class exit extends JPanel
{
	ImageIcon img1,img2;
	JTextArea jt1; 
 	JLabel l1,l2,l3,l4;  	
	Font f;  	
	public exit() 
	{
		setLayout(null); 
		img1=new ImageIcon("exit.jpg"); 
		img2=new ImageIcon();  
		l1=new JLabel(img1); 
		l2=new JLabel(img2);
		l3=new JLabel("Do visit again.... :-)");
		l4=new JLabel("Hope we met your expectations");
		l2=new JLabel("THANK-YOU!");
		Font f=new Font("Algerian",Font.BOLD | Font.ITALIC,42); 
		Font f1=new Font("Copperplate Gothic Bold",Font.BOLD | Font.ITALIC,42);   
		Font f2=new Font("Eras Bold ITC",Font.ITALIC,40);   
		add(l1);
	  	  l1.add(l2);
		l1.add(l3);
		l1.add(l4);
		l2.setFont(f);
		l3.setFont(f1);
		l4.setFont(f2);
		l1.setBounds(0,0,1350,690);
		l2.setBounds(500,135,370,70);
		l3.setBounds(450,200,500,70);
		l4.setBounds(360,270,750,70);
		l3.setForeground(Color.black); 
		l4.setForeground(Color.white); 
		l2.setForeground(Color.white); 
		
	}		
}*/
 
