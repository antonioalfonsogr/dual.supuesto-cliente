package supuesto.aagonzalez.clientes.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.service.ClienteService;

import java.util.List;

@RestController
public class ClienteController {

    private ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping(value = "/")
    public String holaMundo(){
        return "Hola Mundo, Esta es la API del supuesto practico dual.";
    }

    @GetMapping(value = "/clientes")
    public List<Cliente> obtenerClientes() {
        return clienteService.obtenerTodosLosClientes();
    }

    @PostMapping(value = "/clientes")
    public Cliente insertarCliente(@RequestBody Cliente cliente){
        return this.clienteService.insertarCliente(cliente);
    }

    @GetMapping(value = "/clientes/{id}")
    public Cliente obtenerInfoCliente(@PathVariable Long id){
        return this.clienteService.obtenerInfoCliente(id);
    }

    @PutMapping(value = "/clientes/{id}")
    public void actualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        this.clienteService.actualizarCliente(id);
        this.clienteService.insertarCliente(cliente);
    }

    @DeleteMapping(value = "/clientes/{id}")
    public void eliminarCliente(@PathVariable Long id){
        this.clienteService.eliminarCliente(id);
    }
}
