package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.models.Servico;
import org.example.repositories.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicoService {

    private final ServicoRepository servicoRepository;
    public Servico add(Servico servico){
        return servicoRepository.save(servico);
    }
    public List<Servico> findAll(){
        return servicoRepository.findAll();
    }
}
