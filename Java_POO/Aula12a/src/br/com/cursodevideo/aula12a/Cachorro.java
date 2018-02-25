/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.aula12a;

/**
 *
 * @author Apple
 */
public class Cachorro extends Mamifero
{
    public void enterrarOsso()
    {
        System.out.println("Cao esconde osso");

    }
    
    public void abanarRabo()
    {
         System.out.println("Cao abanando rabo");

    }
     @Override
     public void locomover()
    {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Racao");

    }

    @Override
    public void emitirSom()
    {
        System.out.println("au Au");

    }
    
}
