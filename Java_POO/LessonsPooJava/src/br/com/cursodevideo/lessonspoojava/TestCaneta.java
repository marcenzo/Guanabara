 
package br.com.cursodevideo.lessonspoojava;
 
public class TestCaneta
{ 
    public static void main(String[] args)
    {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.carga = 50;
        //c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
