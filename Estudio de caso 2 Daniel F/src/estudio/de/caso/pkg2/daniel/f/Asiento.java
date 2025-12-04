/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg2.daniel.f;

/**
 *
 * @author Laboratorio
 */
public class Asiento {
    private String identificador;
    private int precio;
    private ClaseAsiento clase;
    private Estado estado;

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ClaseAsiento getClase() {
        return clase;
    }

    public void setClase(ClaseAsiento clase) {
        this.clase = clase;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Asiento(String identificador, int precio, ClaseAsiento clase, Estado estado) {
        this.identificador = identificador;
        this.precio = precio;
        this.clase = clase;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "identificador=" + identificador + ", precio=" + precio + ", clase=" + clase + ", estado=" + estado + '}';
    }
    
    
}
