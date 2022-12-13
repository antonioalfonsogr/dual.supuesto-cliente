package supuesto.aagonzalez.clientes.repositories;

import org.mapstruct.*;
import org.springframework.stereotype.Component;
import supuesto.aagonzalez.clientes.domain.Cliente;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface ClienteConverter {
    @Mappings({
            @Mapping(source = "idCliente", target = "idCliente"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "nif", target = "nif"),
            @Mapping(source = "direcion", target = "direcion"),
            @Mapping(source = "pais", target = "pais"),
    })
    Cliente toCliente(ClienteEntity cliente);
    List<Cliente> toClientes(List<ClienteEntity> clienteEntity);

    @InheritInverseConfiguration
    ClienteEntity toClienteEntity (Cliente cliente);

}
