/*package ranklist;

public class CommunityRank extends Rank{
    Rank bc[]=new Rank[100];
    Rank fc[]=new Rank[100];
    Rank mbc[]=new Rank[100];
    int c1=0,c2=0,c3=0;
    public CommunityRank()
    {
    	
    }
    void compute(Rank r[],int n1)
    {
    for(i=0;i<n1;i++)
    {
	if(r[i].community.equals("bc"))
	{
		bc[i]= new Rank(r[i]);
		c1++;
	}
	else if(r[i].community.equals("fc"))
	{
		fc[i]=new Rank(r[i]);
		c2++;
	}
	else
	{
		mbc[i]=new Rank(r[i]);
		c3++;
	}
    }
    }
    void display()
    {
    	System.out.println("bc");
    	for(i=0;i<c1;i++)
    	{
    		System.out.println(bc[i].name);
    	}
    	System.out.println("\n");
    	System.out.println("fc");
    	for(i=0;i<c2;i++)
    	{
    		System.out.println(fc[i].name);
    	}
    	System.out.println("\n");
    	System.out.println("mbc");
    	for(i=0;i<c3;i++)
    	{
    		System.out.println(mbc[i].name);
    	}
    	System.out.println("\n");
    	
    }


}*/
