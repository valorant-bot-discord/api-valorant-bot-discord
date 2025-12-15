package com.valorantbot.api.domain;

import com.valorantbot.api.adapters.repository.agentes.AgenteEntity;

import java.time.LocalDateTime;
import java.util.UUID;

public record Agente(
        UUID uuidAgenteValorantBot,
        UUID uuidAgenteValorantApi,
        String nomeAgente,
        UUID idFuncaoAgente,
        String nomeFuncao,
        LocalDateTime criadoEm
) {

    public static Agente toDomain(AgenteEntity entity) {
        return new Agente(
                entity.getUuidAgenteValorantBot(),
                entity.getUuidAgenteValorantApi(),
                entity.getNomeAgente(),
                entity.getFuncaoAgente().getId(),
                entity.getFuncaoAgente().getNome(),
                entity.getCriadoEm()
        );
    }
}
