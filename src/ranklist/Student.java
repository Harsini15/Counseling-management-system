package ranklist;
public class Student {
	String name;
	int rollno;
	Dob dateofbirth;
    String community;
//	Board result;
	public Student()
	{
		
	}
	public Student(String n,int r1,Dob d,String c) {
		name=n;
		rollno=r1;
		dateofbirth=d;
		community=c;
	}
	public Student(Student copy1)
	{
		name=copy1.name;
		rollno=copy1.rollno;
		dateofbirth=copy1.dateofbirth;
		community=copy1.community;
	}
	public String getcommunity()
	{
		return community;
	}
	public String toString()
	{
		return("Name :"+name+"\n"+"Roll no :"+rollno+"\n"+"Date of birth :"+dateofbirth+"\n"+"Community :"+community+"\n");
	}

}
