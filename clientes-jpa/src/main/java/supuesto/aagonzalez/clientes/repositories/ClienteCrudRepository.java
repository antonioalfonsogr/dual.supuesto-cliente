package supuesto.aagonzalez.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteCrudRepository extends JpaRepository<ClienteEntity, Long> {
}
