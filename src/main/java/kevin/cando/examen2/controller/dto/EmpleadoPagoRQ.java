package kevin.cando.examen2.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpleadoPagoRQ {
    private Integer numeroCuenta;
    private String valor;
}
