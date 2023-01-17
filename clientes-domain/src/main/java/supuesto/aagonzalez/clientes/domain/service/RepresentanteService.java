package supuesto.aagonzalez.clientes.domain.service;

import org.springframework.web.bind.annotation.PathVariable;
import supuesto.aagonzalez.clientes.domain.Representante;

import java.util.List;

public interface RepresentanteService {

    Representante insertarRepresentante(Long idCliente, Representante representante);

    List<Representante> obtenerTodosLosRepresentantes(Long idCliente);

    Representante obtenerInfoRepresentante(Long idRepresentante);

    void actualizarRepresentante(Long idRepresentante, Representante representante);

    void eliminarRepresentante(Long idRepresentante);
}
