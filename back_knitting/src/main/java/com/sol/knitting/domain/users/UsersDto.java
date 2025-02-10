package com.sol.knitting.domain.users;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UsersDto {
    private String id;
    private String name;
    private String user_id;
    private String email;
    private int age;
    private String address;
    private String address_detail;
    private String nickname;

    public UsersDto(String id, String name, String user_id, String email, int age,
                    String address, String address_detail, String nickname) {
        this.id = id;
        this.name = name;
        this.user_id = user_id;
        this.email = email;
        this.age = age;
        this.address = address;
        this.address_detail = address_detail;
        this.nickname = nickname;
    }

    public static UsersDto fromEntity(UsersEntity usersEntity) {
        return UsersDto.builder()
                .id(usersEntity.getId())
                .name(usersEntity.getName())
                .user_id(usersEntity.getUser_id())
                .email(usersEntity.getEmail())
                .age(usersEntity.getAge())
                .address(usersEntity.getAddress())
                .address_detail(usersEntity.getAddress_detail())
                .nickname(usersEntity.getNickname())
                .build();
    }
}
