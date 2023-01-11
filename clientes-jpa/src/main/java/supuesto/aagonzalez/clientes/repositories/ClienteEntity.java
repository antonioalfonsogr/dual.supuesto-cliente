package supuesto.aagonzalez.clientes.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import supuesto.aagonzalez.clientes.domain.Representante;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
@EqualsAndHashCode()
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_cliente", unique = true, nullable = false)
    private Long idCliente;
    @Column(name ="nombre")
    private String nombre;
    @Column(name ="nif")
    private String nif;
    @Column(name ="direccion")
    private String direccion;
    @Column(name ="pais")
    private String pais;

    @OneToMany (mappedBy = "cliente", fetch = FetchType.LAZY, targetEntity = RepresentanteEntity.class)
    private List<RepresentanteEntity> representantes;
}
