 
package br.com.cursodevideo.aula15metodo;
 
public class Aula15Metodos
{ 
    static int soma(int a, int b)
    {
        int s = a + b;
        return s;
    }
    
    static void soma(float b, float a)
    {
      float s  = a + b;
        System.out.println("s= " + s);
    }
    public static void main(String[] args)
    {
        System.out.println(soma(5,10));
        //Aula15Metodos a = new Aula15Metodos();
        soma(2.5f,5.5f);
    }
    
}
