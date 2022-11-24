package supuesto.aagonzalez.clientes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.repository.ClienteRepository;
import supuesto.aagonzalez.clientes.repositories.ClienteEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl {
    @Autowired
    ClienteRepository clienteRepository;


    public ClienteEntity addNewCliente(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }


    public List<ClienteEntity> getAllClientes() {
        return (ArrayList<ClienteEntity>) clienteRepository.findAll();
    }


    public List<Cliente> getInfoCliente(Long idCliente) {
        return null;
    }


    public void updateCliente(Long idCliente) {

    }


    public void deleteCliente(Long idCliente) {

    }
}
