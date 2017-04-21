import java.util.*;
public class plshipAI
{
	private int[][] AIship;
	private List<shipName> spname = new ArrayList<shipName>();
	private int xpt =0;
	private int ypt = 0;
	
	plshipAI()
	{
		AIship = new int[11][11];
	}
	
	public void mainSet()
	{
		for(int y=0;y<11;y++)
		{
			for(int x=0;x<11;x++)
			{
				AIship[y][x] = 0;
			}
		}
	}
	
	public void setup(List<shipName> sname)
	{
		spname.addAll(sname);
		mainSet();
		int val = 64;
		AIship[0][0] = 0;
		for(int x=1;x<11;x++)
		{
			AIship[0][x] = (val+x);
			AIship[x][0] = x;
		}
		
		for(int y=1;y<11;y++)
		{
			for(int x=1;x<11;x++)
			{
				AIship[y][x] = 88;
			}
		}
	}
	
	public void getPost()
	{
		int n = 3;
		int yAI = 0;
		int xAI = 0;
		while(n!=0)
		{
			int st = (int)(Math.random()*n);
			boolean check = false;
			boolean check2 = false;
			
			while(!check && !check2)
			{
				int ymark = (int)(Math.random()*10)+65;
				int xmark = (int)(Math.random()*10)+1;
		
				check = xplaceCheck(xmark,spname.get(st).getSize());
				check2 = yplaceCheck(ymark,spname.get(st).getSize());
				
				ypt = ymark;
			    xpt = xmark;
			}
			boolean word = elementCheck(xpt,ypt,spname.get(st).getSize());
			if(word)
			{

				int ranp = (int)(Math.random()*2);
				for(int l=0;l<1;l++)
				{
					for(int h=1;h<11;h++)
					{
						if(AIship[l][h]== ypt)
						{
							yAI = h;
						}	
						if(AIship[h][l]==xpt)
						{
							xAI = h;
						}
					}
				}
				for(int k=0;k<spname.get(st).getSize();k++)
				{
					if(ranp==0)
					{
						AIship[xAI+k][yAI] = 83;
					}
					else if(ranp==1)
					{
						AIship[xAI][yAI+k] = 83;
					}
				}
				spname.remove(st);
				n-=1;
			}
		}
	}
	
	private boolean xplaceCheck(int xt,int sz)
	{
		for(int g=0;g<11;g++)
		{
			if(AIship[g][0]==xt && xt+sz<10)
			{
				xpt = g;
				return true;
			}
			else if(xpt==0 && g>10)
			{
				return false;
			}
		}
		return false;
	}
	private boolean yplaceCheck(int yt, int sz)
	{
		for(int g=0;g<11;g++)
		{
			if(AIship[0][g]==yt && yt+sz<75)
			{
				ypt = g;
				return true;
			}else if(ypt==0 && g>10)
			{
				return false;
			}
		}
		return false;
	}
	
	private boolean elementCheck(int xpt, int ypt, int sz)
	{
		for(int k=0;k<sz;k++)
		{
			if(this.ypt+sz<75 && this.xpt+sz<10)
			{
				if(AIship[this.xpt+k][this.ypt-65] != 88)
				{
					return false;
				}
			
				if(AIship[this.xpt][this.ypt+k-65] != 88)
				{
					return false;
				}
			}
			else
				return false;
		}
		return true;
	}
	
	public void printArea()
	{
		System.out.println();
		System.out.print((char)AIship[0][0]+"  \n\n ");
		for(int y1=0;y1<11;y1++)
		{
			for(int x=0;x<11;x++)
			{
				if(x!=0)
				{
					System.out.print((char)AIship[y1][x]+"   ");
				}
				else
				{
					System.out.print(AIship[y1][x]+"    ");
				}
			}
			System.out.println("\n");
		}
	}
	
}