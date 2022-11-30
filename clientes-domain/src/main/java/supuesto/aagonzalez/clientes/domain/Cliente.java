package supuesto.aagonzalez.clientes.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Cliente {

    private Long id;

    private String nombre;

    private LocalDateTime fechaAlta;

    private List<Representante> representantes;

}
