package kevin.cando.examen2.service;

import kevin.cando.examen2.controller.dto.EmpleadoPagoRQ;
import kevin.cando.examen2.controller.dto.EmpleadoRQ;
import kevin.cando.examen2.controller.dto.PagoRolRQ;
import kevin.cando.examen2.model.EmpleadoPago;
import kevin.cando.examen2.model.PagoRol;
import kevin.cando.examen2.repository.PagoRolRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PagoRolService {

    private final PagoRolRepository pagoRolRepository;

    public PagoRolService(PagoRolRepository pagoRolRepository) {
        this.pagoRolRepository = pagoRolRepository;
    }

public void crearPagoRol(PagoRolRQ pagoRolRQ, Integer mes){
    try{
        PagoRol pagoRolRequest = this.transformPagoRolRQ(pagoRolRQ);
        if(pagoRolRequest == null && mes == pagoRolRequest.getMes()){
            this.pagoRolRepository.save(pagoRolRequest);
        }
    }catch (RuntimeException rte){
        throw new RuntimeException();
    }
}

    public PagoRol transformPagoRolRQ(PagoRolRQ pagoRolRQ){
        return PagoRol.builder()
                .mes(pagoRolRQ.getMes())
                .fechaProceso(pagoRolRQ.getFechaProceso())
                .rucEmpresa(pagoRolRQ.getRucEmpresa())
                .cuentaPrincipal((pagoRolRQ.getCuentaPrincipal()))
                .empleadosPago(this.transformEmpleadosPago(pagoRolRQ.getEmpleadosPagoRQ()))
                .build();
    }

    private List<EmpleadoPago> transformEmpleadosPago(List<EmpleadoPagoRQ> empleadoPagoRQList){
        List<EmpleadoPago> empleadoPagoList = new ArrayList<>();
        for(EmpleadoPagoRQ empleadoPagoRQ : empleadoPagoRQList){
            empleadoPagoList.add(this.transformEmpleadoPagoRQ(empleadoPagoRQ));
        }
        return empleadoPagoList;
    }

    private EmpleadoPago transformEmpleadoPagoRQ(EmpleadoPagoRQ rq){
        return EmpleadoPago.builder()
                .numeroCuenta(rq.getNumeroCuenta())
                .valor(rq.getValor())
                .build();
    }
}
