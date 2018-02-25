/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.aula13b;
 
public class Cachorro extends Mamifero
{
    protected String cao;
    
    @Override
    public void locomover()
    {
        System.out.println("correndo");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Racao");

    }

    @Override
    public void emitirSom()
    {
        System.out.println("Au Au Au");
   
    }
    
    public void reagir(String frase)
    {
        if(frase.equals("Toma Comida") || frase.equals("Ola"))
        {
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min)
    {
        if(hora < 12)
        {
            System.out.println("Abanar");
        }else if(hora >= 18)
        {
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
    }
    
     public void reagir(int idade, float peso)
    {
        if(idade < 5)
        {
            if(peso < 10)
            {
                System.out.println("Abanar");
            }else{
                System.out.println("latir");
            }
            }else if(peso < 10)
                    {
                    System.out.println("Rosnar");
                    }else{
                    System.out.println("Ignorar");
            }
        }
        
     public void reagir(boolean dono)
    {
        if(dono)
        {
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }
}
