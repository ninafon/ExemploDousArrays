
package exemploarray2;

import javax.swing.JOptionPane; 

public class Metodos {
    
    int numElementos = pedirTam(); 
    String[]nomes= new String[numElementos];
    int []notas = new int[numElementos];       
    
 
     public void crearArrays(){       
          for (int i=0;i< nomes.length;i++){
             nomes[i]= JOptionPane.showInputDialog("nome ");
             notas[i]= Integer.parseInt(JOptionPane.showInputDialog(" nota :"));
          }    
     }     
   public void amosar(){
     /*  for(int i=0;i< nomes.length;i++)
           System.out.println("nome ["+ i+"] = "+nomes[i]+ "nota [" + i + "] = "+ notas[i]);*/
       // *******TAMEN
        String cadea = "";
         for(int i=0;i<nomes.length;i++){         
             cadea = cadea + nomes[i]+ " -->   "+ notas[i]+ "\n ";
         }
         JOptionPane.showMessageDialog(null, cadea);
   }  
   public int pedirTam(){
       return Integer.parseInt(JOptionPane.showInputDialog(" numElementos :"));
   }
   public void consultarNota(){
     String nomBus = JOptionPane.showInputDialog("nome a consultar : ");
     boolean atopado = false; // non se atopou
     for (int i=0;i< nomes.length;i++){
         if((nomes[i].compareToIgnoreCase(nomBus)== 0)){
             JOptionPane.showMessageDialog(null," nota = "+ notas[i]);
             atopado = true;
         }
     }   
     if(atopado == false)
          JOptionPane.showMessageDialog(null," esa persoa non está na lista");         
         
   }
   
   public void ordenar(){
       
       String auxNome;
       int auxNota;
       for(int i=0;i< numElementos -1;i++)
           for(int j= i+1;j<numElementos;j++){
               if((nomes[i].compareToIgnoreCase(nomes[j])>0)){
               auxNome=nomes[i];
               nomes[i]= nomes[j];
               nomes[j]= auxNome;
               auxNota=notas[i];
               notas[i]=notas[j];
               notas[j]= auxNota;
              }
           }           
   }    
    
    
}
