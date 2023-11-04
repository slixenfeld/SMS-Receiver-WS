package de.hp5c.sms.smsws.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "SMS")
@Table(name = "sms")
@Data
@NoArgsConstructor
public class SMS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String _from;
    private String text;
    private String sentStamp;
    private String receivedStamp;
    private String sim;
}
