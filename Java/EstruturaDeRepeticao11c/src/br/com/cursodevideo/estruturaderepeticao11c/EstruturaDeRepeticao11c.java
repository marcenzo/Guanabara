 
package br.com.cursodevideo.estruturaderepeticao11c;
 
public class EstruturaDeRepeticao11c
{ 
    public static void main(String[] args)
    {
      int cc = 0;
        
        while (cc < 10)
        {            
            cc++;
            
            if(cc == 2 || cc == 3)
            {
              continue;
            }
             
            if(cc == 7)
            {
              break;
            }
             System.out.println("Cambalhota [" + cc + "]");
            
        }   
    }
    
}
