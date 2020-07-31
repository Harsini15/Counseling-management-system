package registration;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StudentReg extends JPanel implements ActionListener {
   
    JButton b1;
    JTextField t1,t2,t3,t4,t5,t6;
    JLabel l1,l2,l3,l4,l5,l6,dob,l7;
    JCheckBox c1,c2,c3;
    JRadioButton r1,r2;
    ButtonGroup bg1;
    JComboBox cb;
    String str="Game : ";
    JCheckBox c[] = new JCheckBox[3];
    public StudentReg()
    {
        b1 = new JButton("Submit");
        t1 = new JTextField(10);
        t1.setBounds(180,80,100,30);
        t2 = new JTextField(10);
        t2.setBounds(180,120,100,30);
        t3 = new JTextField(10);
        t3.setBounds(180,160,50,30);
        t4 = new JTextField(5);
        t4.setBounds(180,200,50,30);
        t5 = new JTextField(5);
        t5.setBounds(180,240,50,30);
        t6 = new JTextField(5);
        t6.setBounds(180,280,50,30);
        l1 = new JLabel("Name");
        l1.setBounds(50,80,100,30);
        l2 = new JLabel("Rollno");
        l2.setBounds(50,120,100,30);
        l3 = new JLabel("Community");
        l3.setBounds(50,160,100,30);
        l4 = new JLabel("Biology");
        l4.setBounds(50,200,00,30);
        l5 = new JLabel("Physics");
        l5.setBounds(50,240,100,30);
        l6 = new JLabel("Chemistry");
        l6.setBounds(50,280,100,30);
        l7 = new JLabel("Gender");
        l7.setBounds(50,320,100,30);
        r1 = new JRadioButton("Male");
        r1.setBounds(180,320,50,30);
        r1.setActionCommand("male");
        r2 = new JRadioButton("Female");
        r2.setBounds(220,320,100,30);
        r2.setActionCommand("female");
        dob=new JLabel("Date of Birth : ");
        dob.setBounds(50,340,100,30); 
        String days[]=new String[31];
        for(int i=1;i<=31;i++)
        days[i-1]=Integer.toString(i);
        //days[i-1]=i;
        JComboBox day1=new JComboBox(days);
        day1.setBounds(180,360,40,30);
        //String months[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec" }; 
        String months[]=new String[31];
        for(int i=1;i<=12;i++)
        days[i-1]=Integer.toString(i);
        //days[i-1]=i;
        JComboBox month1=new JComboBox(months);
        month1.setBounds(230,360,60,30);	
        String years[]=new String[70];
        for(int i=1980;i<=2018;i++)
        years[i-1951]=Integer.toString(i);
        JComboBox year1=new JComboBox(years);
        year1.setBounds(300,360,60,30);
        bg1 = new ButtonGroup();
        b1.addActionListener(this);
        bg1.add(r1);
        bg1.add(r2);
       
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);   
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(dob);
        add(day1);
        add(month1);
        add(year1);
        add(l7);
        add(r1);add(r2);
      //  add(c1);add(c2);add(c3);
        add(b1);
   
    }
   public void actionPerformed(ActionEvent e)
   {
       String name = t1.getText();
       System.out.println("Name : "+name);
       String rollno = t2.getText();
       System.out.println("Rollno : "+rollno);
       String community = t3.getText();
       System.out.println("Community : "+community);
       /*if(bg1.getSelection().getActionCommand().equals("male"))
       {
            System.out.println("Gender : Male");
       }
       else
       {
            System.out.println("Gender : Female");
       }
      
        if(c1.isSelected())
        { 
           str = str +"Cricket ";
          
        }
        if(c2.isSelected())
        {
           str = str+"+ FootBall";   
          
        }
        if(c3.isSelected())
        {
            str = str+ "+ VollyBall ";         
        }
        System.out.println(" "+str);*/
   }
   public static void main(String args[])
   {
        JFrame frame = new JFrame("Counseling Registration form");
   
        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        frame.getContentPane().add(new StudentReg());
        //frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
   }
}

