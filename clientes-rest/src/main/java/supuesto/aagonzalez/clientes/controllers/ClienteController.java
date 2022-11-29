package supuesto.aagonzalez.clientes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import supuesto.aagonzalez.clientes.repositories.ClienteEntity;
import supuesto.aagonzalez.clientes.services.ClienteServiceImpl;


import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteServiceImpl clienteService;
/*
    @GetMapping()
    public List<ClienteEntity> getAllCliente(){
        return clienteService.getAllClientes();
    }

    @PostMapping()
    public ClienteEntity addNewCliente(@RequestBody ClienteEntity cliente){
        return this.clienteService.addNewCliente(cliente);
    }*/
}
