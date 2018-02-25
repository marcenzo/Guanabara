/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.aula13b;
 
public class TestAula13b
{
    public static void main(String[] args)
    {
        Cachorro c = new Cachorro();
        c.setAltura(0.50f);
        c.setPeso(10.2f);
        c.setCor("Preto");
        c.setIdade(7);
        c.setNome("Cachorro do mato");
        c.setRaca("Cachorro de caça");
        System.out.println(c.detalhes());
        c.alimentar();
        c.emitirSom();
        c.locomover();
        c.reagir("Ola");
        c.reagir(false);
        c.reagir(10, 10);
        c.reagir(10, 6f);
        System.out.println(" ");
        
        Lobo l = new Lobo();
        l.setAltura(0.80f);
        l.setCor("branco");
        l.setIdade(6);
        l.setPeso(18.6f);
        l.setNome("Tim Tim");
        l.setRaca("Lobo Guara");
        System.out.println(l.detalhes());
        l.alimentar();
        l.emitirSom();
        l.locomover();
        System.out.println("");
        
        
    }
}
