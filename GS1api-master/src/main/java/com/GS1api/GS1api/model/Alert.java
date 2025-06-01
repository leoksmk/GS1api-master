package com.GS1api.GS1api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String riskLevel; // Nível de risco (ex.: "Baixo", "Médio", "Alto")

    private String message; // Mensagem do alerta

    private LocalDateTime timestamp; // Data e hora do alerta
}