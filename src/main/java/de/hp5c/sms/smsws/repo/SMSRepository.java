package de.hp5c.sms.smsws.repo;

import de.hp5c.sms.smsws.model.SMS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SMSRepository extends JpaRepository<SMS, Long> {
}
