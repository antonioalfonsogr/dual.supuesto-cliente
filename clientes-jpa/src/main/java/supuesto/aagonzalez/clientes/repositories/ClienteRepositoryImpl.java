package supuesto.aagonzalez.clientes.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Override
    public List<Cliente> buscarClientes() {


        final List<Cliente> clienteList = new ArrayList<>();


        return clienteList;
    }

}
