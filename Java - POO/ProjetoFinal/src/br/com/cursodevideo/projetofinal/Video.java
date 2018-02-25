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
public class Video implements AcoesVideo
{
    private String  titulo;
    private int     avaliacao, views, curtidas;
    private boolean reproduzindo; 

    public Video(String titulo)
    {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getAvaliacao()
    {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao)
    {
        int nova;
        nova = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public int getViews()
    {
        return views;
    }

    public void setViews(int views)
    {
        this.views = views;
    }

    public int getCurtidas()
    {
        return curtidas;
    }

    public void setCurtidas(int curtidas)
    {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo()
    {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo)
    {
        this.reproduzindo = reproduzindo;
    }

    
    @Override
    public void play()
    {
        this.setReproduzindo(true);
        System.out.println("Reproduzindo");
    }

    @Override
    public void pause()
    {
        this.setReproduzindo(false);
        System.out.println("Reproducao Parada");
    }

    @Override
    public void like()
    {
        this.setCurtidas(getCurtidas() + 1);
        this.setViews(getViews() + 1);
      
    }

    @Override
    public String toString()
    {
        return "Video: Titulo=" + titulo + "\tAvaliacao=" + avaliacao + "\tViews=" + views + "\tCurtidas=" + curtidas + "\tReproduzindo=" + reproduzindo + "\n";
    }
    
}
