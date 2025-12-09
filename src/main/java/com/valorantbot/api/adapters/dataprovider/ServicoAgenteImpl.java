package com.valorantbot.api.adapters.dataprovider;

import com.valorantbot.api.adapters.repository.agentes.AgenteRepository;
import com.valorantbot.api.application.service.ServicoAgente;
import com.valorantbot.api.domain.Agente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicoAgenteImpl implements ServicoAgente {

    private final AgenteRepository agenteRepository;

    @Override
    public List<Agente> findAll() {
        return agenteRepository.findAll().stream()
                .map(Agente::toDomain)
                .toList();
    }
}
