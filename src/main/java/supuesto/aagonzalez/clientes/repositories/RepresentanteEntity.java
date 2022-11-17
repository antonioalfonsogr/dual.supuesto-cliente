package supuesto.aagonzalez.clientes.repositories;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "representante")
public class RepresentanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idRepresentante;

    private String nombre;

    private String telefono;

    private String idioma;

    @Column(unique = true, nullable = false)
    private long idCliente;

}
