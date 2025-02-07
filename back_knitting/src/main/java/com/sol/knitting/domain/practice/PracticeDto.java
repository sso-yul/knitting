package com.sol.knitting.domain.practice;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PracticeDto {
    private String id;
    private String name;

    public PracticeDto(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static PracticeDto fromEntity(PracticeEntity practiceEntity) {
        return new PracticeDto(practiceEntity.getName(), practiceEntity.getId());
    }
}
