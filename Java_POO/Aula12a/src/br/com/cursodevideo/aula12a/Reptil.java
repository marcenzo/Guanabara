 
package br.com.cursodevideo.aula12a;

public class Reptil extends Animal
{
    private String corEscama;

    public String getCorEscama()
    {
        return corEscama;
    }

    public void setCorEscama(String corEscama)
    {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover()
    {
        System.out.println("rasteja");

    }

    @Override
    public void alimentar()
    {
         System.out.println("Plantas");
    }

    @Override
    public void emitirSom()
    {
         System.out.println("Som de reptil ");
    }
    
    
}
