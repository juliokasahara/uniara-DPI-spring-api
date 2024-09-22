package org.example.controllers;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.models.Servico;
import org.example.services.ServicoService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
@RequiredArgsConstructor
@Validated
public class ServicoController {

    private final ServicoService servicoService;

    @PostMapping
    public Servico save(@Valid @RequestBody Servico servico){
        return servicoService.add(servico);
    }

    @GetMapping
    public List<Servico> findAll(){
        return  servicoService.findAll();
    }

}
