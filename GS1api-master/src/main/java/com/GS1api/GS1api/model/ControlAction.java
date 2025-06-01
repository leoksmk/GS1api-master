package com.GS1api.GS1api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class ControlAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String actionType; // Tipo de ação (ex.: "Ativar barreira", "Monitoramento")

    private String status; // Status da ação (ex.: "Executada", "Pendente")

    private LocalDateTime timestamp; // Data e hora da ação
}