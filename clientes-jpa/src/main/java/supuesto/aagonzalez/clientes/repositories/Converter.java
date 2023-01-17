package supuesto.aagonzalez.clientes.repositories;

import org.springframework.stereotype.Component;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.Representante;

import java.util.ArrayList;
import java.util.List;

@Component
public class Converter {

    // CLIENTES

    public Cliente toCliente(ClienteEntity clienteEntity) {

        Cliente cliente = new Cliente();

        cliente.setIdCliente(clienteEntity.getIdCliente());
        cliente.setNombre(clienteEntity.getNombre());
        cliente.setNif(clienteEntity.getNif());
        cliente.setDireccion(clienteEntity.getDireccion());
        cliente.setPais(clienteEntity.getPais());
        if (clienteEntity.getRepresentantes() != null) {
            cliente.setRepresentantes(toRepesentantes(clienteEntity.getRepresentantes()));
        } else{
            cliente.setRepresentantes(new ArrayList());
        }
        return cliente;
    }

    public ClienteEntity toClienteEntity(Cliente cliente) {

        ClienteEntity clienteEntity = new ClienteEntity();

        clienteEntity.setIdCliente(cliente.getIdCliente());
        clienteEntity.setNombre(cliente.getNombre());
        clienteEntity.setNif(cliente.getNif());
        clienteEntity.setDireccion(cliente.getDireccion());
        clienteEntity.setPais(cliente.getPais());
        if (cliente.getRepresentantes() != null) {
            clienteEntity.setRepresentantes(toRepesentantesEntities(cliente.getRepresentantes()));
        } else{
            clienteEntity.setRepresentantes(new ArrayList());
        }

        return clienteEntity;
    }

    public List<Cliente> toClientes(List<ClienteEntity> all) {
        List<Cliente> clienteList = new ArrayList<>();
        for (ClienteEntity c : all) {
            clienteList.add(toCliente(c));
        }
        return clienteList;
    }

    public List<ClienteEntity> toClientesEntities(List<Cliente> all) {
        List<ClienteEntity> clienteEntityList = new ArrayList<>();
        for (Cliente c : all) {
            clienteEntityList.add(toClienteEntity(c));
        }
        return clienteEntityList;
    }

    // REPRESENTANTES

    public Representante toRepresentante(RepresentanteEntity representanteEntity) {

        Representante representante = new Representante();

        representante.setIdRepresentante(representanteEntity.getIdRepresentante());
        representante.setNombre(representanteEntity.getNombre());
        representante.setTelefono(representanteEntity.getTelefono());
        representante.setIdioma(representanteEntity.getIdioma());
        representante.setCliente(toCliente(representanteEntity.getCliente()));


        return representante;
    }

    public RepresentanteEntity toRepresentanteEntity(Representante representante) {

        RepresentanteEntity representanteEntity = new RepresentanteEntity();

        representanteEntity.setIdRepresentante(representante.getIdRepresentante());
        representanteEntity.setNombre(representante.getNombre());
        representanteEntity.setTelefono(representante.getTelefono());
        representanteEntity.setIdioma(representante.getIdioma());
        representanteEntity.setCliente(toClienteEntity(representante.getCliente()));

        return representanteEntity;
    }

    public List<Representante> toRepesentantes(List<RepresentanteEntity> all) {
        List<Representante> representanteList = new ArrayList<>();
        for (RepresentanteEntity r : all) {
            representanteList.add(toRepresentante(r));
        }
        return representanteList;
    }

    public List<RepresentanteEntity> toRepesentantesEntities(List<Representante> all) {
        List<RepresentanteEntity> representanteEntityListList = new ArrayList<>();
        for (Representante r : all) {
            representanteEntityListList.add(toRepresentanteEntity(r));
        }
        return representanteEntityListList;
    }
}
