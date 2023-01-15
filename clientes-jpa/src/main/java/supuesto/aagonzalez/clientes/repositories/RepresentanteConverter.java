package supuesto.aagonzalez.clientes.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import supuesto.aagonzalez.clientes.domain.Representante;

import java.util.ArrayList;
import java.util.List;

@Component
public class RepresentanteConverter {

/*
    private ClienteConverter clienteConverter;

    @Autowired
    public RepresentanteConverter(ClienteConverter clienteConverter) {
        this.clienteConverter = clienteConverter;
    }
*/

    public Representante toRepresentante(RepresentanteEntity representanteEntity) {

        Representante representante = new Representante();

        representante.setIdRepresentante(representanteEntity.getIdRepresentante());
        representante.setNombre(representanteEntity.getNombre());
        representante.setTelefono(representanteEntity.getTelefono());
        representante.setIdioma(representanteEntity.getIdioma());
//        representante.setCliente(clienteConverter.toCliente(representanteEntity.getCliente()));

        return representante;
    }

    public RepresentanteEntity toRepresentanteEntity(Representante representante) {

        RepresentanteEntity representanteEntity = new RepresentanteEntity();

        representanteEntity.setIdRepresentante(representante.getIdRepresentante());
        representanteEntity.setNombre(representante.getNombre());
        representanteEntity.setTelefono(representante.getTelefono());
        representanteEntity.setIdioma(representante.getIdioma());
//        representanteEntity.setCliente(clienteConverter.toClienteEntity(representante.getCliente()));

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
