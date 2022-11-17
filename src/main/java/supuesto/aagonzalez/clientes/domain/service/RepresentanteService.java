package supuesto.aagonzalez.clientes.domain.service;

import org.springframework.web.bind.annotation.PathVariable;
import supuesto.aagonzalez.clientes.domain.Cliente;

import java.util.List;

public interface RepresentanteService {

    public void addNewRepresentante();

    public List<Cliente> getAllRepresentantes();

    public List<Cliente> getInfoRepresentante(@PathVariable("idCliente") Long idCliente);

    public void updateRepresentante(@PathVariable("idCliente") Long idCliente);

    public void deleteRepresentante(@PathVariable("idCliente") Long idCliente);

}
