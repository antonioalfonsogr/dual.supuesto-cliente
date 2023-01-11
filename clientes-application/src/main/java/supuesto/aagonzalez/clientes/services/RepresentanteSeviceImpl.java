package supuesto.aagonzalez.clientes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import supuesto.aagonzalez.clientes.domain.Representante;
import supuesto.aagonzalez.clientes.domain.repository.RepresentanteRepository;
import supuesto.aagonzalez.clientes.domain.service.RepresentanteService;

import java.util.List;

@Service
public class RepresentanteSeviceImpl implements RepresentanteService {

    private RepresentanteRepository representanteRepository;

    @Autowired
    public RepresentanteSeviceImpl(RepresentanteRepository representanteRepository) {
        this.representanteRepository = representanteRepository;
    }

    @Override
    public Representante insertarRepresentante(Representante representante) {
        return this.representanteRepository.insertarRepresentate(representante);
    }

    @Override
    public List<Representante> obtenerTodosLosRepresentantes() {
        return this.representanteRepository.obtenerRepresentante();
    }

    @Override
    public Representante obtenerInfoRepresentante(Long idRepresentante) {
        return this.representanteRepository.obtenerInfoRepresentate(idRepresentante).get();
    }

    @Override
    public void actualizarRepresentante(Long idRepresentante) {
        this.representanteRepository.actualizarRepresentante(idRepresentante);
    }

    @Override
    public void eliminarRepresentante(Long idRepresentante) {
        this.representanteRepository.eliminarRepresentante(idRepresentante);
    }
}
