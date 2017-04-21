public class TestShoppingCart {

	public static void main(String[] args) {
		Product[] products = new Product[5];
		
		products[0] = new Product("Milk", 2.29);
		products[1] = new Product("Apple", 6.29);		
		products[2] = new Product("Bread", 1.99);
		products[3] = new Product("Beef", 9.39);
		products[4] = new Product("Coffee", 4.59);
		
		// Create a ShoppingCart object
		ShoppingCart cart1 = new ShoppingCart();
		
		// Add items to the shopping cart
		for(int i=0; i< 3; i++){
			cart1.addItem(products[i]);
		}
		
		System.out.println(cart1.getTotalItems() + " items in the shopping cart. ");	
		System.out.println(ShoppingCart.getTotalCarts() + " customer in the shop.");
				
		// Create another ShoppingCart object
		ShoppingCart cart2 = new ShoppingCart();
		
		// Add items to the shopping cart
		for(int i=0; i< 4; i++){
			cart2.addItem(products[i]);
		}
		
		System.out.println(cart2.getTotalItems() + " items in the shopping cart. ");	
		System.out.println(ShoppingCart.getTotalCarts() + " customers in the shop.");		
		
		// Unload all items from a shopping cart
		//cart1.unloadAllItems();
		Product[] itemsInCart = cart1.unloadAllItems();
        for(int i=0; i<itemsInCart.length; i++)
		{
            System.out.println("Unloading " + itemsInCart[i].getName());
        }

		System.out.println(cart1.getTotalItems() + " items in the shopping cart. ");	
		System.out.println("One customer unloaded all items from the shopping cart.");
		
		System.out.println(ShoppingCart.getTotalCarts() + " customer in the shop.");			
	}

}