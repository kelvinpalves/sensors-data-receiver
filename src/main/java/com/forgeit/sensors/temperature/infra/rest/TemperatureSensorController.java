package com.forgeit.sensors.temperature.infra.rest;

import com.forgeit.sensors.temperature.usecase.AddTemperatureInputBoundary;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/sensors/temperature")
@RequiredArgsConstructor
public class TemperatureSensorController {

    private final AddTemperatureInputBoundary addTemperature;

    @PostMapping
    public void create(@RequestBody AddTemperatureDto dto) {
        try {
            this.addTemperature.create(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
