package com.sol.knitting.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PracticeService {
    private final PracticeRepository practiceRepository;

    public String getUserById(String id) {
        return practiceRepository.findById(id)
                .map(PracticeDto::getName)
                .orElse("Not found User");
    }
}
