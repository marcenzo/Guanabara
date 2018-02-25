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
public class Canguru extends Mamifero
{
    public void usarBolsa()
    {
        System.out.println("Usando bolsa");
    }
    
    @Override
    public void locomover()
    {
        System.out.println("Saltando");
    }
    
    @Override
    public void alimentar()
    {
        System.out.println("Mamando na bolsa");

    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de canguru");

    }
    
}
