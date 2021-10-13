package com.example.demo.Repository;

import com.example.demo.Entity.Passport;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends MongoRepository<Passport,Long> {
    
}
