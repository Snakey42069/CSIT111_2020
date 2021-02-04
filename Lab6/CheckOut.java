public class CheckOut {

	public static void main(String[] args) {

		// Create 3 products
		Product milk = new Product("Milk", 2.99);
		Product apple = new Product("Apple", 5.49);	
		Product bread = new Product("Bread", 1.75);
		
		System.out.println("***** At Register *****");
		// 1. Create a CashRegister object
		CashRegister register = new CashRegister();
		
		// 2. Call your CashRegister method to scan the following product prices one by one
		//     Milk, Apple, Bread
		register.scanProduct(milk.getPrice());
		register.scanProduct(apple.getPrice());
		register.scanProduct(bread.getPrice());
		
		// 3. Display the number of items purchased
		System.out.println("You have purchased " + register.getTotal() + " items");
		
		// 4. Display the total purchase
		// not using String.format is fine in this exercise
		System.out.println("Total: $" + String.format("%.2f", register.getPurchase()));    // not using String.format is fine in this 
		
		// 5. Scan one more product
		//     Apple
		register.scanProduct(apple.getPrice());
		
		// 6. Display the number of items purchased
		System.out.println("You have purchased " + register.getTotal() + " items");
		
		// 7. Display the total purchase
		System.out.println("Total: $" + String.format("%.2f", register.getPurchase()));
	}
}

/*
 * 
 * Class Diagram
 * 
==============================
CashRegister
------------------------------
-itemsPurchased: int
-totalPrice: double

------------------------------
+CashRegister()
+scanProduct(double): void
+getPurchase(): double
+getTotal(): int

==============================
*
*/
public class CashRegister {
	
    // Add your code here 

    private int itemsPurchased;
    private double totalPrice;
    
    public CashRegister()   {
        this.itemsPurchased = 0;
        this.totalPrice = 0.00;
    }

    public void scanProduct(double price)   {
        itemsPurchased++;
        this.totalPrice += price;
    }

    public double getPurchase() {
        return totalPrice;
    }

    public int getTotal()   {
        return itemsPurchased;
    }




	
}

// Add your Product class from Ex.1 here

public class Product {
	
    // Add your code here
    
    private String name;
    private Double price;
    private int ProductID;
    private static int total = 0;

    public Product(String xName, double xPrice)   {
        this.name = xName;
        this.price = xPrice;
        this.ProductID = total++;
        
    }

    public String getName()    {
        return this.name;
    }
    
    public int getProductID()   {
        return this.ProductID;
    }

    public double getPrice()    {
        return this.price;
    }

    public void changePrice(double newPrice)    {
        this.price = newPrice;
    }

    public static int getTotal()   {
        return total;
    }

}