package net.bnijik.srest.RestApi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api")
public class HealthCheckController {

    private static final ResponseEntity<?> EMPTY_RESPONSE_JSON = new ResponseEntity<>(Collections.emptyMap(), HttpStatus.OK);

    @GetMapping("/health-check")
    public ResponseEntity<?> healthCheck() {
        return EMPTY_RESPONSE_JSON;
    }

}
