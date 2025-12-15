package com.valorantbot.api.adapters.entrypoint.web.agentes.v1;

import com.valorantbot.api.domain.Agente;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
public class AgenteValorantV1Response {
    private UUID codigoAgenteValorantBot;
    private UUID codigoAgenteValorantApi;
    private String nomeAgente;
    private UUID identificadorFuncaoAgente;
    private String nomeFuncao;
    private LocalDateTime criadoEm;

    public static AgenteValorantV1Response fromAgente(Agente agente) {
        return AgenteValorantV1Response.builder()
                .codigoAgenteValorantBot(agente.uuidAgenteValorantBot())
                .codigoAgenteValorantApi(agente.uuidAgenteValorantApi())
                .nomeAgente(agente.nomeAgente())
                .identificadorFuncaoAgente(agente.idFuncaoAgente())
                .nomeFuncao(agente.nomeFuncao())
                .criadoEm(agente.criadoEm())
                .build();
    }
}