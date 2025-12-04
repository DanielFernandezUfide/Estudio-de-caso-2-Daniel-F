/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg2.daniel.f;

/**
 *
 * @author Laboratorio
 */
public class Pasajero {
    private String nombreCompleto;
    private int pasaporte;
    private String nacionalidad;
    private String asientoAsignado;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAsientoAsignado() {
        return asientoAsignado;
    }

    public void setAsientoAsignado(String asientoAsignado) {
        this.asientoAsignado = asientoAsignado;
    }
    
    

    public Pasajero(String nombreCompleto, int pasaporte, String nacionalidad) {
        this.nombreCompleto = nombreCompleto;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombreCompleto=" + nombreCompleto + ", pasaporte=" + pasaporte + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
}
