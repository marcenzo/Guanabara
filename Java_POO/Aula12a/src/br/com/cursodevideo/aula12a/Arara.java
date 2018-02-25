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
public class Arara extends Ave
{
    @Override
    public void locomover()
    {
         System.out.println("Voando baixo");
    }

    @Override
    public void alimentar()
    {
         System.out.println("Vegetais e racao");
    }

    @Override
    public void emitirSom()
    {
         System.out.println("Som de arara tipo ra ra ra");
    }
}
