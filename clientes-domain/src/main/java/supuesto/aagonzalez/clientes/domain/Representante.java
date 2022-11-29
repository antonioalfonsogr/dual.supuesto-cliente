package supuesto.aagonzalez.clientes.domain;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class Representante {

    @NonNull
    private Long idRepresentante;

    private String nombre;

    private String telefono;

    private String idioma;

    @NonNull
    private long idCliente;

}
