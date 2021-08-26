package com.forgeit.sensors.temperature.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTemperatureHistoryRepository extends JpaRepository<TemperatureHistoryDataMapper, String> {
}
