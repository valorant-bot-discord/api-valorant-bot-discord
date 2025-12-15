package com.valorantbot.api.application.usecase.agentes;

import com.valorantbot.api.application.service.ServicoAgente;
import com.valorantbot.api.domain.Agente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListarAgentesUseCaseImpl implements ListarAgentesUseCase {
    private final ServicoAgente servicoAgente;

    @Override
    public List<Agente> executar() {
        return servicoAgente.findAll();
    }
}
