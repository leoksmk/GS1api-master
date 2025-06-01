package com.GS1api.GS1api.controler;

import com.GS1api.GS1api.model.ControlAction;
import com.GS1api.GS1api.service.ControlActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/control-actions")
public class ControlActionController {
    @Autowired
    private ControlActionService service;

    @PostMapping
    public ControlAction executeAction() {
        return service.executeAction();
    }

    @GetMapping
    public List<ControlAction> getAllActions() {
        return service.getAllActions();
    }
}