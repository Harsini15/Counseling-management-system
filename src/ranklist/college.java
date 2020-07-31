package ranklist;
class college
{
	int clgno;
	String clgname;
	int seats,bcseat,fcseat,mbcseat;
	college(int x,String y,int z,int z1,int z2)
	{
		clgno=x;
		clgname=y;
		seats=z;
		bcseat=z1;
		mbcseat=z2;
	}
	int getclgno()
	{
		return clgno;
	}
	int getseats()
	{
		return seats;
	}
	int getbcseat()
	{
		return bcseat;
	}
	int getfcseat()
	{
		return fcseat;
	}
	int getmbcseat()
	{
		return mbcseat;
	}
	
}