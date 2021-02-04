/**
 * This is the main program for Assignment 3 in Programming Fundamentals.
 * 
 * Note: You should not modify this program. This program will use
 *       the classes you created as specified in the Assignment paper.
 *       
 *       Understanding this code will help you implement the classes.
 * 
 * @author Lei Ye
 *
 */

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class POSmain {

	public static void main(String[] args) throws IOException {
		
		/* get the filename for price file */
		String fn_price = args[0];
		/* get the filenames for 2 shopping carts */
		String fn_cart1, fn_cart2;
		fn_cart1 = args[1];
		fn_cart2 = args[2];
		
		/* get the product prices from the price file */
		ProductPrices productPrices = new ProductPrices();
		
		Scanner reader = new Scanner(Paths.get(fn_price));
		String productName;
		double price;
		while (reader.hasNext()){
			productName = reader.next();
			price = reader.nextDouble();
			productPrices.put(productName, price);
		}
		reader.close();
		
		/* get items for shopping cart 1 */
		ShoppingCart cart1 = new ShoppingCart();
		
		reader = new Scanner(Paths.get(fn_cart1));
		String item;
		while (reader.hasNext()){
			item = reader.next();
			cart1.addItem(item);
		}
		reader.close();
		
		/* get items for shopping cart 2 */
		ShoppingCart cart2 = new ShoppingCart();
		reader = new Scanner(Paths.get(fn_cart2));
		while (reader.hasNext()){
			item = reader.next();
			cart2.addItem(item);
		}
		reader.close();

		/* Create a cash register object */
		CashRegister register = new CashRegister(productPrices);
		
		/* The customer of the shopping cart 1 is checking out at the register */
		System.out.println("\nOne customer is checking out ...");
		register.scanAllItemsInCart(cart1);
		register.printReceipt();
		/* The customer of the shopping cart 2 is checking out at the register */
		System.out.println("\nOne customer is checking out ...");
		register.scanAllItemsInCart(cart2);
		register.printReceipt();
		
		/* print the report for the day */
		register.printReportForTheDay();
	}
}

