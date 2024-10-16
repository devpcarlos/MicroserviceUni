package org.MicroRabbitMq.mapper;

import org.MicroRabbitMq.dto.DtoCarrrera;
import org.MicroRabbitMq.model.Carrera;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class CarreraMapper {

    public Carrera toCarrera(DtoCarrrera dtoCarrrera) {
        return Carrera.builder()
                .nombreCarrera(dtoCarrrera.getNombreCarrera())
                .piso(dtoCarrrera.getPiso())
                .estado(dtoCarrrera.isEstado())
                .codigoCarrera(dtoCarrrera.getCodigoCarrera())
                .creditos(dtoCarrrera.getCreditos())
                .build();
    }

    public DtoCarrrera toDtoCarrrera(Carrera carrera) {
       return DtoCarrrera.builder()
                .nombreCarrera(carrera.getNombreCarrera())
                .piso(carrera.getPiso())
                .estado(carrera.isEstado())
                .codigoCarrera(carrera.getCodigoCarrera())
                .creditos(carrera.getCreditos())
                .build();
    }

    public Page<DtoCarrrera> dtoCarrreras(Page<Carrera> carreras){
        return carreras.map(carrera -> toDtoCarrrera(carrera));
    }
}
