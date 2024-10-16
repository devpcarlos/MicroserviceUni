package org.MicroRabbitMq.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class DtoCarrrera {

    private String nombreCarrera;
    private int piso;
    private boolean estado;
    private String codigoCarrera;
    private int creditos;
}
