package com.tisharun.esteiracicd;

import java.time.Instant;

public record Payload(
        String service,
        String status,
        Instant timestamp,
        String message
){

}
