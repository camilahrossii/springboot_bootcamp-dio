package dio.labpadroesprojetospring.model;

public interface PaymentFacade {
    private PaymentService paymentService;

    public PaymentFacade(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void processPayment(PaymentRequest paymentRequest) {
        paymentService.processPayment(paymentRequest);
    }

}
