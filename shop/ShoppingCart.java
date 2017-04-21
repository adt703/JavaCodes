public class ShoppingCart
{
	//Product[] product = new Product[5];
	
	private Product[] items;
	private int totalItems;
	private static int totalCarts;
	
	ShoppingCart()
	{
	    items = new Product[5];
		totalItems = 0;	
	}
	
	public void addItem(Product prdt)
	{	
		items[totalItems] = prdt;
		totalItems++;
		if(totalItems==1)
		{
         totalCarts++;		
		}
			
	}
	
	public int getTotalItems()
	{
		return totalItems;
	}
	
	public static int getTotalCarts()
	{
		return totalCarts;
	}
	
	public Product[] unloadAllItems()
	{
		Product[] items2 = new Product[items.length];
		System.out.println(items.length);
		for(int i=0; i< items.length;i++)
		{
			items2[i]= items[i];
		}
		totalCarts-=1;
		totalItems-=totalItems;;
		return items2;
		
	}
}