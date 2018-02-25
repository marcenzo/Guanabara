 
package br.com.cursodevideo.testheranca;

public class Aluno extends Pessoa
{
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso, String sexo, int idade)
    {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
    }
     
    
    public void cancelarMatricula()
    {
        System.out.println("Cancelar Matricula!");
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
    public String caracteristiscas()
    {
        return super.caracteristiscas() + "\tMatricula=" + this.matricula + "\t  Curso=" + this.curso;
        
    }
    
}
