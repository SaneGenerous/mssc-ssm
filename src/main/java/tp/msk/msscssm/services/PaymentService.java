package tp.msk.msscssm.services;

import org.springframework.statemachine.StateMachine;
import tp.msk.msscssm.domain.Payment;
import tp.msk.msscssm.domain.PaymentEvent;
import tp.msk.msscssm.domain.PaymentState;

public interface PaymentService {
    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
