package boletin22;

import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos22 obx = new Metodos22();
        int opcion;
        do{
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("OPCIONES: \n 1. Añadir palabra. \n 2. Ordenar \n 3. Imprimir en fichero \n 4. Salir"));
            
            switch(opcion){
                case 1 : obx.engadirPalabra();
                    break;
                case 2 : obx.ordenar();
                    break;
                case 3 : obx.escribir();
                    break;
                
            }
        }while(opcion<4);
    }
    
}
