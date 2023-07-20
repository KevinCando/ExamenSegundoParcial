package kevin.cando.examen2.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class EmpleadoPago {
    private Integer numeroCuenta;
    private String valor;
    private String estado;
}
