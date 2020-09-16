/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivotxt;

import java.io.*;

/**
 *
 * @author Notebook
 */
public class ArchivoTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        System.out.println("Iniciando escritura...");
        // Cargar el archivo o crearlo PONER LA RUTA DE SUS EQUIPOS 
         File f = new File("C:\\Users/Notebook/Desktop/ArchivoLEER/numeros.txt");
        
        try{
            
            // fw -> Crear el flujo hacia f
            FileWriter fw = new FileWriter(f);
            // pw -> permite la escritura en el archivo 
            PrintWriter pw = new PrintWriter(fw);
            
            for(int i = 1 ; i<= 100 ; i++){
                pw.println(i); // Se introduce el valor de i en el archivo
            }
            
             fw.close();
             System.out.println("Terminado...");
            
        }
        catch(IOException e){
            System.out.println("error");
            System.out.println(e);
        }
        
        
    }
    
}
