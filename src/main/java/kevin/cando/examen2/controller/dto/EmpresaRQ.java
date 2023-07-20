package kevin.cando.examen2.controller.dto;

import kevin.cando.examen2.model.Empleado;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EmpresaRQ {

    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<EmpleadoRQ> empleados;
}
