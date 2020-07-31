package ranklist;
public class Dob {

	int date;
	int mon;
	int year;
	public Dob(int d1, int m1,int y) {
		date=d1;
		mon=m1;
		year=y;
	}
	   void check()
	    {
	    	
	    	if(mon>12)
	    	{
	    		System.out.println("the date is invalid");
	    	}
	    	else if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
	    	{
	       		if(date>=31)
	    		{
	    			System.out.println("the date is invalid");
	    		}
	    	}
	    	else if(mon==2)
	    	{
	    		if(((year%100!=0)&&(year%4==0))||(year%400==0))
	    		{
	    		if(date>=29)
	    		{
	    			System.out.println("the date is invalid");
	    		}
	    		}
	    		else
	    		{
	    			if(date>=28)
	    			{
	    				System.out.println("the date is invalid");
	    			}
	    		}
	    	}
	    	else
	    	{
	    		if(date>=30)
	    		{
	    			System.out.println("the date is invalid");
	    		}
	    	}
	    }
	    public String toString()
	    {
	    	return(date+":"+mon+":"+year);
	    }
	

}
