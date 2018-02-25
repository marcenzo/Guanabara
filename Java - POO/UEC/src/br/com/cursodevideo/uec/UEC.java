package br.com.cursodevideo.uec;
 
public class UEC
{
    public static void main(String[] args)
    {
        Lutador lutador [] = new Lutador[4];
        lutador[0] = new Lutador("Marcio   ", "Brasil   ", 39, 1.74f, 70, 10, 1, 2);
        lutador[1] = new Lutador("Enzo     ", "Brasil   ",  5, 1.10f, 60,  1, 0, 0);
        lutador[2] = new Lutador("Maisa    ", "Portugal ", 40, 1.50f, 60, 15, 2, 3);
        lutador[3] = new Lutador("Marcenzo ", "Eua      ", 39, 1.80f, 90, 25, 5, 5);
          
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutador[1], lutador[2]);
        UEC01.lutar();
       lutador[1].status();
       lutador[2].status();

        

     }
    
}
