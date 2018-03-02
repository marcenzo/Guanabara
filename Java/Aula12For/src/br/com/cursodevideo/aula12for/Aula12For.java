 
package br.com.cursodevideo.aula12for;
 public class Aula12For
{ 
    public static void main(String[] args)
    {
        int i;
        for (i = 0;  i < 10; i++)
        {
            
           if(i == 3 || i == 5)
           {
           //break;
             continue;
             
           }
           
            if(i == 6 || i == 8)
           {
                break;
             //continue;
             
           }
            System.out.println("Cambalhota [" + i + "]");
        }
    }
    
}
 