
package exemploarray2;

import javax.swing.JOptionPane;

public class ExemploArray2 {    
    
    
    public static void main(String[] args) {
        Metodos alum= new Metodos();
        int op;       do{
          op =Integer.parseInt(JOptionPane.showInputDialog("****  MENU *****\n 1--> crear array \n 2--> amosar \n 3--> consultar \n 4--> ordenar \n 5--> Sair \n ESCOLLE OPCION :"));
         switch(op){
             case 1 : alum.crearArrays();
                      break;
             case 2 : alum.amosar();
                      break;
             case 3 : alum.consultarNota();
                      break;
             case 4 : alum.ordenar();
                      break;
             case 5 : System.exit(0);
          }  
       }while(op <5);   
           
                    
       }
       
}
