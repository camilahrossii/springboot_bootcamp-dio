package dio.labpadroesprojetospring.controller;

import dio.labpadroesprojetospring.model.PaymentFacade;

@RestController
public class PaymentController {
    private PaymentFacade paymentFacade;

    public PaymentController(PaymentFacade paymentFacade){
        this.paymentFacade = paymentFacade;
    }

    @PostMapping("/payments")
    public void processPayment(@RequestBody PaymentRequest paymentRequest){
        paymentFacade.processPayment(paymentRequest);
    }
}
