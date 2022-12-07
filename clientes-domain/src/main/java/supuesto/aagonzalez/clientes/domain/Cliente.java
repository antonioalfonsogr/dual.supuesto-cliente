package supuesto.aagonzalez.clientes.domain;

import lombok.Data;
import java.util.List;

@Data
public class Cliente {

    private Long idCliente;

    private String nombre;

    private String nif;

    private String direccion;

    private String pais;

    private List<Representante> representantes;

}
