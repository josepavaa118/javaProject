/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padron;
import Classes.FileReader;
import Classes.FileChooser;
import Classes.ArrayCreator;
import Classes.Votos;
import Intermedio.Menu;
import java.io.IOException;
import java.text.ParseException;


/**
 *
 * @author josep
 */
public class Padron {

    public static void main(String[] args) throws IOException, ParseException {
        Menu menu=new Menu();
        menu.menuInicio();
        //Working Main
       /* String padronData="";
        String partidosData="";
        short filasPadron=0;
        short columnasPadron=0;
        short filasPartidos=0;
        short columnasPartidos=0;
        FileChooser fc= new FileChooser();
        String padronPath=fc.getFilePath();
        String partidosPath=fc.getFilePath();
        FileReader fr= new FileReader(padronPath,partidosPath);
        fr.dataLoad();
        padronData=fr.getFileData();
        partidosData=fr.getPartidosData();
        ArrayCreator arrays= new ArrayCreator(padronData,partidosData);
        arrays.crearArrays();
        filasPartidos=arrays.getFilasPartidos();
        columnasPartidos=arrays.getColumnasPartidos();
        filasPadron=arrays.getFilasPadron();
        columnasPadron=arrays.getColumnasPadron();
        Votos votos=new Votos(filasPadron,columnasPadron,filasPartidos,columnasPartidos,padronData,partidosData);
        votos.Votaciones();
        */
    }
}
