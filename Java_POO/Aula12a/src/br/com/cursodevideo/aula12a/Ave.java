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
public class Ave extends Animal
{
    private String corPena;
    
    public void fazerNinho()
    {
      System.out.println("Ave constroi ninho");   
    }

    public String getCorPena()
    {
        return corPena;
    }

    public void setCorPena(String corPena)
    {
        this.corPena = corPena;
    }

    @Override
    public void locomover()
    {
         System.out.println("Voando");
    }

    @Override
    public void alimentar()
    {
         System.out.println("Frutas, vegetais e substancias da natureza");
    }

    @Override
    public void emitirSom()
    {
         System.out.println("Som de ave");
    }
    
    
}
