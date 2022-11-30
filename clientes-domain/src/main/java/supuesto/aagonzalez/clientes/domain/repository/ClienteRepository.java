package supuesto.aagonzalez.clientes.domain.repository;

import supuesto.aagonzalez.clientes.domain.Cliente;

import java.util.List;

public interface ClienteRepository {

    List<Cliente> buscarClientes();

}
