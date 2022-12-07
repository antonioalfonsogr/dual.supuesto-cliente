package supuesto.aagonzalez.clientes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.repository.ClienteRepository;
import supuesto.aagonzalez.clientes.domain.service.ClienteService;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente insertarCliente(Cliente cliente) {

        return cliente;
    }

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.buscarClientes();
    }

    @Override
    public List<Cliente> obtenerInfoCliente(Long idCliente) {
        return null;
    }

    @Override
    public void actualizarCliente(Long idCliente) {

    }

    @Override
    public void eliminarCliente(Long idCliente) {

    }
}
