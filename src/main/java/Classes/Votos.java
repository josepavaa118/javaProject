/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static java.lang.System.console;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Votos {
    String padronData="";
    String partidosData="";
    String [][] padron;
    String[][] partidos;
    
    public Votos(String contenidoPadron,String contenidoPartidos){
        this.padronData=contenidoPadron;
        this.partidosData=contenidoPartidos;
    }
    
    public void generarVotacion(){
        convertirArray();
    }
    
    private void convertirArray(){
        String[] lines = padronData.split("\\r?\\n|\\r");
        String[] spliited=lines[0].split(",");
        }
    }
    

