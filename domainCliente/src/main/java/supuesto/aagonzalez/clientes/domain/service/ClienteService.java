package supuesto.aagonzalez.clientes.domain.service;

import org.springframework.web.bind.annotation.PathVariable;
import supuesto.aagonzalez.clientes.domain.Cliente;

import java.util.List;

public interface ClienteService {

    public void addNewCliente();

    public List<Cliente> getAllClientes();

    public List<Cliente> getInfoCliente(@PathVariable("idCliente") Long idCliente);

    public void updateCliente(@PathVariable("idCliente") Long idCliente);

    public void deleteCliente(@PathVariable("idCliente") Long idCliente);

}
