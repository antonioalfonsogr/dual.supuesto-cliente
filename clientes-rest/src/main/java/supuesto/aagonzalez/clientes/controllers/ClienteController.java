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

    @PostMapping()
    public Cliente insertarCliente(@RequestBody Cliente cliente){
        return this.clienteService.insertarCliente(cliente);
    }
}
