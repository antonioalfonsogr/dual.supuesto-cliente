package supuesto.aagonzalez.clientes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import supuesto.aagonzalez.clientes.domain.Representante;
import supuesto.aagonzalez.clientes.domain.repository.RepresentanteRepository;
import supuesto.aagonzalez.clientes.domain.service.RepresentanteService;

import java.util.List;

@Service
public class RepresentanteSeviceImpl implements RepresentanteService {

    private final RepresentanteRepository representanteRepository;

    @Autowired
    public RepresentanteSeviceImpl(RepresentanteRepository representanteRepository) {
        this.representanteRepository = representanteRepository;
    }

    @Override
    public Representante insertarRepresentante(Long idCliente, Representante representante) {
        return this.representanteRepository.insertarRepresentate(idCliente, representante);
    }

    @Override
    public List<Representante> obtenerRepresentantes(Long idCliente) {
        return this.representanteRepository.obtenerRepresentantes(idCliente);
    }

    @Override
    public Representante obtenerRepresentante(Long idRepresentante) {
        return this.representanteRepository.obtenerInfoRepresentate(idRepresentante).get();
    }

    @Override
    public void actualizarRepresentante(Long idRepresentante, Representante representante) {
        this.representanteRepository.actualizarRepresentante(idRepresentante, representante);
    }

    @Override
    public void eliminarRepresentante(Long idRepresentante) {
        this.representanteRepository.eliminarRepresentante(idRepresentante);
    }
}
