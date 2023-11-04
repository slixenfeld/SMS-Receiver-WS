package de.hp5c.sms.smsws.controller;

import de.hp5c.sms.smsws.model.SMS;
import de.hp5c.sms.smsws.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SMSController {

    SMSService service;

    @Autowired
    SMSController(SMSService service) {
        this.service = service;
    }

    @CrossOrigin
    @PostMapping("/sms")
    public SMS getSMS(@RequestBody SMS sms)
    {
        return service.createSMS(sms);
    }

    @CrossOrigin
    @GetMapping("/sms/{id}")
    public SMS getSMS(@PathVariable(value = "id") Long id)
    {
        return service.getSMS(id);
    }
}
