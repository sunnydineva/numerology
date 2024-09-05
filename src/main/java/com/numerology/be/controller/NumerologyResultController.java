package com.numerology.be.controller;

import com.numerology.be.entity.NumerologyResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Controller
public interface NumerologyResultController {
    @GetMapping
    public List<NumerologyResult> getAllNumerologyResult() ;

    @GetMapping("/{id}")
    public Optional<NumerologyResult> getNumerologyResultById(@PathVariable UUID id) ;


    @DeleteMapping("/{id}")
    public void deleteNumerologyResult(@PathVariable UUID id) ;
}
