package ranklist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class EntranceExam {

	public static void main(String []args) {
		int n1,i;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of students");
		n1=s.nextInt();
		Rank r[]=new Rank[100];
		Rank r2=new Rank();
		Board b[]=new Board[100];
		for(i=0;i<n1;i++)
		{
			System.out.println("enter the student details :name,rollno,dateofbirth,community,marks");
			String n=s.next();
			int r1=s.nextInt();
			int d1=s.nextInt();
			int m1=s.nextInt();
			int y=s.nextInt();
			Dob d=new Dob(d1,m1,y);
            String c=s.next();
            int phy=s.nextInt();
            int chem=s.nextInt();
            int bio=s.nextInt();
            b[i]=new Board(bio,phy,chem);
            b[i].computetotal();
			r[i]=new Rank(n,r1,d,c,b[i],b[i].computetotal());
		}
		r2.sort(r,n1);
		for(i=0;i<n1;i++)
		{
			System.out.println(r[i]);
			System.out.println(b[i]);
		}
		System.out.println("The General RANKLIST");
		for(i=0;i<n1;i++)
		{
			System.out.println("RANK - "+(i+1)+"\t"+r[i].name);
		}
		r2.compute(r,n1);
		ArrayList<college> al=new ArrayList<college>();
		college c1=new college(1001,"   MADRAS MEDICAL COLLEGE,CHENNAI           ",250,150,100);  
		college c2=new college(1002,"   STANLEY MEDICAL COLLEGE,CHENNAI          ",250,150,100);  
		college c3=new college(1003,"   KILPAUK MEDICAL COLLEGE,CHENNAI          ",150,100,50);
		college c4=new college(1004,"   CHENGALPATTU MEDICAL COLLEGE,CHENGALPATTU",150,100,50);
		college c5=new college(1005,"   MADURAI MEDICAL COLLEGE,MADURAI          ",150,100,50);
		college c6=new college(1006,"   THANJAVUR MEDICAL COLLEGE,THANJAVUR      ",150,100,50);
		college c7=new college(1007,"   COIMBATORE MEDICAL COLLEGE,COIMBATORE    ",150,100,50);
		college c8=new college(1008,"   TIRUNELVELI MEDICAL COLLEGE,TIRUNELVELI  ",150,100,50);
		college c9=new college(1009,"   KANYAKUMARI MEDICAL COLLEGE,KANYAKUMARI  ",100,75,25);
		college c10=new college(1010,"  THENI MEDICAL COLLEGE,THENI               ",100,75,25);
		college c11=new college(1011,"  OMANDURAR MEDICAL COLLEGE,CHENNAI         ",100,75,25);
		college c12=new college(1012,"  VELLORE MEDICAL COLLEGE,VELLORE           ",100,75,25);
	    al.add(c1); 
	    al.add(c2);
	    al.add(c3);
	    al.add(c4);
	    al.add(c5);
	    al.add(c6);
	    al.add(c7);
	    al.add(c8);
	    al.add(c9);
	    al.add(c10);
	    al.add(c11);
	    al.add(c12);
	    
	    //Iterator itr=al.iterator();
	    int seat1,seat2,seat3;
        for(i=0;i<n1;i++)
        {
        	 
        	 Iterator itr=al.iterator();
        	 System.out.println("CODE"+"\t"+"   COLLEGE NAME               "+"\t\t"+" SEATs "+"BC "+"MBC " );
        	 while(itr.hasNext()){  
     	     college st=(college)itr.next();  
     	     System.out.println(st.clgno+" "+st.clgname+" "+st.seats+" "+st.bcseat+" "+st.mbcseat);  
     	     }
        	 System.out.println("RANK - "+(i+1)+"\t"+r[i].name);
        	 System.out.println("choose your college and enter its code");
        	 int code=s.nextInt();
        	 Iterator itr1=al.iterator();
        	 String x;
        	 while(itr1.hasNext())
        	 {
        		 
        		college st=(college)itr1.next();
        		if(code==st.getclgno())
        		{
        			//Student stu=new Student();
        			x=r[i].getcommunity();
        			if(x.equals("bc"))
        			{
        			seat2=st.getseats()-1;
        			st.seats=seat2;
        			seat1=st.getbcseat()-1;
        			st.bcseat=seat1;
        			}
        			else if(x.equals("mbc"))
        			{
        				
            			seat2=st.getseats()-1;
            			st.seats=seat2;
            			seat1=st.getmbcseat()-1;
        				//System.out.println(st.getmbcseat());
        				//seat1=seat1-1;
            			st.mbcseat=seat1;
        				
        			}
        			else
        			{
        				seat3=st.getseats()-1;
            			st.seats=seat3;
        				
        			}
        		}
        	 }
        	}
	}

}
