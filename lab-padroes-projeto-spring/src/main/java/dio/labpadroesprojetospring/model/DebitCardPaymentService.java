package dio.labpadroesprojetospring.model;

public class DebitCardPaymentService implements PaymentService{
    public void processPayment(PaymentFacade paymentRequest){
        System.out.println("Process the payment using debit card");
    }
}
