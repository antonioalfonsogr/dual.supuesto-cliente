package supuesto.aagonzalez.clientes.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    private final ClienteCrudRepository clienteCrudRepository;
    private final Converter converter;

    @Autowired
    public ClienteRepositoryImpl(ClienteCrudRepository clienteCrudRepository, Converter converter) {
        this.clienteCrudRepository = clienteCrudRepository;
        this.converter = converter;
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return this.converter.toClientes((List<ClienteEntity>) this.clienteCrudRepository.findAll());
    }

    @Override
    public Optional<Cliente> obtenerInfoCliente(Long idCliente) {
        ClienteEntity clienteEntity = this.clienteCrudRepository.findById(idCliente).orElseThrow();
        return Optional.of(this.converter.toCliente(clienteEntity));
    }

    @Override
    public Cliente insertarCliente(Cliente cliente) {
        ClienteEntity clienteEntity = this.converter.toClienteEntity(cliente);
        return this.converter.toCliente(this.clienteCrudRepository.save(clienteEntity));
    }

    @Override
    public void actualizarCliente(Long idCliente, Cliente cliente) {
        ClienteEntity clienteEntity = this.clienteCrudRepository.findById(idCliente).orElseThrow();
        clienteEntity.setNombre(cliente.getNombre());
        clienteEntity.setNif(cliente.getNif());
        clienteEntity.setDireccion(cliente.getDireccion());
        clienteEntity.setPais(cliente.getPais());
        this.converter.toCliente(this.clienteCrudRepository.save(clienteEntity));
    }

    @Override
    public void eliminarCliente(Long idCliente) {
        ClienteEntity clienteEntity = this.clienteCrudRepository.findById(idCliente).orElseThrow();
        this.clienteCrudRepository.deleteById(clienteEntity.getIdCliente());
    }

}
