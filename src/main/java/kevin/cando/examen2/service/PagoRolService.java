package kevin.cando.examen2.service;

import kevin.cando.examen2.controller.dto.EmpleadoPagoRQ;
import kevin.cando.examen2.controller.dto.PagoRolRQ;
import kevin.cando.examen2.model.EmpleadoPago;
import kevin.cando.examen2.model.PagoRol;
import kevin.cando.examen2.repository.PagoRolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoRolService {

    private final PagoRolRepository pagoRolRepository;

    public PagoRolService(PagoRolRepository pagoRolRepository) {
        this.pagoRolRepository = pagoRolRepository;
    }


    public PagoRol transformPagoRolRQ(PagoRolRQ pagoRolRQ){
        return PagoRol.builder()
                .mes(pagoRolRQ.getMes())
                .fechaProceso(pagoRolRQ.getFechaProceso())
                .rucEmpresa(pagoRolRQ.getRucEmpresa())
                .cuentaPrincipal((pagoRolRQ.getCuentaPrincipal()))
                .empleadosPago()
                .build();
    }

    private List<EmpleadoPago>

    private EmpleadoPago transformEmpleadoPagoRQ(EmpleadoPagoRQ rq){
        return EmpleadoPago.builder()
                .numeroCuenta(rq.getNumeroCuenta())
                .valor(rq.getValor())
                .build();
    }
}
