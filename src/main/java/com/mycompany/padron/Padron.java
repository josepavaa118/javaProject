/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padron;
import Classes.FileReader;
import Classes.FileChooser;
import Classes.Votos;
import java.io.IOException;

/**
 *
 * @author josep
 */
public class Padron {

    public static void main(String[] args) throws IOException {
        String padronData="";
        String partidosData="";
        FileChooser fc= new FileChooser();
        String padronPath=fc.getFilePath();
        String partidosPath=fc.getFilePath();
        FileReader fr= new FileReader(padronPath,partidosPath);
        fr.dataLoad();
        padronData=fr.getFileData();
        partidosData=fr.getPartidosData();
        Votos votos= new Votos(padronData,partidosData);
        votos.generarVotacion();
    }
}
