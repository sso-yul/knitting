package com.sol.knitting.domain.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
