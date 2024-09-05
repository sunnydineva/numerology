package com.numerology.be.controller.impl;

import com.numerology.be.controller.NumerologyResultController;
import com.numerology.be.entity.NumerologyResult;
import com.numerology.be.service.NumerologyResultService;
import com.numerology.be.service.impl.NumerologyResultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/numerology-result")
public class NumerologyResultControllerImpl implements NumerologyResultController {
    @Autowired
    private NumerologyResultServiceImpl numerologyResultService;

    @GetMapping
    public List<NumerologyResult> getAllNumerologyResult() {
        return numerologyResultService.getAllResults();
    }

    @GetMapping("/{id}")
    public Optional<NumerologyResult> getNumerologyResultById(UUID id) {
        return Optional.empty();
    }

    @DeleteMapping("/{id}")
    public void deleteNumerologyResult(UUID id) {
        numerologyResultService.deleteNumerologyResult(id);
    }
}
