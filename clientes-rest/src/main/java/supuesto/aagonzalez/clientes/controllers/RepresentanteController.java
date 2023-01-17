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

    private RepresentanteService representanteService;
    private ClienteService clienteService;

    @Autowired
    public RepresentanteController(RepresentanteService representanteService, ClienteService clienteService) {
        this.representanteService = representanteService;
        this.clienteService = clienteService;
    }

    @GetMapping(value = "")
    public List<Representante> obtenerRepresentantes(@PathVariable(name = "idCliente") Long idCliente) {
        return clienteService.obtenerInfoCliente(idCliente).getRepresentantes();
    }

    @PostMapping(value = "")
    public Representante insertarRepresentante(@PathVariable(name = "idCliente") Long idCliente, @RequestBody Representante representante){
        return this.representanteService.insertarRepresentante(idCliente, representante);
    }

    @GetMapping(value = "/{id}")
    public Representante obtenerInfoRepresentante(@PathVariable Long id){
        return this.representanteService.obtenerInfoRepresentante(id);
    }

    @PutMapping(value = "/{id}")
    public void actualizarRepesentante(@PathVariable Long id, @RequestBody Representante representante){
        this.representanteService.actualizarRepresentante(id, representante);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarRepresentante(@PathVariable Long id){
        this.representanteService.eliminarRepresentante(id);
    }

}
