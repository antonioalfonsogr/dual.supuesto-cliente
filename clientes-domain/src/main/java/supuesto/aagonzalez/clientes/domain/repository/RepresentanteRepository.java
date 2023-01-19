package supuesto.aagonzalez.clientes.domain.repository;

import supuesto.aagonzalez.clientes.domain.Representante;

import java.util.List;
import java.util.Optional;

public interface RepresentanteRepository {

    List<Representante> obtenerRepresentantes(Long idCliente);

    Optional<Representante> obtenerInfoRepresentate(Long idRepresentante);

    Representante insertarRepresentate(Long idCliente, Representante representante);

    void actualizarRepresentante(Long idRepresentate, Representante representante);

    void eliminarRepresentante(Long idRepresentante);


}
