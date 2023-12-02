/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author josep
 */
public class Votos {
    String[][] Padron;
    String[][] Partidos;

    public Votos(String [][]datosPadron, String [][]datosPartidos) {
        this.Padron=datosPadron;
        this.Partidos=datosPartidos;
    }
    
    public void Votaciones(){
        generarVotos();
    }
    
    private void votosPersona(){
       
    }
    private void generarVotos(){
        LocalDate fecha=obtenerFechaActual();
    }
    
    /*private boolean puedeVotar(Date expiracion){
        Date fechaActual=obtenerFechaActual();
        if (expiracion.after())
    }*/
    private LocalDate obtenerFechaActual(){
        LocalDate today = LocalDate.now();
        return today;
    }
    
}
