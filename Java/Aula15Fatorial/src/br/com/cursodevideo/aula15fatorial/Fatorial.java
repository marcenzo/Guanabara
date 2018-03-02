package br.com.cursodevideo.aula15fatorial;
 
public class Fatorial
{
   static private int num = 0;
   static private int fat = 1;
   static private String formula = " ";
    
    static public void setValor(int n)
    {
        num = n;
        int f = 1;
        String s = " ";
        
        for (int i = n; i > 1; i--)
        {
            f *= i;
            s += n + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
   static public int getFatorial()
    {
        return  fat;
    }
    
   static public String getFormula()
    {
        return formula;
    }
}
