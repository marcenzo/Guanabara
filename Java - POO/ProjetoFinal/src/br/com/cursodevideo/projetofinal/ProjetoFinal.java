/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.projetofinal;
 
public class ProjetoFinal
{ 
    public static void main(String[] args)
    {
        System.out.println("Criacao de um Video");
        Video [] v = new Video[2];
        v[0] = new Video("Star Wars");
       // System.out.println(v[0].toString());
       // v[0].like();
       // v[0].pause();
        //v[0].play();
        
        v[1] = new Video("Star Trek");
       // System.out.println(v[1].toString());
        //v[1].like();
        //v[1].pause();
       // v[1].play();
        
        System.out.println(" ");
        
        System.out.println("Criacao de um Gafanhoto");
        Gafanhoto [] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Enzo", "M", "Iniciante", 5, "181212", 1);
        //System.out.println(g[0].toString());

        g[1] = new Gafanhoto("Maisa", "F" , "Avancada", 40, "maisenzo", 5);
        //System.out.println(g[1].toString());
        System.out.println(" ");
        
        Visualizacao vis = new Visualizacao(g[0], v[0]);
        vis.avaliar();
        System.out.println(vis.toString());
        
    }
    
}
