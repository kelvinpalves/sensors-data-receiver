package com.forgeit.sensors.temperature.infra.rest;

import com.forgeit.sensors.temperature.usecase.AddTemperatureInputBoundary;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public/sensors/temperature")
@RequiredArgsConstructor
public class TemperatureSensorController {

    private final AddTemperatureInputBoundary addTemperature;

    @Operation(description = "Está funcionalidade deve ser utilizada para registrar as temperaturas retornadas pelos sensores.",
            summary = "Adicionar registro de temperatura",
            tags = "Temperatura")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody AddTemperatureDto dto) {
        try {
            this.addTemperature.create(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
