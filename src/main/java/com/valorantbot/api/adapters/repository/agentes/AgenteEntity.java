package com.valorantbot.api.adapters.repository.agentes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "tb_bot_valorant_agentes")
public class AgenteEntity {

    @Id
    @Column(name = "uuid_agente_valorant_bot", nullable = false, updatable = false)
    private UUID uuidAgenteValorantBot;

    @Column(name = "uuid_agente_valorant_api")
    private UUID uuidAgenteValorantApi;

    @Column(name = "nome_agente", length = 100, nullable = false, unique = true)
    private String nomeAgente;

    @ManyToOne
    @JoinColumn(name = "id_funcao_agente", nullable = false)
    private FuncaoAgenteEntity funcaoAgente;

    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;
}