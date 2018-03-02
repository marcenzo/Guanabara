 
package br.com.cursodevideo.aula11java;
 
import java.util.Scanner;

public class Aula11Java
{
   public static void main(String[] args) 
   {
       boolean exit = false;
       int n,  s = 0;
       String resp;
       Scanner input = new Scanner(System.in);
      
        do{
            
            System.out.print("Digite um valor: ");
            n = input.nextInt();
                s+= n;
            System.out.print("Deseja continuar? [S/N] ");
                
            resp = input.next();
        
            if(resp.equals("N"))
            {
             exit = true;
             System.out.println("O valor das somas e: " + s);
             
            }
            
        }while(!exit);
            
   }
}    


