package com.sol.knitting.domain.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsersService {
    private final UsersRepository usersRepository;



}
