package br.com.br.com.cursodevideo.controleremoto;

public class ControleRemoto implements Controlador
{
    private int volume;
    private boolean  ligado;
    private boolean tocando;
    
    ControleRemoto()
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public boolean getLigado()
    {
        return ligado;
    }

    public void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }

    public boolean getTocando()
    {
        return tocando;
    }

    public void setTocando(boolean tocando)
    {
        this.tocando = tocando;
    }

    @Override
    public void ligar()
    {
        if(getLigado() == false)
        {
            this.setLigado(true);
            System.out.println("Ativado\n");
        }else{
            System.out.println("Desculpe a funcao 'LIGAR' nao pode ser ativada");  
        }
    }

    @Override
    public void desligar()
    {
        if(this.getLigado())
        {
           // this.setLigado(false);
            System.out.println("Ativado");
        }else{
            System.out.println("Desculpe a funcao 'DESLIGAR' nao pode ser ativada");  
        
        }
    }

    @Override
    public void abrirMenu()
    {
        if(this.getLigado())
        {
           System.out.println("Menu:\n1 - Desligar " + this.getLigado() + "\n2 - Volume " + getVolume() + "\n3 - Play ou Pausar " + getTocando());
            
        }else{
           System.out.println("Desculpe a funcao 'MENU' nao pode ser ativada");   
        }
    }
    
    @Override
    public void fecharMenu()
    {
        if(this.getLigado())
        {
          //this.setLigado(false);
          System.out.println("Menu DESATIVADO");
          
        }else{
          System.out.println("Desculpe a funcao 'FECHAR MENU' nao pode ser ativada");  
        }
        
    }

    @Override
    public void maisVolume()
    {
        if(this.getLigado())
        {
           this.setVolume(this.getVolume() + 1);
           System.out.println("Aumentando volume");
           
           for(int i = 0; i <= this.getVolume(); i+=10)
            {
             System.out.print("|");
             
            }  
             System.out.print("\n ");
        }   else{
           System.out.println("Desculpe a funcao 'AUMENTAR VOLUME' nao pode ser ativada");  
        }
    }

    @Override
    public void menosVolume()
    {
        if(this.getLigado() && this.tocando)
        {
           this.setVolume(this.getVolume() - 1);
           System.out.println("Abaixando volume");
        }else{
           System.out.println("Desculpe a funcao 'BAIXAR VOLUME' nao pode ser ativada");  
         }
    }

    @Override
    public void ligarMudo()
    {
        if(this.getLigado())
        {
            this.setTocando(false);
            System.out.println("Mudo ativado");
            
        }else{
            System.out.println("Desculpe a funcao 'ATIVAR MUDO' nao pode ser ativada");
        }
    }

    @Override
    public void desligarMudo()
    {
        if(this.getTocando() == false)
        {
            this.setTocando(true);
            System.out.println("Mudo desativado");
        }else{
            System.out.println("Desculpe a funcao  'DESATIVAR MUDO' nao pode ser ativada");  
        }
    }

    @Override
    public void pause()
    {
        if(this.getLigado() && this.getTocando())
        {
            this.setTocando(false);
            System.out.println("Pause ativado");
        }else{
            System.out.println("Desculpe a funcao 'ATIVAR PAUSE'nao pode ser ativada");  
        }
    }

    @Override
    public void play()
    {
        if(this.getLigado() && getTocando() == false)
        {
            this.setTocando(true);
            System.out.println("Play ativado");
        }else{
            System.out.println("Desculpe a funcao 'ATIVAR PLAY' nao pode ser ativada");  
        }
    }
    
 }

