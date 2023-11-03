package de.hp5c.sms.smsws.controller;

import de.hp5c.sms.smsws.model.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {

    @Autowired
    SMSController() {

    }

    @CrossOrigin
    @PostMapping("/sms")
    public String getSMS(@RequestBody SMS sms)
    {
        System.out.println(sms.getText());
        System.out.println(sms.getFrom());
        System.out.println(sms.getReceivedStamp());
        System.out.println(sms.getSentStamp());
        System.out.println(sms.getSim());
        return "it works";
    }
}
