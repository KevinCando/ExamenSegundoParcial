package kevin.cando.examen2.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpleadoRS {
    private String cedula;
    private String apellidos;
    private String nombres;
    private Integer numeroCuenta;
}
