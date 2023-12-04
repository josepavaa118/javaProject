/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Consultas {
    String[][] padronCompleto;
    String[][] partidosCompleto;
    
    public Consultas (String[][] padron, String[][] partidos){
        this.padronCompleto=padron;
        this.partidosCompleto=partidos;
    }
    
    public void consultasNombre(String nombre){
        String datos="";
        String nombreFormato=nombre.toUpperCase();
        for (int x=0;x<=padronCompleto.length-1;x++){
            if (padronCompleto[x][5].contains(nombreFormato)){
                datos=datos+"\n"+"La Persona "+padronCompleto[x][5]+" ha votado por el Partido: "+padronCompleto[x][8]+"\n";
            }
        }
        if(datos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lo sentimos. No hay registro de votos con el nombre dado"); 
        }
        else{
            JOptionPane.showMessageDialog(null, datos);
        }
    }
    
    public void consultasApellido1(String apellido){
        String datos="";
        String apellidoFormato=apellido.toUpperCase();
        for (int x=0;x<=padronCompleto.length-1;x++){
            if (padronCompleto[x][6].contains(apellidoFormato)){
                datos=datos+"\n"+"La Persona "+padronCompleto[x][5]+padronCompleto[x][6]+" ha votado por el Partido: "+padronCompleto[x][8]+"\n";
            }
        }
        if(datos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lo sentimos. No hay registro de votos con el nombre dado"); 
        }
        else{
            JOptionPane.showMessageDialog(null, datos);
        }
    }
    
        public void consultasApellido2(String apellido){
        String datos="";
        String apellidoFormato=apellido.toUpperCase();
        for (int x=0;x<=padronCompleto.length-1;x++){
            if (padronCompleto[x][7].contains(apellidoFormato)){
                datos=datos+"\n"+"La Persona "+padronCompleto[x][5]+padronCompleto[x][6]+ padronCompleto[x][7]+" ha votado por el Partido: "+padronCompleto[x][8]+"\n";
            }
        }
        if(datos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lo sentimos. No hay registro de votos con el nombre dado"); 
        }
        else{
            JOptionPane.showMessageDialog(null, datos);
        }
    }
    
}
