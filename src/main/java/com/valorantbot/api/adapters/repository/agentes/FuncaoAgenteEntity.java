package com.valorantbot.api.adapters.repository.agentes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "tb_bot_valorant_funcoes_agentes")
public class FuncaoAgenteEntity {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "nome", length = 50, nullable = false, unique = true)
    private String nome;
}