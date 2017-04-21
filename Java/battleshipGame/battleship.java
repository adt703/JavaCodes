import java.io.*;
import java.util.*;

public class battleship
{
	public static void main(String[] arg)
	{		
		userPlaceShip check = new userPlaceShip();
		check.setup();
		
		List<shipName> nameShip = new ArrayList<shipName>();
		shipName spn  = new shipName(1,"Carrier",3);
		nameShip.add(spn);
		spn = new shipName(2,"Fighter",2);
		nameShip.add(spn);
		spn = new shipName(3,"Submarine",2);
		nameShip.add(spn);
		
		plshipAI ai = new plshipAI();
		ai.setup(nameShip);
		ai.printArea();
		ai.getPost();
		
		ai.printArea();
		
		Scanner in = new Scanner(System.in);
		while(nameShip.size()>0)
		{
			System.out.println("\nChoose your ship to place it on the battle field");
			System.out.println("Choose\t\tName\t\t\tSize(Spaces)");
			System.out.println("1\t\tCarrier\t\t\t3");
			System.out.println("2\t\tFighter\t\t\t2");
			System.out.println("3\t\tSubmarine\t\t2");
			
			boolean checkstat = true;
			String choice=" ";
			System.out.print("\nEnter your choice :");
			int getNum =0;
			while(checkstat)
			{
				getNum = in.nextInt();
				for(int ch=0;ch<nameShip.size();ch++)
				{
					if(nameShip.get(ch).getNumb() == getNum)
					{
						choice = nameShip.get(ch).getName();
						checkstat=false;
						getNum = ch;
						break;
					}
				}
				if(checkstat && nameShip.size()<3)
				{
					System.out.println("\nError : It has been already selected");
					System.out.print("Enter again :");
				}				
			}
			
			boolean checkstat1 = false;
			switch(choice)
			{
				case "Carrier":		while(!checkstat1)
									{
										System.out.print("\nChoose Y-mark position :");
										char post1 = in.next().charAt(0);
										System.out.print("\nChoose X-mark position :");
										int post2 = in.nextInt();
										System.out.print("\nHorizontal or Vertical ? (H/V) :");
										String hy = in.next();
										checkstat1 = check.placeShip(post1,post2,3,hy);
										if(!checkstat1)
											System.out.println("Already positioned, Select another position\n");
									}
									break;
				
				case "Submarine":	while(!checkstat1)
									{					
										System.out.print("\nChoose Y-mark to place ship :");
										char post3 = in.next().charAt(0);
										System.out.print("\nChoose X-mark position :");
										int post4 = in.nextInt();
										System.out.print("\nHorizontal or Vertical ? (H/V) :");
										String hy = in.next();
										checkstat1 = check.placeShip(post3,post4,2,hy);
										if(!checkstat1)
											System.out.println("Already positioned, Select another position\n");
									}
									break;
									
				case "Fighter":		while(!checkstat1)
									{
										System.out.print("\nChoose Y-mark position :");
										char post5 = in.next().charAt(0);
										System.out.print("\nChoose X-mark position :");
										int post6 = in.nextInt();
										System.out.print("\nHorizontal or Vertical ? (H/V) :");
										String hy = in.next();
										checkstat1 = check.placeShip(post5,post6,2,hy);
										if(!checkstat1)
											System.out.println("Already positioned, Select another position\n");
									}
									break;
				default    : System.out.println("Incorrect Ship name");
			}
			
			nameShip.remove(getNum);
			check.printArea();
		}
	}
}