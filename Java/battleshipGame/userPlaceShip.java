import java.util.*;

public class userPlaceShip
{
	private int[][] values;
	
	userPlaceShip()
	{
		values = new int[11][11];
	}
	
	public void setup()
	{
		int val = 64;
		values[0][0]=0;
		for(int x=1;x<11;x++)
		{
			values[0][x] = (val+x);
			values[x][0] = x;
		}
		
		for(int y=1;y<11;y++)
		{
			for(int x=1;x<11;x++)
			{
				values[y][x] = 88;
			}
		}
	}
	
	public void printArea()
	{
		System.out.println();
		for(int y1=0;y1<11;y1++)
		{
			for(int x=0;x<11;x++)
			{
				if(x!=0)
				{
					System.out.print((char)values[y1][x]+"   ");
				}
				else
				{
					System.out.print(values[y1][x]+"    ");
				}
			}
			System.out.println("\n");
		}
	}
	
	public boolean placeShip(char p1, int p2, int size, String hy1)
	{
		int tempx = 0;
		int tempy = 0;
		String hy3 = hy1;
		for(int y=1;y<11;y++)
		{
			if(values[0][y]== (int)(p1))
			{
				tempy = y;
				for(int op=1;op<11;op++)
				{
					if(values[op][0]== p2)
					{
						tempx = op;
						break;
					}
					else if(op>=10 && tempx == 0)
					{
						System.out.println("\nOut of Space, Select position again.\n");
						return false;
					}
				}
				break;
			}
			else if(y>=10 && tempx == 0 && tempy == 0)
			{
				System.out.println("\nOut of Space, Select position again.\n");
				return false;
			}
		}
		if(values[tempx][tempy] != 83)
		{			
			boolean chk = setPlace(tempx,tempy,size,hy3);
			values[tempx][tempy] = 83;
			switch(hy1)
			{
				case "H":
					
					if(chk)
					{
						for(int k=0;k<size;k++)
						{
							values[tempx][tempy+k] = 83;
						}
						return true;
					}
					else
						return false;
				
				case "V":
				
					if(chk)
					{
						for(int k=0;k<size;k++)
						{
							values[tempx+k][tempy] = 83;
						}
						return true;
					}
					else
						return false;
				
				default:
				
					System.out.println("Incorrect, Enter H or V");
					return false;
			}
		}else
		{
			return false;
		}
	}
	
	public boolean setPlace(int xt, int yt, int sz, String hy2)
	{
		for(int k=0;k<sz;k++)
		{
			switch(hy2)
			{
				case "H":
					
					if(values[xt+k][yt] == 83)
					{
						return false;
					}
					break;
				
				case "V":
				
					if(values[xt][yt+k] == 83)
					{
						return false;
					}
					break;
				
				default:
					return false;
			}
		}
		
		return true;
	}
}