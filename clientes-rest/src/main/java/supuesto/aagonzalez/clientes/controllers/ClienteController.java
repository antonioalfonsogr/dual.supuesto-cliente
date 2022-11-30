package supuesto.aagonzalez.clientes.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping(produces = "application/json", path = "/clientes")
    public List<Cliente> obtener() {
        return clienteService.obtenerTodosLosClientes();
    }

}
