package com.project.cineworld.userservice.service;

import com.project.cineworld.userservice.entity.Claim;

public interface ClaimService {

    Claim getClaimByClaimName(String claimName);
}