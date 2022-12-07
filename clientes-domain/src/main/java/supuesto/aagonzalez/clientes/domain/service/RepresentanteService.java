package supuesto.aagonzalez.clientes.domain.service;

import org.springframework.web.bind.annotation.PathVariable;
import supuesto.aagonzalez.clientes.domain.Cliente;

import java.util.List;

public interface RepresentanteService {

     void insertarNuevoRepresentante();

    List<Cliente> obtenerTodosLosRepresentantes();

    List<Cliente> obtenerInfoRepresentante(@PathVariable("idCliente") Long idCliente);

    void actualizarRepresentante(@PathVariable("idCliente") Long idCliente);

    void eliminarRepresentante(@PathVariable("idCliente") Long idCliente);

}
