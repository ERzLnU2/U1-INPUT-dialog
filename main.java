package daw120.inputdialog;
import javax.swing.JOptionPane;  // el import aqui entre paquete y la clase
public class INPUTdialog {
      
  public static void main(String[] args) {
    String texto;  // definir variable tipo string (asume todo) ,
                   // para almacenar los datos recogidos por la caja de texto
    byte edad;     // definir variable, tipo byte
    
    // ENTRADA:
    texto =JOptionPane.showInputDialog("🚀 Escribe tu edad: "); // escojer el metodo. de la clase, 
                                                                // que es un texto...
    edad=Byte.parseByte(texto); // para pasar texto a otro tipo, ejemplo en bytes: uso del 
                                // metodo.parseByte y se podra insertar
    
    // SALIDA:
     System.out.println("\n\t - Tu edad actual: "+edad+" anos..\n");  
    
// dos maneras de operar la suma, antes y en la salida:
byte edad1=(byte)(edad+1); // aqui tipo de dato, variable y asignación de operación con CASTing
System.out.println("\t1. Edad dentro de un ano: "+edad1); // saca la variable anterior, ya sumada.
System.out.println("\t2. Edad dentro de un ano: "+(edad+1)); // este saca la operación cuando sale.
    }
}
