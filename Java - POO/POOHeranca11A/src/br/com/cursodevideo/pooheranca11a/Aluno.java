 
package br.com.cursodevideo.pooheranca11a;

public class Aluno extends Pessoa
{
    private int matricula;
    private String  curso;
    
    public void pagarMensalidade()
    {
       System.out.println("Aluno [" + this.getNome() + "] pagando mensalidade.");
    }

    public int getMatricula()
    {
        return matricula;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    
    @Override
    public String detalhes()
    {
        return super.detalhes() + "\tMatricula= " + this.matricula + "\tCurso= " + this.curso;
    }
    
    
}
