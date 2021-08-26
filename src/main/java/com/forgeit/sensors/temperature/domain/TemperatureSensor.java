package com.forgeit.sensors.temperature.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class TemperatureSensor {
    private final BigDecimal temperature;
    private final LocalDateTime createdAt;
    private final String sensorCode;
}
