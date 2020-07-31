package files;
import java.io.*;
import java.util.Scanner;
class Myclass implements Serializable
{
	private static final long serialVersionUID = 1L;
	int rollno;
	String name;
	Myclass(String n,int r)
	{
		name=n;
		rollno=r;
	}
	public String toString()
	{
		return("name :"+name+"rollno"+rollno);
	}
}
public class Example {
public static void main(String []args)
{
	//Scanner s=new Scanner(System.in);
	try {
	/*System.out.println("enter name and rollno");
	String n=s.next();
	int r=s.nextInt();*/
	Myclass c=new Myclass("harsh",3533);
	System.out.println("object1 "+c);
	FileOutputStream fos;
	fos = new FileOutputStream("C:\\Users\\harshsree\\Desktop\\harsini.bat");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(c);
	oos.flush();
	oos.close();
	}
	catch(IOException e)
	{
		System.out.println("exception during serialization"+e);
		System.exit(0);
	}
	try {
		Myclass c1;
		FileInputStream fis = new FileInputStream("C:\\Users\\harshsree\\Desktop\\harsini.bat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        c1=(Myclass)ois.readObject();
        ois.close();
System.out.println("object2 "+c1);
	}
	catch(Exception e)
	{
		System.out.println("exception during serialization"+e);
		System.exit(0);
	}


	}
}
