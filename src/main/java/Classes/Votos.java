/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Votos {
    String[][] padron;
    String[][] partidos;

    public Votos(String [][]datosPadron, String [][]datosPartidos) {
        this.padron=datosPadron;
        this.partidos=datosPartidos;
    }
    
    public void Votaciones() throws ParseException{
        generarVotos();
        JOptionPane.showMessageDialog(null, "Votaciones cerradas!");
    }
    
    private void generarVotos() throws ParseException{
        for (int x=0;x<=padron.length-1;x++){
            String fechaExp=padron[x][3];
            LocalDate cedulaExp=convertirFecha(fechaExp);
            if (puedeVotar(cedulaExp)){
                padron[x][8]=obtenerVoto();
            }
            else{
                padron[x][8]="0";
            } 
        }
    }
    
    private LocalDate convertirFecha(String fechaExp) throws ParseException{
        LocalDate today = LocalDate.now();
        SimpleDateFormat formato= new SimpleDateFormat("yyyyMMdd");
        Date fecha=formato.parse(fechaExp);
        LocalDate fechaCedula=fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return fechaCedula; 
    }
    private LocalDate obtenerFechaActual(){
        LocalDate today = LocalDate.now();
        return today;
    }
    
    private boolean puedeVotar(LocalDate fechaExp){
        if(fechaExp.isAfter(obtenerFechaActual())){
            return true;
        }
        else{
            return false;
        }
    }
    
    private String obtenerVoto(){
        Random rand=new Random();
        int partidoRandom=rand.nextInt(1, partidos.length);
        String voto=partidos[partidoRandom][0].toString(); 
        return voto;
    }
    
    private void asignarVotos(){
        
    }
}
