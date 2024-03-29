package supuesto.aagonzalez.clientes.domain.service;

import supuesto.aagonzalez.clientes.domain.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente insertarCliente(Cliente cliente);

    List<Cliente> obtenerClientes();

    Cliente obtenerCliente(Long idCliente);

    void actualizarCliente(Long idCliente, Cliente cliente);

    void eliminarCliente(Long idCliente);
}
