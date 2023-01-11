package supuesto.aagonzalez.clientes.domain.service;

import org.springframework.web.bind.annotation.PathVariable;
import supuesto.aagonzalez.clientes.domain.Representante;

import java.util.List;

public interface RepresentanteService {

    Representante insertarRepresentante(Representante representante);

    List<Representante> obtenerTodosLosRepresentantes();

    Representante obtenerInfoRepresentante(@PathVariable("idRepresentante") Long idRepresentante);

    void actualizarRepresentante(@PathVariable("idRepresentante") Long idRepresentante);

    void eliminarRepresentante(@PathVariable("idRepresentante") Long idRepresentante);
}
