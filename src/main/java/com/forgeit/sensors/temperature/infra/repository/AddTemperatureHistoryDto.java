package com.forgeit.sensors.temperature.infra.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Getter
@ToString
public class AddTemperatureHistoryDto {
    private final BigDecimal temperature;
    private final LocalDateTime createdAt;
    private final LocalDateTime capturedAt;
    private final String sensor;
}
