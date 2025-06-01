package com.GS1api.GS1api.service;

import com.GS1api.GS1api.model.Alert;
import com.GS1api.GS1api.model.ControlAction;
import com.GS1api.GS1api.repository.ControlActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ControlActionService {
    @Autowired
    private ControlActionRepository repository;
    @Autowired
    private AlertService alertService;

    public ControlAction executeAction() {
        Alert latestAlert = alertService.generateAlert();
        ControlAction action = new ControlAction();
        action.setTimestamp(LocalDateTime.now());

        if (latestAlert.getRiskLevel().equals("Alto")) {
            action.setActionType("Ativar barreira");
            action.setStatus("Executada");
        } else {
            action.setActionType("Monitoramento");
            action.setStatus("Pendente");
        }

        return repository.save(action);
    }

    public List<ControlAction> getAllActions() {
        return repository.findAll();
    }
}