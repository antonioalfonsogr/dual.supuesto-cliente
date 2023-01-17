package supuesto.aagonzalez.clientes.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    private ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping(value = "")
    public List<Cliente> obtenerClientes() {
        return clienteService.obtenerTodosLosClientes();
    }

    @PostMapping(value = "")
    public Cliente insertarCliente(@RequestBody Cliente cliente){
        return this.clienteService.insertarCliente(cliente);
    }

    @GetMapping(value = "/{id}")
    public Cliente obtenerInfoCliente(@PathVariable Long id){
        return this.clienteService.obtenerInfoCliente(id);
    }

    @PutMapping(value = "/{id}")
    public void actualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        this.clienteService.actualizarCliente(id, cliente);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarCliente(@PathVariable Long id){
        this.clienteService.eliminarCliente(id);
    }
}
