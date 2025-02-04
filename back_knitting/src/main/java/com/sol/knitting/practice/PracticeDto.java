package com.sol.knitting.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users") //테이블 이름 개념
public class PracticeDto {

    @Id
    private String id;

    private String name;
    private String email;
}
