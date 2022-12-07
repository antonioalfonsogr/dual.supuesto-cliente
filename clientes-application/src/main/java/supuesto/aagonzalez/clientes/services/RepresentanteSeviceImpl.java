package supuesto.aagonzalez.clientes.services;

import org.springframework.beans.factory.annotation.Autowired;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.repository.ClienteRepository;
import supuesto.aagonzalez.clientes.domain.repository.RepresentanteRepository;
import supuesto.aagonzalez.clientes.domain.service.RepresentanteService;

import java.util.List;

public class RepresentanteSeviceImpl implements RepresentanteService {

    private RepresentanteRepository representanteRepository;

    @Autowired
    public RepresentanteSeviceImpl(RepresentanteRepository representanteRepository){
        this.representanteRepository = representanteRepository;
    }

    @Override
    public void insertarNuevoRepresentante() {

    }

    @Override
    public List<Cliente> obtenerTodosLosRepresentantes() {
        return null;
    }

    @Override
    public List<Cliente> obtenerInfoRepresentante(Long idCliente) {
        return null;
    }

    @Override
    public void actualizarRepresentante(Long idCliente) {

    }

    @Override
    public void eliminarRepresentante(Long idCliente) {

    }
}
