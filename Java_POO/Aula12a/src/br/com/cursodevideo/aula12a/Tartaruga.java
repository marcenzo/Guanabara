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
public class Tartaruga extends Reptil
{
    @Override
    public void locomover()
    {
         System.out.println("Anda devagar");

    }
     
    @Override
    public void alimentar()
    {
         System.out.println("Plantas e frutas");
    }

    @Override
    public void emitirSom()
    {
         System.out.println("Som da lingua");
    }
    
}
