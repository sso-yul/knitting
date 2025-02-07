package com.sol.knitting.domain.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class PracticeController {
    private final PracticeService practiceService;

    @GetMapping("/api/practice")
    public String practice() {
        return "hi";
    }

    @GetMapping("/api/practice2")
    public ResponseEntity<PracticeDto> getUser(@RequestParam("id") String id) {
        PracticeDto result = practiceService.getUserById(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/api/practice3")
    public String getUserNameId(@RequestParam("id") String id) {
        return "name: " + practiceService.getUserById(id).getName() + " Id: " + practiceService.getUserById(id).getId();
    }

    @GetMapping("/api/practice4")
    public String getAllUsersName() {
        List<String> names = practiceService.getAllUsersName();
        return String.join("<br>", names);
    }
}
