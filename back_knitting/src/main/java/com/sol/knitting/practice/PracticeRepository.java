package com.sol.knitting.practice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends MongoRepository<PracticeDto, String> {
}

