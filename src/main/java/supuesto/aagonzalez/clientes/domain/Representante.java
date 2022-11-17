package supuesto.aagonzalez.clientes.domain;

import org.springframework.lang.NonNull;

public class Representante {

    // Atributos

    @NonNull
    private Long idRepresentante;

    private String nombre;

    private String telefono;

    private String idioma;

    @NonNull
    private long idCliente;

    // Constructores

    public Representante() {
    }

    public Representante(long idRepresentante, String nombre, String telefono, String idioma, long idCliente) {
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
        return "Representante{" +
                "idRepresentante=" + idRepresentante +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", idioma='" + idioma + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
