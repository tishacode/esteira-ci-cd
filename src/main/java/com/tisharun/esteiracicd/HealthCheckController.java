package com.tisharun.esteiracicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {

    @GetMapping
    public ResponseEntity<Payload> status() {
        return ResponseEntity.ok(
                new Payload(
                        "esteira-ci-cd",
                        "UP",
                        java.time.Instant.now(),
                        "CI/CD Pipeline Service is running"
                ));

    }

}
