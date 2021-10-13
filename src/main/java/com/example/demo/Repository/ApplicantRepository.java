package com.example.demo.Repository;

import com.example.demo.Entity.Applicant;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends MongoRepository<Applicant,Long>{
    
}
