package com.forgeit.sensors.temperature.usecase;

import com.forgeit.sensors.temperature.infra.repository.AddTemperatureHistoryDto;
import com.forgeit.sensors.temperature.infra.repository.TemperatureHistoryDsGateway;
import com.forgeit.sensors.temperature.infra.rest.AddTemperatureDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Log4j2
public class AddTemperatureInteractor implements AddTemperatureInputBoundary {

    private final TemperatureHistoryDsGateway dsGateway;

    @Override
    public void create(AddTemperatureDto dto) throws Exception {
        log.debug("Calling use case: create new temperature history | input: {}", dto);

        AddTemperatureHistoryDto repositoryDto = AddTemperatureHistoryDto.builder()
                .temperature(dto.getTemperature())
                .capturedAt(dto.getCreatedAt())
                .createdAt(LocalDateTime.now())
                .sensor(dto.getSensor())
                .build();

        dsGateway.create(repositoryDto);
    }
}
