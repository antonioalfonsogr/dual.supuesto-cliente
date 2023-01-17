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
    private ClienteCrudRepository clienteCrudRepository;

    @Autowired
    public RepresentanteRepositoryImpl(RepresentanteCrudRepository representanteCrudRepository, Converter converter, ClienteCrudRepository clienteCrudRepository) {
        this.representanteCrudRepository = representanteCrudRepository;
        this.converter = converter;
        this.clienteCrudRepository = clienteCrudRepository;
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
        representanteEntity.setCliente(clienteCrudRepository.findById(idCliente).orElseThrow());
        return this.converter.toRepresentante(this.representanteCrudRepository.save(representanteEntity));
    }

    @Override
    public void actualizarRepresentante(Long idRepresentat, Representante representante) {
        RepresentanteEntity representanteEntity = this.converter.toRepresentanteEntity(representante);
        representanteEntity.setIdRepresentante(idRepresentat);
        this.converter.toRepresentante(this.representanteCrudRepository.save(representanteEntity));
    }

    @Override
    public void eliminarRepresentante(Long idRepresentante) {
        RepresentanteEntity representanteEntity = this.representanteCrudRepository.findById(idRepresentante).orElseThrow();
        this.representanteCrudRepository.deleteById(representanteEntity.getIdRepresentante());
    }
}
