package com.numerology.be.service.impl;

import com.numerology.be.entity.NumerologyResult;
import com.numerology.be.repository.NumerologyResultRepository;
import com.numerology.be.service.NumerologyResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NumerologyResultServiceImpl implements NumerologyResultService {
    @Autowired
    private NumerologyResultRepository numerologyResultRepository;

    public List<NumerologyResult> getAllResults() {
        return numerologyResultRepository.findAll();
    }

    @Override
    public NumerologyResult deleteNumerologyResult(UUID id) {
        return numerologyResultRepository.deleteNumerologyResult(id);
    }

    public NumerologyResult saveNumerologyResult(NumerologyResult numerologyResult) {
        return numerologyResultRepository.save(numerologyResult);
    }
}
