package de.hp5c.sms.smsws.model;

import lombok.Data;

@Data
public class SMS {
    String from;
    String text;
    String sentStamp;
    String receivedStamp;
    String sim;
}
