// Mark: 10 / 10

import java.util.ArrayList;
import java.util.Collections;

class ProductPrices {

    // Creates ArrayLists for products as Strings and prices as Doubles. Related by index.
    private ArrayList<String> products = new ArrayList<String>();
    private ArrayList<Double> prices = new ArrayList<Double>();

    // Adds product name to products ArrayList and product price to prices ArrayList.
    public void put(String productName, double productPrice) {
        products.add(productName);
        prices.add(productPrice);
    }

    // Returns the price of a product.
    public double get(String product) {
        return prices.get(products.indexOf(product));
    }

}

class ShoppingCart {

    // Creates an ArrayList of products as Strings.
    private ArrayList<String> items = new ArrayList<String>();

    // Adds an item as String to items ArrayList.
    public void addItem(String item) {
        items.add(item);
    }

    // Returns items ArrayList.
    public ArrayList<String> getAllItems() {
        return items;
    }

}

class CashRegister {

    // Stores data for end of day report. Reffered to as statistical data.
    private ProductPrices productPrices;
    private ArrayList<String> allItems=new ArrayList<String>();
    private double reportTotal = 00.00;
    private int customers = 0;

    // Stores data for the current cart being processed.
    private ArrayList<String> items = new ArrayList<String>();
    private ArrayList<Integer> countOfItem = new ArrayList<Integer>();
    private ArrayList<Double> subtotal = new ArrayList<Double>();
    private double currentTotal = 00.00;

    // Constructor creates new CashRegister with productPrices.
    CashRegister(ProductPrices list) {
        productPrices = list;
    }

    // Processes the provided cart.
    public void scanAllItemsInCart(ShoppingCart xCart) {

        // Clears data from previous cart.
        items.clear();
        countOfItem.clear();
        subtotal.clear();
        currentTotal = 00.00;

        // Locally stores cart items.
        ArrayList<String> cartItems = xCart.getAllItems();
        Collections.sort(cartItems);

        // Loops through each item in the cart and processes them for prinitng.
        for (String s : cartItems) {

            // Processes temp data. Cleared when function called again.
            if (items.contains(s) == false) {
                items.add(s);
                countOfItem.add(1);
                subtotal.add(productPrices.get(s));

            } else {
                countOfItem.set(items.indexOf(s), (countOfItem.get(items.indexOf(s)) + 1));
                subtotal.set(items.indexOf(s), subtotal.get(items.indexOf(s)) + productPrices.get(s));
            }

            allItems.add(s);
            currentTotal += productPrices.get(s);
        }
        reportTotal += currentTotal;
        customers++;
    }

    // Prints cart recipt using data processed from scanAllCartItems().
    public void printReceipt() {
        System.out.println("========================================");
        System.out.println("Product\t\tPrice\tQty\tSubtotal");
        System.out.println("----------------------------------------");

        for (String s : items) {
            int i = items.indexOf(s);
            System.out.println(s + "\t\t$" + String.format("%.2f", productPrices.get(s)) + "\t" + countOfItem.get(i) + "\t$" + String.format("%.2f",subtotal.get(i)));
        }

        System.out.println("\t\t------------------------");
        System.out.println("\t\t\tTotal\t" + "$" + String.format("%.2f", currentTotal));
        System.out.println("========================================");

    }

    // Prints report for the day.
    public void printReportForTheDay() {

        System.out.println("\nReport for the day");
        System.out.println("========================================");
        System.out.println("Number of customers:\t" + customers);
        System.out.println("Total sale:\t\t$" + String.format("%.2f", reportTotal));
        System.out.println("\nList of products sold:");
        System.out.println("----------------------------------------");
        System.out.println("Product\t\t\t\tQty");
        System.out.println("----------------------------------------");
        calculateTotals();
    }

    // Calculates the amount of each item the register has processed and prints formatted.
    private void calculateTotals() {

        ArrayList<String> uniqueItems = new ArrayList<String>();
        ArrayList<Integer> itemTotals = new ArrayList<Integer>();
        
        // Sorts the allItems ArrayList alphabetically.
        Collections.sort(allItems);

        // Add one Striing of each different type of product sold, known herein as a unique item.
        for (String s : allItems) {
            if (!uniqueItems.contains(s)) {
                uniqueItems.add(s);
            }
        }

        // Sorts the uniqueItems ArrayList alphabetically to ensure prinitng occurs in alphabetical order.
        Collections.sort(uniqueItems);

        // Determines frequency of the occure of the unique item in the allItems ArrayList and prints.
        for (String s : uniqueItems) {
            itemTotals.add(Collections.frequency(allItems, s));
            System.out.println(s + "\t\t\t\t" + itemTotals.get(uniqueItems.indexOf(s)));
        }
    }
}
