package supuesto.aagonzalez.clientes.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import supuesto.aagonzalez.clientes.domain.Representante;

@Repository
public interface RepresentanteRepository extends CrudRepository<Representante, Long> {
}
