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
public class Cobra extends Reptil
{
  @Override
    public void locomover()
    {
        System.out.println("rasteja lento");

    }

    @Override
    public void alimentar()
    {
         System.out.println("Animais da floresta");
    }

    @Override
    public void emitirSom()
    {
         System.out.println("Som de chucalho");
    }
       
}
