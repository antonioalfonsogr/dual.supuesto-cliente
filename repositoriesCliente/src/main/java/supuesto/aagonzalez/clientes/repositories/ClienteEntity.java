package supuesto.aagonzalez.clientes.repositories;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idCliente;

    private String nombre;

    private String nif;

    private String direccion;

    private String pais;

}

