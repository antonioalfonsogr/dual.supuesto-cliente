package supuesto.aagonzalez.clientes.repositories;

import javax.persistence.*;

@Entity
@Table(name = "representante")
public class RepresentanteEntity {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idRepresentante;

    private String nombre;

    private String telefono;

    private String idioma;

    @Column(unique = true, nullable = false)
    private long idCliente;

    // Constructores

    public RepresentanteEntity() {
    }

    public RepresentanteEntity(long idRepresentante, String nombre, String telefono, String idioma, long idCliente) {
        this.idRepresentante = idRepresentante;
        this.nombre = nombre;
        this.telefono = telefono;
        this.idioma = idioma;
        this.idCliente = idCliente;
    }

    // Getters & Setter

    public long getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(long idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    // toString

    @Override
    public String toString() {
        return "RepresentanteEntity{" +
                "idRepresentante=" + idRepresentante +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", idioma='" + idioma + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }

}
