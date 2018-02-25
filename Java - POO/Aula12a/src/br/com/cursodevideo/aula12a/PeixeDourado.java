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
public class PeixeDourado extends Peixe
{    
    @Override
    public void locomover()
    {
         System.out.println("Nadando rapido");
    }

    @Override
    public void alimentar()
    {
         System.out.println("Comendo substancias pequenas do mar");
    }

    @Override
    public void emitirSom()
    {
         System.out.println("Peixe nao faz som");
    }
    
    @Override
    public void soltarBolhas()
    {
         System.out.println("Peixe soltando bolhinhas");
    }
}