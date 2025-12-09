package com.valorantbot.api.application.usecase.agentes;

import com.valorantbot.api.domain.Agente;

import java.util.List;

public interface ListarAgentesUseCase {
    List<Agente> executar();
}
