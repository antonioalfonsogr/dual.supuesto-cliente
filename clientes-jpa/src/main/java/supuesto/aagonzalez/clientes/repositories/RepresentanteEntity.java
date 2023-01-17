package supuesto.aagonzalez.clientes.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "representante")
public class RepresentanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idRepresentante;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "idioma")
    private String idioma;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = ClienteEntity.class)
    @JoinColumn(nullable = false, name = "id_cliente")
    private ClienteEntity cliente;


}
