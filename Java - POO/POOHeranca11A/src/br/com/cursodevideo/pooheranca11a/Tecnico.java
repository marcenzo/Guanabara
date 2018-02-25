 
package br.com.cursodevideo.pooheranca11a;

public class Tecnico extends Aluno
{
    private int registroProfissional;
    
    public void praticar()
    {
        System.out.println("Trabalhando");
    }

    public int getRegistroProfissional()
    {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional)
    {
        this.registroProfissional = registroProfissional;
    }
    
    @Override
    public void pagarMensalidade()
    {
        System.out.println("Aluno[" + this.getNome() + "] pagando mensalidade de TECNICO");
    }
    
     @Override
    public String detalhes()
    {
        return super.detalhes() + "\tregistroProfissional= " + this.registroProfissional;
    }
}
