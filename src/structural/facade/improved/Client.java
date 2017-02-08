package structural.facade.improved;

public class Client {

	public static void main(String [] args){

        // This would be the true client perspective ///

        // initial setup
        FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade();

        // execute command
        financialSystemFacade.createInvoice(1000);
	}
	
}
