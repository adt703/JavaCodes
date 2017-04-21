public class Product {
	private String name;
	private double price;
	private int productID;
	private static int total;
	
	Product(String productName, double productPrice){
		name = productName;
		price = productPrice;
		total++;
		productID = total;
	}
	
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public void changePrice(double newPrice){
		price = newPrice;
	}
	public int getProductID(){
		return productID;
	}
	public static int getTotal(){
		return total;
	}
	
}