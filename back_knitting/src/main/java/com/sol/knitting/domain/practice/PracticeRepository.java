package com.sol.knitting.domain.practice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends MongoRepository<PracticeEntity, String> {
}

