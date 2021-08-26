package com.forgeit.sensors.temperature.infra.repository;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "temperature_history")
@Data
@NoArgsConstructor
public class TemperatureHistoryDataMapper implements Serializable {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    private String sensor;
    private BigDecimal temperature;
    private LocalDateTime capturedAt;
    private LocalDateTime createdAt;

}
