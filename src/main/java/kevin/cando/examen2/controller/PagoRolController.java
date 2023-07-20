package kevin.cando.examen2.controller;

import kevin.cando.examen2.controller.dto.EmpresaRQ;
import kevin.cando.examen2.controller.dto.PagoRolRQ;
import kevin.cando.examen2.service.PagoRolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pago-rol")
public class PagoRolController {
    private final PagoRolService pagoRolService;

    public PagoRolController(PagoRolService pagoRolService) {
        this.pagoRolService = pagoRolService;
    }

    @PostMapping("/rol-create/{mes}")
    public ResponseEntity<?> createPagoRol(@RequestBody PagoRolRQ pagoRolRQ,
                                           @PathVariable(name = "mes") Integer mes){
        try{
            this.pagoRolService.crearPagoRol(pagoRolRQ, mes);
            return ResponseEntity.ok().build();
        }catch (RuntimeException rte){
            return ResponseEntity.badRequest().build();
        }
    }
}
