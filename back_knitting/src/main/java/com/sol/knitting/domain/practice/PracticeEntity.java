package com.sol.knitting.domain.practice;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users") //테이블 이름
public class PracticeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

}
