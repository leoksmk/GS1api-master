package com.GS1api.GS1api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double waterLevel; // Nível da água em metros

    private String weatherCondition; // Condição climática (ex.: "Chuva", "Ensolarado")

    private LocalDateTime timestamp; // Data e hora da leitura
}