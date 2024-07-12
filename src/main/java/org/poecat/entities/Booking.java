package org.poecat.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Booking {

    private String bookingId;
    private String ownerId;
    private String sitterId;
    private String serviceType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
