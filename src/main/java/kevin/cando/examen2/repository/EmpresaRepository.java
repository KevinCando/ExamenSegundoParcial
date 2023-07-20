package kevin.cando.examen2.repository;

import kevin.cando.examen2.model.Empresa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpresaRepository extends MongoRepository<Empresa, String> {
    Empresa findByRuc(String ruc);
}
