package com.valorantbot.api.adapters.repository.agentes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgenteRepository extends JpaRepository<AgenteEntity, UUID> {
}
