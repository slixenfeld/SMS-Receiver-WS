package de.hp5c.sms.smsws.repo;

import de.hp5c.sms.smsws.model.SMS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SMSRepository extends JpaRepository<SMS, Long> {

    @Query("SELECT s FROM SMS s order by id desc limit 1")
    Optional<SMS> findTop();
}
