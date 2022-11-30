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

    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.buscarClientes();
    }
}
