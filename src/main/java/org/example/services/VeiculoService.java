package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.models.Veiculo;
import org.example.repositories.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;
    public Veiculo add(Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }
    public List<Veiculo> findAll(){
        return veiculoRepository.findAll();
    }
}
