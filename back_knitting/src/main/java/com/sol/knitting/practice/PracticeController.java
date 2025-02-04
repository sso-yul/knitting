package com.sol.knitting.practice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PracticeController {
    private final PracticeService practiceService;

    public PracticeController(PracticeService practiceService) {
        this.practiceService = practiceService;
    }

    @GetMapping("/practice")
    public String practice() {
        return "hi";
    }

    @GetMapping("/practice2")
    public ResponseEntity<String> getUser(@RequestParam("id") String id) {
        String result = practiceService.getUserById(id);
        return ResponseEntity.ok(result);
    }
}
