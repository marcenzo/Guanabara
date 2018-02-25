
package br.com.cursodevideo.testheranca;

public class Pessoa
{
    private String nome, sexo;
    private int idade;

    public Pessoa(String nome, String sexo, int idade)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    
    public void fazerAniversario()
    {
       this.idade++;
    }
    
    public String caracteristiscas()
    {
        return "\tNome=" + nome + "\tSexo=" + sexo + "\tIdade=" + idade;
    }
    
}
