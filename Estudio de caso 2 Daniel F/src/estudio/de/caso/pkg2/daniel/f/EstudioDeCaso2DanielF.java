/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.de.caso.pkg2.daniel.f;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class EstudioDeCaso2DanielF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu();
    }
    
    public static void Menu (){
        while (true) {
            int cantidadFilas = 3;
        int cantidadAsientos = 4;
        Avion avion = new Avion("CR-909",cantidadFilas,cantidadAsientos);
        avion.LlenarAsientos(cantidadFilas, cantidadAsientos);
        
        String menu = "==========Sistema de reserva de asientos para vuelos==========";
        menu += "\n";
        menu += "Seleccione una de las siguientes opciones";
        menu += "\n";
        menu += "1- Ver Mapa del avión";
        menu += "\n";
        menu += "2- Reservar asiento";
        menu += "\n";
        menu += "3- Reservar asiento con descuento";
        menu += "\n";
        menu += "4- Consultar pasajero por asiento";
        menu += "\n";
        menu += "5- Ver Resumen del vuelo";
        menu += "\n";
        menu += "6- salir";
        
        
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (seleccion) {
            case 1:
                avion.MostrarAvion(cantidadFilas, cantidadAsientos);
                break;
            case 2:
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del pasajero");
                int pasaporte = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pasaporte"));
                String nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad del pasajero");
                avion.Reservar(nombre, pasaporte, nacionalidad, cantidadFilas, cantidadAsientos);
            default:
                
        }
        
        
        
        }
        
    }
    
     
     public static void ReservaDescuento (){
        
    }
     
     public static void ConsultaPasajero (){
        
    }
    
    public static void Resumen (){
        
    }
   
}
