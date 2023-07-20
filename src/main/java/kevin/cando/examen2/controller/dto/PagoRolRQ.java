package kevin.cando.examen2.controller.dto;

import kevin.cando.examen2.model.EmpleadoPago;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class PagoRolRQ {

    private Integer mes;
    private Date fechaProceso;
    private Integer rucEmpresa;
    private Integer cuentaPrincipal;
    private List<EmpleadoPagoRQ> empleadosPagoRQ;
}
