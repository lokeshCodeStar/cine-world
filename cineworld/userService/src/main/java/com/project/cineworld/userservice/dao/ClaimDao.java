package com.project.cineworld.userservice.dao;

import com.project.cineworld.userservice.entity.Claim;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClaimDao extends MongoRepository<Claim, String> {

    Claim getClaimByClaimName(String claimName);
}