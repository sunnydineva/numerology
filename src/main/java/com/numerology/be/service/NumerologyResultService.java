package com.numerology.be.service;

import com.numerology.be.entity.NumerologyResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface NumerologyResultService {
    public List<NumerologyResult> getAllResults();

    public NumerologyResult deleteNumerologyResult(UUID id);

    public NumerologyResult saveNumerologyResult(NumerologyResult numerologyResult);

}
