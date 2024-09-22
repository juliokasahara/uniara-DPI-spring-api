package org.example.controllers;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.models.Veiculo;
import org.example.services.VeiculoService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
@RequiredArgsConstructor
@Validated
public class VeiculoController {

    private final VeiculoService veiculoService;

    @PostMapping
    public Veiculo save(@Valid @RequestBody Veiculo veiculo){
        return veiculoService.add(veiculo);
    }

    @GetMapping
    public List<Veiculo> findAll(){
        return  veiculoService.findAll();
    }

}
