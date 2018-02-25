 
package br.com.cursodevideo.testheranca;

public class Funcionario extends Pessoa
{
    private String setor;
    private boolean trabalhando;

    public Funcionario( String nome, String sexo, int idade, String setor, boolean trabalhando)
    {
        super(nome, sexo, idade);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    public void mudarTrabalho()
    {
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor()
    {
        return setor;
    }

    public void setSetor(String setor)
    {
        this.setor = setor;
    }

    public boolean getTrabalhando()
    {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando)
    {
        this.trabalhando = trabalhando;
    }

    @Override
    public String caracteristiscas()
    {
        return super.caracteristiscas() + "\tSetor=" + this.setor + "\t  Trabalhando=" + this.trabalhando;  
    }
    
    
    
}
