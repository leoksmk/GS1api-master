package com.GS1api.GS1api.service;

import com.GS1api.GS1api.model.Alert;
import com.GS1api.GS1api.model.SensorData;
import com.GS1api.GS1api.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlertService {
    @Autowired
    private AlertRepository repository;
    @Autowired
    private SensorDataService sensorDataService;

    public Alert generateAlert() {
        SensorData latestData = sensorDataService.readSensorData();
        String riskLevel;
        String message;

        if (latestData.getWaterLevel() > 8) {
            riskLevel = "Alto";
            message = "Risco de enchente iminente! Evacuação recomendada.";
        } else if (latestData.getWaterLevel() > 5) {
            riskLevel = "Médio";
            message = "Risco moderado de enchente. Fique atento.";
        } else {
            riskLevel = "Baixo";
            message = "Nível de água normal.";
        }

        Alert alert = new Alert();
        alert.setRiskLevel(riskLevel);
        alert.setMessage(message);
        alert.setTimestamp(LocalDateTime.now());
        return repository.save(alert);
    }

    public List<Alert> getAllAlerts() {
        return repository.findAll();
    }
}