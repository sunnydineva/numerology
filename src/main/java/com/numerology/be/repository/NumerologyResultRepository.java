package com.numerology.be.repository;

import com.numerology.be.entity.NumerologyResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NumerologyResultRepository extends JpaRepository<NumerologyResult, UUID> {
    NumerologyResult deleteNumerologyResult(UUID id);
}
