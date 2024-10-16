package org.MicroRabbitMq.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "nombre_carrera")
    private String nombreCarrera;
    private int piso;
    private boolean estado;
    @Column(nullable = false, name = "codigo_carrera")
    private String codigoCarrera;
    private int creditos;

}
