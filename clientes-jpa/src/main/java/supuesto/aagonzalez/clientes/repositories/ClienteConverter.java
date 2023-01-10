package supuesto.aagonzalez.clientes.repositories;

import org.springframework.stereotype.Component;
import supuesto.aagonzalez.clientes.domain.Cliente;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteConverter {

    public Cliente toCliente(ClienteEntity clienteEntity){

        Cliente cliente = new Cliente();

        cliente.setIdCliente(clienteEntity.getIdCliente());
        cliente.setNombre(clienteEntity.getNombre());
        cliente.setNif(clienteEntity.getNif());
        cliente.setDireccion(clienteEntity.getDireccion());
        cliente.setPais(clienteEntity.getPais());

        return cliente;
    };

    public ClienteEntity toClienteEntity(Cliente cliente){

        ClienteEntity clienteEntity = new ClienteEntity();

        clienteEntity.setIdCliente(cliente.getIdCliente());
        clienteEntity.setNombre(cliente.getNombre());
        clienteEntity.setNif(cliente.getNif());
        clienteEntity.setDireccion(cliente.getDireccion());
        clienteEntity.setPais(cliente.getPais());

        return clienteEntity;
    }

    public List<Cliente> toClientes(List<ClienteEntity> all) {
        List<Cliente> clienteList= new ArrayList<>();
        for (ClienteEntity c:all) {
            clienteList.add(toCliente(c));
        }
        return clienteList;
    }

    public List<ClienteEntity> toClientesEntities(List<Cliente> all) {
        List<ClienteEntity> clienteEntityList= new ArrayList<>();
        for (Cliente c:all) {
            clienteEntityList.add(toClienteEntity(c));
        }
        return clienteEntityList;
    }
}
