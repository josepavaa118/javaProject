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
public class ArrayCreator {
    String padronData="";
    String partidosData="";
    short filasPadron=0;
    short columnasPadron=0;
    short filasPartidos=0;
    String[] padronLineas;
    String[] padronColumnas;
    String[] partidosLineas;
    String[] partidosColumnas;
    String[][] padron;
    String[][] partidos;


    public String[][] getPadron() {
        return padron;
    }

    public void setPadron(String[][] padron) {
        this.padron = padron;
    }

    public String[] getPartidosLineas() {
        return partidosLineas;
    }

    public void setPartidosLineas(String[] partidosLineas) {
        this.partidosLineas = partidosLineas;
    }

    public String[] getPartidosColumnas() {
        return partidosColumnas;
    }

    public void setPartidosColumnas(String[] partidosColumnas) {
        this.partidosColumnas = partidosColumnas;
    }

    public String[] getPadronLineas() {
        return padronLineas;
    }

    public void setPadronLineas(String[] padronLineas) {
        this.padronLineas = padronLineas;
    }

    public String[] getPadronColumnas() {
        return padronColumnas;
    }

    public void setPadronColumnas(String[] padronColumnas) {
        this.padronColumnas = padronColumnas;
    }

    public short getFilasPartidos() {
        return filasPartidos;
    }

    public void setFilasPartidos(short filasPartidos) {
        this.filasPartidos = filasPartidos;
    }
    short columnasPartidos=0;

    public short getFilasPadron() {
        return filasPadron;
    }

    public void setFilasPadron(short filasPadron) {
        this.filasPadron = filasPadron;
    }

    public short getColumnasPadron() {
        return columnasPadron;
    }

    public void setColumnasPadron(short columnasPadron) {
        this.columnasPadron = columnasPadron;
    }

    public short getColumnasPartidos() {
        return columnasPartidos;
    }

    public void setColumnasPartidos(short columnasPartidos) {
        this.columnasPartidos = columnasPartidos;
    }
    
    public ArrayCreator(String contenidoPadron,String contenidoPartidos){
        this.padronData=contenidoPadron;
        this.partidosData=contenidoPartidos;
    }
    
    public void crearArrays(){
        ArraySize(padronData,"padron");
        ArraySize(partidosData, "partidos");
        //dataPrint();
        padronArray();
    }
    
    private void ArraySize(String data,String contenido){//This method grabs the data from previous files, and defines how many rows/columns will be needed for both Padron/Partidos Array
        short numeroFilas=0;
        short numeroColumnas=0;
        String[] filas = data.split("\\r?\\n|\\r");//splits lines into arrays
        String[] columnas=filas[0].split(",");//splits array into columns
        numeroFilas=(short) (filas.length);
        numeroColumnas=(short)(columnas.length+1);
        if(contenido.equals("padron")){
            setColumnasPadron(numeroColumnas);
            setFilasPadron(numeroFilas);
            setPadronLineas(filas);
            setPadronColumnas(columnas);
        }
        else{
            setColumnasPartidos(numeroColumnas);
            setFilasPartidos(numeroFilas);
            setPartidosColumnas(columnas);
            setPartidosLineas(filas);
        
        }
        
        
    }
    private String[][] padronArray(){
        padron= new String [filasPadron][columnasPadron];
        String[] filas = padronData.split("\\r?\\n|\\r");//splits lines into arrays
        for (int x=0;x<=filas.length-1;x++ ){
            String[] columnas=filas[x].split(",");//splits array into columns
            for (int y=0;y<=columnas.length-1;y++ ){
                padron[x][y]=columnas[y];
            }
        }
       
        setPadron(padron);
        return getPadron();
    }
    
    private void dataPrint(){
        JOptionPane.showMessageDialog(null, "Filas del Padron:"+ getFilasPadron());
        JOptionPane.showMessageDialog(null, "Columnas del Padron:"+ getColumnasPadron());
        JOptionPane.showMessageDialog(null, "Filas del Partido:"+ getFilasPartidos());
        JOptionPane.showMessageDialog(null, "Columnas del Partido:"+ getColumnasPartidos());
    }
    }
    

