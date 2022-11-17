package supuesto.aagonzalez.clientes.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import supuesto.aagonzalez.clientes.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long>{
}
