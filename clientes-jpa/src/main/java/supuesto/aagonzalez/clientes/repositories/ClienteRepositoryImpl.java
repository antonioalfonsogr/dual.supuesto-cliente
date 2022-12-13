package supuesto.aagonzalez.clientes.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Repository;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {
    private final ClienteCrudRepository clienteCrudRepository;

    @Autowired
    private ClienteConverter clienteConverter;

    public ClienteRepositoryImpl(ClienteCrudRepository clienteCrudRepository) {
        this.clienteCrudRepository = clienteCrudRepository;
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return this.clienteConverter.toClientes((List<ClienteEntity>) this.clienteCrudRepository.findAll());
    }

    @Override
    public Optional<Cliente> obtenerInfoCliente(Long idCliente) {
        ClienteEntity clienteEntity = this.clienteCrudRepository.findById(idCliente).orElseThrow();
        return Optional.of(this.clienteConverter.toCliente(clienteEntity));
    }

    @Override
    public Cliente insertarCliente(Cliente cliente) {
        ClienteEntity clienteEntity = this.clienteConverter.toClienteEntity(cliente);
        return this.clienteConverter.toCliente(this.clienteCrudRepository.save(clienteEntity));
    }

    @Override
    public void actualizarCliente(Long idCliente) {
        ClienteEntity clienteEntity = this.clienteCrudRepository.findById(idCliente).orElseThrow();
    }

    @Override
    public void eliminarCliente(Long idCliente) {
        ClienteEntity clienteEntity = this.clienteCrudRepository.findById(idCliente).orElseThrow();
        this.clienteCrudRepository.deleteById(clienteEntity.getIdCliente());
    }
}
