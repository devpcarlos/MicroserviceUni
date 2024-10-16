package org.MicroRabbitMq.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DtoUser {
    private String nombre;
    private String apellido;
    private int fechaNacimiento;
}
