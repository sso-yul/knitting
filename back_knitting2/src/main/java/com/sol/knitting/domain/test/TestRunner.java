package com.sol.knitting.domain.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private TestRepository userRepository;

    @Override
    public void run(String... args) throws Exception {


    }
}
