package tp.msk.msscssm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.msk.msscssm.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
