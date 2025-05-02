package home.api_gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/users")
    public ResponseEntity<String> usersFallback() {
        return ResponseEntity.ok("User Service is temporarily unavailable. Please try again later.");
    }

    @GetMapping("/orders")
    public ResponseEntity<String> ordersFallback() {
        return ResponseEntity.ok("Order Service is temporarily unavailable. Please try again later.");
    }

}
