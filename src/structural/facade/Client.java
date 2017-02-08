package structural.facade;



public class Client {

	public static void main(String [] args) {

	    // Lots of noise here, there's lots of setup, this is a SUPER BASIC example but it can get out of control
		final BillingSystem billingSystem = new BillingSystem();
		final InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();

		final Bill bill = billingSystem.createBill(1000);
		invoiceCustomerSystem.createInvoiceForBill(bill);
	}
	
}
