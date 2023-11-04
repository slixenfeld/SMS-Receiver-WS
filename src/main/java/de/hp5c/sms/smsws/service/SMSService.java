package de.hp5c.sms.smsws.service;

import de.hp5c.sms.smsws.model.SMS;
import de.hp5c.sms.smsws.repo.SMSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SMSService {

    private SMSRepository repository;

    @Autowired
    SMSService(SMSRepository repository) {
        this.repository = repository;
    }

    public SMS createSMS(SMS sms) {
        repository.save(sms);
        return sms;
    }

    public SMS getSMS(Long id) {
        return repository.findById(id).orElse(null);
    }
}
