package supuesto.aagonzalez.clientes.domain;

import lombok.Data;

@Data
public class Representante {

    private Long idRepresentante;

    private String nombre;

    private String telefono;

    private String idioma;

    private long idCliente;

}
