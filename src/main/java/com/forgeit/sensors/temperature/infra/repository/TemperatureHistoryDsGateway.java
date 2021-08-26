package com.forgeit.sensors.temperature.infra.repository;

import org.springframework.stereotype.Component;

@Component
public interface TemperatureHistoryDsGateway {

    void create(AddTemperatureHistoryDto dto);

}
