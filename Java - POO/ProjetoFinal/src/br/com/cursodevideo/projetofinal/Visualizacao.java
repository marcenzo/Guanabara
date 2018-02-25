/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.projetofinal;

/**
 *
 * @author Apple
 */
public class Visualizacao
{ 
    
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme)
    {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setToAssistindo(this.espectador.getToAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
        
    }

    public Gafanhoto getEspectador()
    {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador)
    {
        this.espectador = espectador;
    }

    public Video getFilme()
    {
        return filme;
    }

    public void setFilme(Video filme)
    {
        this.filme = filme;
    }
     
    
  
    public void avaliar()
    {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota)
    {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc)
    {
        int total = 0;
        
        if(porc <= 20)
        {
            total = 3;
        }else if(porc <= 50)
        {
            total = 8;
        }else if(porc <= 90)
        {
            total = 8;
        }else{
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }

    @Override
    public String toString()
    {
        return "Visualizacao: \tEspectador=" + espectador + "Filme=\t" + filme;
    }
    
    
}
