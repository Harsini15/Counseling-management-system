package ranklist;
public class Rank extends Student{
	static int rank=1;
	Board result;
	int total1;
	int i,j;
	Rank temp,temp1,temp2,older,younger,copy1;
	public Rank()
	{
	}
	public Rank(String n,int r,Dob d,String c,Board b,int t) {
		super(n,r,d,c);
		result=b;
		total1=b.computetotal();
	}
	public Rank(Rank copy)
	{
		name=copy.name;
		rollno=copy.rollno;
		dateofbirth=copy.dateofbirth;
		community=copy.community;
		result=copy.result;
		total1=copy.total1;
	}
	void sort(Rank r[],int n1)
	{
		for(i=0;i<n1;i++)
		{
			for(j=i+1;j<n1;j++)
			{
				if(r[i].result.total<r[j].result.total)
				{
					temp=r[i];
					r[i]=r[j];
					r[j]=temp;
					
				}
				else if(r[i].result.total>r[j].result.total)
				{
					r[i]=r[i];
					r[j]=r[j];
				}
				else
				{
					/*if(r[i].result.biology<r[j].result.biology)
					{
						temp1=r[i];
						r[i]=r[j];
						r[j]=temp1;
					}*/
					//else
					//{
						older=compareage(r[i],r[j]);
						if(older==r[i])
						{
							older=r[i];
						}
						else if(older==r[j])
						{
							temp2=r[i];
							r[i]=r[j];
							r[j]=temp2;
						}
					}
				}
			}
		}
		
 
	//}
	Rank compareage(Rank x,Rank y)
	{
		if(x.dateofbirth.year>y.dateofbirth.year)
		{
			return y;
		}
		else if(x.dateofbirth.year<y.dateofbirth.year)
		{
			return x;
		}
		else
		{
			if(x.dateofbirth.mon>y.dateofbirth.mon)
			{
				return y;
			}
			else if(x.dateofbirth.mon<y.dateofbirth.mon)
			{
				return x;
			}
			else
			{
				if(x.dateofbirth.date>y.dateofbirth.date)
				{
					return y;
				}
				else //if(x.dateofbirth.date>y.dateofbirth.date)
				{
					return x;
				}
				/*else
				{
					if(y.name.compareTo(x.name)==1)
					{
						return x;
					}
					else
					{
						return y;
					}
				}*/
			}
		}
	}
	 Rank bc[]=new Rank[100];
	    Rank fc[]=new Rank[100];
	    Rank mbc[]=new Rank[100];
	      int c1=0,c2=0,c3=0;
    void compute(Rank r[],int n1)
    {
    	  int c1=0,c2=0,c3=0,k1=0,k2=0,k3=0;
    for(i=0;i<n1;i++)
    {
	if(r[i].community.equals("bc"))
	{
		bc[k1]= new Rank(r[i]);
		c1++;
		k1++;
	}
	else if(r[i].community.equals("fc"))
	{
		fc[k2]=new Rank(r[i]);
		c2++;
		k2++;
	}
	else
	{
		mbc[k3]=new Rank(r[i]);
		c3++;
		k3++;
		//System.out.println("hello");
	}
    }
    	System.out.println("bc");
    	for(k1=0;k1<c1;k1++)
    	{
    		System.out.println((k1+1)+" - "+bc[k1].name);
    	}
    	System.out.println("\n");
    	System.out.println("fc");
    	for(k2=0;k2<c2;k2++)
    	{
    		System.out.println((k2+1)+" - "+fc[k2].name);
    	}
    	System.out.println("\n");
    	System.out.println("mbc");
    	for(k3=0;k3<c3;k3++)
    	{
    		System.out.println((k3+1)+" - "+mbc[k3].name);
    	}
    	System.out.println("\n");
    
    }


}
