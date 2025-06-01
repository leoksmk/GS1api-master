package com.GS1api.GS1api.controler;

import com.GS1api.GS1api.model.Alert;
import com.GS1api.GS1api.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {
    @Autowired
    private AlertService service;

    @PostMapping
    public Alert generateAlert() {
        return service.generateAlert();
    }

    @GetMapping
    public List<Alert> getAllAlerts() {
        return service.getAllAlerts();
    }
}