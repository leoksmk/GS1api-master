package com.GS1api.GS1api.repository;

import com.GS1api.GS1api.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Long> {
}