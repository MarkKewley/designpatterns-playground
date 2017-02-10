package behavioral.chainofresponsibility.improved;


public class PaymentCheckoutHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("Handling payment of the customer");

        if (nextHandler != null) {
            nextHandler.handleCheckout();
        }

    }

}
