/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.aula12a;
 
public class Peixe extends Animal
{
    private String corEscama;
    
    public void soltarBolhas()
    {
         System.out.println("Peixe soltando bolhas");
    }

    public String getCorEscama()
    {
        return corEscama;
    }

    public void setCorEscama(String corEscama)
    {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover()
    {
         System.out.println("Nadando");
    }

    @Override
    public void alimentar()
    {
         System.out.println("Come substancias do mar");
    }

    @Override
    public void emitirSom()
    {
         System.out.println("Peixe nao faz som");
    }
    
}
