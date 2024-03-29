package supuesto.aagonzalez.clientes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import supuesto.aagonzalez.clientes.domain.Representante;
import supuesto.aagonzalez.clientes.domain.service.ClienteService;
import supuesto.aagonzalez.clientes.domain.service.RepresentanteService;


import java.util.List;

@RestController
@RequestMapping("/clientes/{idCliente}/representantes")
public class RepresentanteController {

    private final RepresentanteService representanteService;
    private final ClienteService clienteService;

    @Autowired
    public RepresentanteController(RepresentanteService representanteService, ClienteService clienteService) {
        this.representanteService = representanteService;
        this.clienteService = clienteService;
    }

    @GetMapping(value = "")
    public List<Representante> obtenerRepresentantes(@PathVariable(name = "idCliente") Long idCliente) {
        return clienteService.obtenerCliente(idCliente).getRepresentantes();
    }

    @PostMapping(value = "")
    public Representante insertarRepresentantes(@PathVariable(name = "idCliente") Long idCliente, @RequestBody Representante representante) {
        return this.representanteService.insertarRepresentante(idCliente, representante);
    }

    @GetMapping(value = "/{id}")
    public Representante obtenerRepresentante(@PathVariable(name = "id") String id) {
        return this.representanteService.obtenerRepresentante(Long.valueOf(id));
    }

    @PutMapping(value = "/{id}")
    public void actualizarRepesentante(@PathVariable(name = "id") Long id, @RequestBody Representante representante) {
        this.representanteService.actualizarRepresentante(id, representante);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarRepresentante(@PathVariable(name = "id") Long id) {
        this.representanteService.eliminarRepresentante(id);
    }

}
