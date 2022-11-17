package supuesto.aagonzalez.clientes.repositories;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteEnity {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idCliente;

    private String nombre;

    private String nif;

    private String direccion;

    private String pais;

    // Constructores

    public ClienteEnity() {
    }

    public ClienteEnity(long idCliente, String nombre, String nif, String direccion, String pais) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.nif = nif;
        this.direccion = direccion;
        this.pais = pais;
    }

    // Getters & Setters

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // toString

    @Override
    public String toString() {
        return "ClienteEntity{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", nif='" + nif + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

}
