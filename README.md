# U1-INPUT-dialog
Entrada (input) de datos en cuadro de diálogo: pide datos y realiza operación dos fases


![alt text](https://repository-images.githubusercontent.com/541220647/5439b559-4148-4c7d-8f83-60e7e4df2af5)


      import javax.swing.JOptionPane;  
      public class INPUTdialog { 
        public static void main(String[] args) {
          String texto;                 
          byte edad;    
          texto =JOptionPane.showInputDialog("Escribe:");
          edad=Byte.parseByte(texto);                 
     byte edad1=(byte)(edad+1);
     System.out.println("1. Edad dentro de un ano: "+edad1);
     System.out.println("2. Edad dentro de un ano: "+(edad+1));
          }
     }


![alt text]()
![alt text]()
