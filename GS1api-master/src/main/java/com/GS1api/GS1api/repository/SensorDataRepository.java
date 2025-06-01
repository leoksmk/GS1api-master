package com.GS1api.GS1api.repository;

import com.GS1api.GS1api.model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDataRepository extends JpaRepository<SensorData, Long> {
}