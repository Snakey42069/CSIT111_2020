
public class TestShoppingCart {

	public static void main(String[] args) {
		
		// Create 5 products
		Product[] products = new Product[5];
		
		products[0] = new Product("Milk", 2.29);
		products[1] = new Product("Apple", 6.29);		
		products[2] = new Product("Bread", 1.99);
		products[3] = new Product("Beef", 9.39);
		products[4] = new Product("Coffee", 4.59);
		
		// Create a ShoppingCart object
		ShoppingCart cart1 = new ShoppingCart();
		
		// Add 4 items to the shopping cart
		for(int i=0; i< 3; i++){
			cart1.addItem(products[i]);
		}
		
		System.out.println("Customer 1: "+ cart1.getTotalItems() + " items in the shopping cart.");	
		System.out.println(ShoppingCart.getTotalCarts() + " customer in the shop.");
				
		// Create another ShoppingCart object
		ShoppingCart cart2 = new ShoppingCart();
		
		// Add items to the shopping cart
		for(int i=0; i< 4; i++){
			cart2.addItem(products[i]);
		}
		
		System.out.println("\nCustomer 2: "+ cart2.getTotalItems() + " items in the shopping cart.");	
		System.out.println(ShoppingCart.getTotalCarts() + " customers in the shop.");		
		
		// Unload all items from a shopping cart
		System.out.println("\nCustomer 1 is checking out.");
		Product[] itemsInCart = cart1.unloadAllItems();
		if (itemsInCart != null) {
			for(Product p: itemsInCart)
				System.out.println("Unloading " + p.getName());
		}
		System.out.println("Customer 1 unloaded all items from the shopping cart.");
		System.out.println("Customer 1: "+ cart1.getTotalItems() + " items in the shopping cart.");	

		System.out.println(ShoppingCart.getTotalCarts() + " customer in the shop.");	

		/* Uncomment the following for Ex.2 */
		System.out.println("\nList all items in Customer 2's shopping cart:");
		cart2.listAllItems();
		
	}

}

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
    
    public String toString()    {
        return this.name + "\t" + "$" + this.price;
    }
	
}

/* Ex.1 */
public class ShoppingCart {
		
    // add your coe here
    
    private Product[] items = new Product[10];
    private int totalItems;
    private static int totalCarts = 0;
    
    public ShoppingCart() {
        totalCarts++;
        this.totalItems = 0;
    }

    public void addItem(Product itemToAdd)  {

        for (int i = 0; i < items.length; i++ )  {
            if (items[i] == null)   {
                items[i] = itemToAdd;
                totalItems++;
                break;
            }
        }

    }

    public int getTotalItems()  {
        return this.totalItems;
    }

    public static int getTotalCarts()   {
        return totalCarts;
    }

    public Product[] unloadAllItems()  {

        Product[] unloadedItems = new Product[this.totalItems];

        for (int i = 0; i < unloadedItems.length; i++)  {
            unloadedItems[i] = items[i];
        }

        this.totalItems = 0;
        totalCarts--;

        return unloadedItems;
    }

    public void listAllItems()  {

        for (int i = 0; i < items.length; i++){
            if (items[i] != null){
                System.out.println(items[i].toString());
            }
        }

    }

}