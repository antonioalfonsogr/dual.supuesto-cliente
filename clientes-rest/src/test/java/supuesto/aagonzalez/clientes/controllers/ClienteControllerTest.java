package supuesto.aagonzalez.clientes.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import supuesto.aagonzalez.clientes.domain.Cliente;
import supuesto.aagonzalez.clientes.domain.service.ClienteService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//@WebMvcTest(ClienteController.class)
class ClienteControllerTest {

/*
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClienteService clienteService;

    @Autowired
    private ObjectMapper objectMapper;
*/



    @Test
    void obtenerClientes() throws Exception {
        System.out.println("Test obtener clientes");

/*
        Cliente cliente1 = new Cliente();
        cliente1.setIdCliente(1L);
        cliente1.setNombre("Pepe");
        cliente1.setNif("12344321W");
        cliente1.setDireccion("Calle Ancha");
        cliente1.setPais("España");

        Cliente cliente2 = new Cliente();
        cliente2.setIdCliente(2L);
        cliente2.setNombre("AnaAna");
        cliente2.setNif("56788765E");
        cliente2.setDireccion("Calle Alfareros");
        cliente2.setPais("España");

        Cliente cliente3 = new Cliente();
        cliente3.setIdCliente(3L);
        cliente3.setNombre("Juan");
        cliente3.setNif("34566543R");
        cliente3.setDireccion("Calle Rivera");
        cliente3.setPais("España");

        List<Cliente> clienteList = new ArrayList<>(Arrays.asList(cliente1, cliente2, cliente3));

        Mockito.when(clienteService.obtenerClientes()).thenReturn(clienteList);

        mockMvc.perform(MockMvcRequestBuilders
                .get("clientes")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[2].nombre", is("Juan")));
*/

    }

    @Test
    void insertarCliente() {
        System.out.println("Test insertar clientes");

/*

        final StringBuilder path = new StringBuilder("/films");
        boolean error = false;
        try {
            mockMvc.perform(post(path.toString())
                    .content("{\"title\": \"Conan\"," + "\"type\": \"OLD\"," + "\"rate\": \"BASIC\"" + "}")
                    .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated()).andReturn();
        } catch (final Exception ex) {
            error = true;
        }
        assertFalse(error);
        List<Cliente> list = null;
        try {
            final MvcResult result = mockMvc.perform(get(path.toString())).andExpect(status().isOk()).andReturn();
            list = objectMapper.readValue(result.getResponse().getContentAsString(), new TypeReference<List<Cliente>>() {});
        } catch (final Exception ex) {
            error = true;
        }
        assertFalse(error);
        assertNotNull(list);
        assertEquals(5, list.size());
*/

    }

    @Test
    void obtenerCliente() {
        System.out.println("Test obtener cliente");

        Cliente cliente1 = new Cliente();
        cliente1.setIdCliente(1L);
        cliente1.setNombre("Pepe");
        cliente1.setNif("12344321W");
        cliente1.setDireccion("Calle Ancha");
        cliente1.setPais("España");

    }

    @Test
    void eliminarCliente() {
        System.out.println("Test eliminar cliente");
    }
}