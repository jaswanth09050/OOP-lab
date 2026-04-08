

class InvoiceProcessing {
public void generateInvoice(String customerName, double amount) {
double finalAmount = Total(amount); 
System.out.println("Customer: " + customerName);
System.out.println("Total Amount: " + finalAmount);
}

private double Total(double amount) {
System.out.println("Calculating total in InvoiceProcessor...");
return amount; 
}
}

class RetailInvoice extends InvoiceProcessing {
@Override
public void generateInvoice(String customerName, double amount) {
double discount = amount * 0.10; 
double finalAmount = amount - discount;

System.out.println("RETAIL INVOICE");
System.out.println("Customer: " + customerName);
System.out.println("Original Amount: " + amount);
System.out.println("Discount: " + discount);
System.out.println("Final Amount: " + finalAmount);
}
}

public class Overriding {
public static void main(String[] args) {
InvoiceProcessing inv = new RetailInvoice();
inv.generateInvoice("Virat Kohli", 1000.0);
}
}
