package com.sol.knitting.domain.users;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class UsersEntity {

    @Id
    private String id;

    private String name;
    private String user_id;
    private String pwd;
    private String email;
    private int age;
    private String address;
    private String address_detail;
    private String nickname;
    private String state;

    @CreatedDate
    private Instant created_time;

    @LastModifiedDate
    private Instant latest_login;
}
