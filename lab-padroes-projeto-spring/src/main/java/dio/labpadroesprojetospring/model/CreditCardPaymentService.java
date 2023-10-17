package dio.labpadroesprojetospring.model;

public class CreditCardPaymentService implements PaymentService{
    public void processPayment(PaymentFacade paymentRequest) {
        System.out.println("Process the payment using a credit card");
    }
}
