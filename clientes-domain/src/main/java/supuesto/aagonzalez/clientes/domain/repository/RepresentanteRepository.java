package supuesto.aagonzalez.clientes.domain.repository;

import supuesto.aagonzalez.clientes.domain.Representante;

import java.util.List;
import java.util.Optional;

public interface RepresentanteRepository {

    List<Representante> obtenerRepresentante();

    Optional<Representante> obtenerInfoRepresentate(Long idRepresentante);

    Representante insertarRepresentate(Representante representante);

    void actualizarRepresentante(Long idRepresentate);

    void eliminarRepresentante(Long idRepresentante);


}
