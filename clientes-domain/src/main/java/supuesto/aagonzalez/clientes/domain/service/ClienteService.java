package supuesto.aagonzalez.clientes.domain.service;

import org.springframework.web.bind.annotation.PathVariable;
import supuesto.aagonzalez.clientes.domain.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente insertarCliente(Cliente cliente);

    List<Cliente> obtenerTodosLosClientes();

    Cliente obtenerInfoCliente(@PathVariable("idCliente") Long idCliente);

    void actualizarCliente(@PathVariable("idCliente") Long idCliente);

    void eliminarCliente(@PathVariable("idCliente") Long idCliente);
}
