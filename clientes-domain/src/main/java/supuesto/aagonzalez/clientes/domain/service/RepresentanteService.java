package supuesto.aagonzalez.clientes.domain.service;

import supuesto.aagonzalez.clientes.domain.Representante;

import java.util.List;

public interface RepresentanteService {

    Representante insertarRepresentante(Long idCliente, Representante representante);

    List<Representante> obtenerRepresentantes(Long idCliente);

    Representante obtenerRepresentante(Long idRepresentante);

    void actualizarRepresentante(Long idRepresentante, Representante representante);

    void eliminarRepresentante(Long idRepresentante);
}
