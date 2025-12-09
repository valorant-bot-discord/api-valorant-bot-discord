package com.valorantbot.api.adapters.entrypoint.web.agentes.v1;

import com.valorantbot.api.application.usecase.agentes.ListarAgentesUseCase;
import com.valorantbot.api.domain.Agente;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/valorant/agentes")
@RequiredArgsConstructor
public class AgenteValorantV1Controller {
    private final ListarAgentesUseCase listarAgentesUseCase;

    @GetMapping
    public ResponseEntity<List<AgenteValorantV1Response>> listarAgentes() {
        List<Agente> agentes = listarAgentesUseCase.executar();

        List<AgenteValorantV1Response> resposta = agentes.stream()
                .map(AgenteValorantV1Response::fromAgente)
                .collect(Collectors.toList());

        return ResponseEntity.ok(resposta);
    }
}
