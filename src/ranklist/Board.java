package ranklist;
public class Board {

	public int biology,physics,chemistry;
	int total;
	public Board(int bio,int phy,int chem) {
		biology=bio;
		physics=phy;
		chemistry=chem;
	}
	int computetotal()
	{
		total=physics+chemistry+biology;
		return total;
	}
	public String toString()
	{
		return(" Subject Marks :\n"+"Biology :"+biology+"\nPhysics :"+physics+"\nChemistry :"+chemistry+"\n"+"Total :"+total);
	}
}

