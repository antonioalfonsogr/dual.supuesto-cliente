package supuesto.aagonzalez.clientes.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import supuesto.aagonzalez.clientes.domain.Representante;
import supuesto.aagonzalez.clientes.domain.repository.RepresentanteRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepresentanteRepositoryImpl implements RepresentanteRepository {

    private RepresentanteCrudRepository representanteCrudRepository;
    private Converter converter;

    @Autowired
    public RepresentanteRepositoryImpl(RepresentanteCrudRepository representanteCrudRepository, Converter converter) {
        this.representanteCrudRepository = representanteCrudRepository;
        this.converter = converter;
    }

    @Override
    public List<Representante> obtenerRepresentante(Long idCliente) {
        return this.converter.toRepesentantes((List<RepresentanteEntity>) this.representanteCrudRepository.findAll());
    }

    @Override
    public Optional<Representante> obtenerInfoRepresentate(Long idRepresentante) {
        RepresentanteEntity representanteEntity = this.representanteCrudRepository.findById(idRepresentante).orElseThrow();
        return Optional.of(this.converter.toRepresentante(representanteEntity));
    }

    @Override
    public Representante insertarRepresentate(Long idCliente, Representante representante) {
        RepresentanteEntity representanteEntity = this.converter.toRepresentanteEntity(representante);
        return this.converter.toRepresentante(this.representanteCrudRepository.save(representanteEntity));
    }

    @Override
    public void actualizarRepresentante(Long idRepresentate) {
        RepresentanteEntity representanteEntity = this.representanteCrudRepository.findById(idRepresentate).orElseThrow();
    }

    @Override
    public void eliminarRepresentante(Long idRepresentante) {
        RepresentanteEntity representanteEntity = this.representanteCrudRepository.findById(idRepresentante).orElseThrow();
        this.representanteCrudRepository.deleteById(representanteEntity.getIdRepresentante());
    }
}
