package supuesto.aagonzalez.clientes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.repository.ClienteRepository;
import supuesto.aagonzalez.clientes.domain.service.ClienteService;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente insertarCliente(Cliente cliente) {
        return this.clienteRepository.insertarCliente(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return this.clienteRepository.obtenerClientes();
    }

    @Override
    public Cliente obtenerCliente(Long idCliente) {
        return this.clienteRepository.obtenerCliente(idCliente).get();
    }

    @Override
    public void actualizarCliente(Long idCliente, Cliente cliente) {
        this.clienteRepository.actualizarCliente(idCliente, cliente);
    }

    @Override
    public void eliminarCliente(Long idCliente) {
        this.clienteRepository.eliminarCliente(idCliente);
    }
}
