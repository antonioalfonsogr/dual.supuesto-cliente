package supuesto.aagonzalez.clientes.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {



    private ClienteConverter clienteConverter;

    @Autowired
    public ClienteRepositoryImpl( ClienteConverter clienteConverter) {

        this.clienteConverter = clienteConverter;
    }

    @Override
    public List<Cliente> obtenerClientes() {
    return null;
    //    return this.clienteConverter.toClientes((List<ClienteEntity>) this.clienteCrudRepository.findAll());
    }

    @Override
    public Optional<Cliente> obtenerInfoCliente(Long idCliente) {
        return null;
    //    ClienteEntity clienteEntity = this.clienteCrudRepository.findById(idCliente).orElseThrow();
      //  return Optional.of(this.clienteConverter.toCliente(clienteEntity));
    }

    @Override
    public Cliente insertarCliente(Cliente cliente) {
        return null;
     //   ClienteEntity clienteEntity = this.clienteConverter.toClienteEntity(cliente);
      //  return this.clienteConverter.toCliente(this.clienteCrudRepository.save(clienteEntity));
    }

    @Override
    public void actualizarCliente(Long idCliente) {
      //  ClienteEntity clienteEntity = this.clienteCrudRepository.findById(idCliente).orElseThrow();
    }

    @Override
    public void eliminarCliente(Long idCliente) {
    //   ClienteEntity clienteEntity = this.clienteCrudRepository.findById(idCliente).orElseThrow();
      //  this.clienteCrudRepository.deleteById(clienteEntity.getIdCliente());
    }

}
