public class shipName
{
	private String name;
	private int number;
	private int size;
	
	
	shipName(int number,String name,int size)
	{
		this.name = name;
		this.number = number;
		this.size = size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumb()
	{
		return number;
	}
	
	public int getSize()
	{
		return size;
	}
}