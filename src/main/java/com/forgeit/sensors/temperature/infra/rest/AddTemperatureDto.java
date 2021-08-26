package com.forgeit.sensors.temperature.infra.rest;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@ToString
public class AddTemperatureDto {
    private final BigDecimal temperature;
    private final LocalDateTime createdAt;
    private final String sensor;
}
