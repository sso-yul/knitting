package com.sol.knitting.domain.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PracticeService {
    private final PracticeRepository practiceRepository;

    public PracticeDto getUserById(String id) {
        return practiceRepository.findById(id)
                .map(PracticeDto::fromEntity)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<String> getAllUsersName() {
        return practiceRepository.findAll()
                .stream()
                .map(PracticeEntity::getName)
                .collect(Collectors.toList());
    }
}
