package com.forgeit.sensors.temperature.usecase;

import com.forgeit.sensors.temperature.infra.rest.AddTemperatureDto;
import org.springframework.stereotype.Service;

@Service
public interface AddTemperatureInputBoundary {

    void create(AddTemperatureDto dto) throws Exception;
}
