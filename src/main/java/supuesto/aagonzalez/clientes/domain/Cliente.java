package supuesto.aagonzalez.clientes.domain;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class Cliente {

    @NonNull
    private Long idCliente;

    private String nombre;

    private String nif;

    private String direccion;

    private String pais;
}
