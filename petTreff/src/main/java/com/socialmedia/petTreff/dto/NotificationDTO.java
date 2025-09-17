package com.socialmedia.petTreff.dto;

import com.socialmedia.petTreff.entity.NotificationType;
import lombok.Data;

import java.time.Instant;

@Data
public class NotificationDTO {
    private Long id;              // id von das Notification selber
    private NotificationType type; // chat , Friend
    private String title;  //  or post , comment
    private String text;   // der eigentliche Text der Benachrichtigung
    private Instant createdAt;   // wann die Benachrichtigung erstellt wurde
    private boolean read;     // true = gelesen, false = ungelesen
    private Long actorId;   // id von der User der die Aktion ausgelöst hat
    private Long refId;    // id von aufgerufene Benachrichtigung aus seine eigner Tabelle
}
