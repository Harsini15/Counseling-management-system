package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;    
public class RegForm  {
	//static JTextField nametxt;
	
	//static JRadioButton female,male;
	//static JComboBox day1,month1,year1;
	public String name,community;
	public int rollno;
	public int biology,physics,chemistry,date,mon,year;
	public RegForm()
	{
 //public static void main(String args[])
 //{
 JFrame frame=new JFrame("Counseling Registration Form");  
 frame. setVisible(true);      
 frame.setBounds(200,100,700,600 );    
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
 Container c=frame.getContentPane();   
 c.setLayout(null);    
 //c.setBackground(Color.white);     
 //Font f=new Font("Arial",Font.BOLD,20);   
 //JLabel heading_lbl=new JLabel();
 //heading_lbl.setBounds(250,5,200,40);
 //heading_lbl.setText("<html><font><u><b>Registration Form</b></u></html>"); 
 //heading_lbl.setFont(f);
 Font f1=new Font("Arial",Font.BOLD,14);
 JLabel name1=new JLabel("Name : ");
 name1.setVisible(true);
 name1.setBounds(50,80,100,30); 
 JTextField nametxt=new JTextField();
 nametxt.setBounds(180,80,180,30); 
 JLabel roll1=new JLabel("Rollno : ");
 //roll1.setEnabled(true);
 roll1.setVisible(true);
 roll1.setBounds(50,120,100,30);
 JTextField rolltxt=new JTextField();
 rolltxt.setBounds(180,120,180,30);
 JLabel gender=new JLabel("Gender : ");
 gender.setBounds(50,160,150,30);   
 Cursor cur=new Cursor(Cursor.HAND_CURSOR); 
 JRadioButton male=new JRadioButton("Male");
 male.setBounds(180,160,70,30);
 male.setBackground(Color.white);
 male.setCursor(cur);
 JRadioButton female=new JRadioButton("Female");
 female.setBounds(280,160,80,30);
 female.setBackground(Color.white);
 female.setCursor(cur);
 /*ButtonGroup gender_grp=new ButtonGroup();
 gender_grp.add(male);    
 gender_grp.add(female);*/    
 JLabel dob=new JLabel("Date of Birth : ");
 dob.setBounds(50,200,100,30); 
 String days[]=new String[31];
 for(int i=1;i<=31;i++)
 days[i-1]=Integer.toString(i);
 //days[i-1]=i;
 JComboBox day1=new JComboBox(days);
 day1.setBounds(180,200,40,30);
 //String months[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec" }; 
 String months[]=new String[31];
 for(int i=1;i<=12;i++)
 days[i-1]=Integer.toString(i);
 //days[i-1]=i;
 JComboBox month1=new JComboBox(months);
 month1.setBounds(230,200,60,30);	
 String years[]=new String[70];
 for(int i=1980;i<=2018;i++)
 years[i-1951]=Integer.toString(i);
 JComboBox year1=new JComboBox(years);
 year1.setBounds(300,200,60,30);
 JLabel com=new JLabel("Community : ");
 com.setBounds(50,240,100,30); 
 JTextField comtxt=new JTextField();
 comtxt.setBounds(180,240,180,30); 
 JLabel bio=new JLabel("Biology marks : ");
 bio.setBounds(50,280,100,30); 
 JTextField biotxt=new JTextField();
 biotxt.setBounds(180,280,180,30); 
 JLabel phy=new JLabel("Physics marks : ");
 phy.setBounds(50,320,100,30); 
 JTextField phytxt=new JTextField();
 phytxt.setBounds(180,320,180,30); 
 JLabel chem=new JLabel("Chemistry marks : ");
 chem.setBounds(50,360,100,30); 
 JTextField chemtxt=new JTextField();
 chemtxt.setBounds(180,360,180,30); 
 JButton submit=new JButton("Submit");
 submit.setBounds(180,500,120,40);
 submit.setCursor(cur);  
 submit.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent event){
 //submit_action(event);
 String name=nametxt.getText();
 int rollno=Integer.parseInt(rolltxt.getText());
 String gender="Male";
 if(female.isSelected()==true)
 gender="Female";
 int date=Integer.parseInt((String)day1.getSelectedItem());
 int mon=Integer.parseInt((String)month1.getSelectedItem());
 int year=Integer.parseInt((String)year1.getSelectedItem());
 String community=comtxt.getText();
 int biology=Integer.parseInt(biotxt.getText());
 int physics=Integer.parseInt(phytxt.getText());
 int chemistry=Integer.parseInt(chemtxt.getText());
 
 } 
 });
 /*JTextArea output_txtArea=new JTextArea();
 output_txtArea.setBounds(380,80,260,320);*/	
 name1.setFont(f1);
 com.setFont(f1);
 roll1.setFont(f1);
 gender.setFont(f1);
 dob.setFont(f1);
 nametxt.setFont(f1);
 comtxt.setFont(f1);
 male.setFont(f1);
 female.setFont(f1);
 rolltxt.setFont(f1);
 bio.setFont(f1);
 phy.setFont(f1);
 chem.setFont(f1);
 biotxt.setFont(f1);
 phytxt.setFont(f1);
 chemtxt.setFont(f1);
 submit.setFont(f1);
 //output_txtArea.setFont(f1); 
 //c.add(heading_lbl); 
 c.add(name1); 
 c.add(roll1);
 c.add(gender);
 c.add(male);
 c.add(female);
 c.add(dob);
 c.add(com);
 c.add(bio);
 c.add(phy);
 c.add(chem);
 c.add(nametxt);
 c.add(rolltxt);
 c.add(day1);
 c.add(month1);
 c.add(year1);
 c.add(comtxt);
 c.add(biotxt);
 c.add(phytxt);
 c.add(chemtxt);
 c.add(submit);
}
}
 //c.add(output_txtArea);
 /*public static void submit_action(ActionEvent event){
 String name=nametxt.getText();
 String gender="Male";
 if(female.isSelected()==true)
 gender="Female";
 String day=(String)day1.getSelectedItem();
 String month=(String)month1.getSelectedItem();
 String year=(String)year1.getSelectedItem();
 }
}
 // displaying value in the JTextArea
 /*output_txtArea.setText(" Name :   " +name + "\n Father's Name :  " +fname + "\n Gender :   "+gender +
                                         "\n Date of Birth :   "+day_name + "  "+month_name + " " +year_name +  
 "\n Address :  "+add + " \n Phone no :  "+phone + 
 "\n Email :  "+email + "\n ");
 
 }
 else
 {
 output_txtArea.setText("Please accept the terms and condition");
 }
 
 }
 
}*/