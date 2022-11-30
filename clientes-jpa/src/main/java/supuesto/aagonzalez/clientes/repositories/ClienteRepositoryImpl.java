package supuesto.aagonzalez.clientes.repositories;

import org.springframework.stereotype.Repository;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.repository.ClienteRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Override
    public List<Cliente> buscarClientes() {

        final Cliente cliente = new Cliente();
        cliente.setFechaAlta(LocalDateTime.now());
        cliente.setId(Long.valueOf("101"));
        cliente.setNombre("Servicio Andaluz de Empleo");
        cliente.setRepresentantes(new ArrayList<>());

        final List<Cliente> list = new ArrayList<>();
        list.add(cliente);

        return list;
    }

}
