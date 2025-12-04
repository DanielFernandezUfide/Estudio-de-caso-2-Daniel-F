/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.caso.pkg2.daniel.f;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Avion {

    private String nombreVuelo;
    private Asiento[][] asientos;
    private Pasajero pasajero;

    public Avion(String nombreVuelo, int cantidadFilas, int cantidadAsientos) {
        this.nombreVuelo = nombreVuelo;
        this.asientos = new Asiento[cantidadFilas][cantidadAsientos];

    }

    public void LlenarAsientos(int cantidadFilas, int cantidadAsientos) {
        String abecedario = "ABCDEFGHIJKMNLOPQRSTUVWXYZ";
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadAsientos; j++) {

                String identificador = "";
                int numero = j + 1;
                identificador += abecedario.charAt(j);
                identificador += numero;
                asientos[i][j] = new Asiento(identificador, 500, ClaseAsiento.PrimeraClase, Estado.Vacante);
            }
        }
        for (int i = 0; i < cantidadFilas; i++) {
            if (i == 1) {
                for (int j = 0; j < cantidadAsientos; j++) {
                    asientos[i][j].setClase(ClaseAsiento.Business);
                    asientos[i][j].setPrecio(300);
                }
            }
            if (i == 2) {
                for (int j = 0; j < cantidadAsientos; j++) {
                    asientos[i][j].setClase(ClaseAsiento.PrimeraClase);
                    asientos[i][j].setPrecio(100);
                }

            }
        }
    }

    /**
     *
     * @param cantidadFilas
     * @param cantidadAsientos
     */
    public void MostrarAvion(int cantidadFilas, int cantidadAsientos) {
        String abecedario = "ABCDEFGHIJKMNLOPQRSTUVWXYZ";
        String mapa = "Vuelo " + nombreVuelo + "   ";
        for (int i = 0; i < cantidadAsientos; i++) {
            mapa += "Asiento " + abecedario.charAt(i) + "   ";
        }

        for (int i = 0; i < cantidadFilas; i++) {
            mapa += "\n";
            mapa += "Fila " + i + 1 + "                ";
            for (int j = 0; j < cantidadAsientos; j++) {
                mapa += asientos[i][j].getIdentificador() + "                ";

            }
            mapa += "\n";
            for (int j = 0; j < cantidadAsientos; j++) {
                mapa += "                " + asientos[i][j].getEstado() + "   ";
            }

            mapa += "\n";
            for (int j = 0; j < cantidadAsientos; j++) {
                mapa += "                " + asientos[i][j].getClase() + "   ";
            }

            mapa += "\n";
            for (int j = 0; j < cantidadAsientos; j++) {
                mapa += "                " + asientos[i][j].getPrecio() + "   ";
            }

            mapa += "\n";
            mapa += "----------------------------------------------------------------------";

        }
        JOptionPane.showMessageDialog(null, mapa);
    }
    
    public void Reservar (String nombre, int pasaporte, String nacionalidad, int cantidadFilas, int cantidadAsientos){
        this.pasajero = new Pasajero(nombre, pasaporte, nacionalidad);
        String reserva = JOptionPane.showInputDialog("Ingrese el asiento que desea reservar");
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadAsientos; j++) {
                if (reserva.equals(asientos[i][j].getIdentificador())){
                    asientos[i][j].setEstado(Estado.Ocupado);
                    pasajero.setAsientoAsignado(asientos[i][j].getIdentificador());
                }
            }
            
        }
        
        
    }
    
}

