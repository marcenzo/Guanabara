
package br.com.cursodevideo.aula12a;
 
public abstract class Animal
{
    private int peso , idade, membros;
    private String nome;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public int getPeso()
    {
        return peso;
    }

    public void setPeso(int peso)
    {
        this.peso = peso;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getMembros()
    {
        return membros;
    }

    public void setMembros(int Membros)
    {
        this.membros = Membros;
    }

    public String detalhes()
    {
        return "Nome= " + nome +  "\tPeso= " + peso + "\tIdade=" + idade + "\tMembros=" + membros;
    }
    
    
}
