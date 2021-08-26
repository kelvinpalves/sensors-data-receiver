package com.forgeit.sensors.temperature.infra.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Log4j2
public class JpaTemperatureHistory implements TemperatureHistoryDsGateway {

    private final JpaTemperatureHistoryRepository repository;

    @Override
    public void create(AddTemperatureHistoryDto dto) {
        log.info("Adding to database: {}", dto);

        TemperatureHistoryDataMapper temperatureHistoryDataMapper = new TemperatureHistoryDataMapper();
        temperatureHistoryDataMapper.setTemperature(dto.getTemperature());
        temperatureHistoryDataMapper.setCreatedAt(dto.getCreatedAt());
        temperatureHistoryDataMapper.setCapturedAt(dto.getCapturedAt());
        temperatureHistoryDataMapper.setSensor(dto.getSensor());

        repository.save(temperatureHistoryDataMapper);
    }
}
