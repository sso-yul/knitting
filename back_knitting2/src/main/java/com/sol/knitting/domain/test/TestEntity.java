package com.sol.knitting.domain.test;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "testuser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestEntity {

    @Id
    private int id;

    @Column
    private String name;
}
