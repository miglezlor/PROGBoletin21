package boletin22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos22 {
    
    ArrayList <String> lista = new ArrayList();
    
    public void engadirPalabra (){
            String palabra=JOptionPane.showInputDialog("Introduce palabra");
            lista.add(palabra);
    }
    
    public void ordenar(){
            Collections.sort(lista);
    }
    
    public void escribir(){
        String nomeFich = JOptionPane.showInputDialog("Nombre del archivo: ");
        File f = new File(nomeFich+".txt");
        PrintWriter escribir=null;
        try {
            
            escribir = new PrintWriter(f);
            for(int i=0;i<lista.size();i++){
                
                escribir.println(i+" "+lista.get(i));
            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Erro escritura "+ex.getMessage());
        }
        finally{
            escribir.close();
        }
    } 
    
    
}
