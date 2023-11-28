/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intermedio;

import Classes.FileChooser;
import Classes.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Menu {
    
    public void menuInicio() throws IOException{
       int seleccion=0;
       while (seleccion<4) {
         do{   
         seleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Select any of the following options:"+"\n"+
                 "1- Iniciar Votaciones"+"\n"+
                 "2- Realizar Consultas"+"\n"+
                 "3- Imprimir Resultados de Votacion"+"\n"+
                 "4- Salir"));
         }while (seleccion>4);
         switch (seleccion){
             case 1:
                 FileChooser seleccionArchivos=new FileChooser();
                 JOptionPane.showMessageDialog(null,"Elija el archivo que contenga el padrón electoral");
                 String archivoPadron= seleccionArchivos.getFilePath();
                 JOptionPane.showMessageDialog(null,"Elija el archivo que contenga los datos de los partidos");
                 String archivoPartidos=seleccionArchivos.getFilePath();
                 FileReader lectorArchivos= new FileReader(archivoPadron, archivoPartidos);
                 lectorArchivos.dataLoad();
                 break;
                 
             case 2:
                 
             case 3:
                
             case 4:
                 JOptionPane.showMessageDialog(null, "Thanks for using our system");
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Invalid Option, Try again");                
         }
        
        }
    }
}
