package supuesto.aagonzalez.clientes.domain.repository;

import supuesto.aagonzalez.clientes.domain.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository {

    List<Cliente> obtenerClientes();

    Optional<Cliente> obtenerInfoCliente(Long idCliente);

    Cliente insertarCliente(Cliente cliente);

    void actualizarCliente(Long idCliente, Cliente cliente);

    void eliminarCliente(Long idCliente);

}
