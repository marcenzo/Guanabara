/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.projetofinal;
 
public abstract class Pessoa
{
    protected String nome, sexo, experiencia;
    protected int idade;

    public Pessoa(String nome, String sexo, String experiencia, int idade)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.experiencia = experiencia;
        this.idade = idade;
    }
     
    
    protected abstract void ganharExp();

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public String getExperiencia()
    {
        return experiencia;
    }

    public void setExperiencia(String experiencia)
    {
        this.experiencia = experiencia;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    @Override
    public String toString()
    {
        return "Nome=" + nome + "\tSexo=" + sexo + "\tExperiencia=" + experiencia + "\tIdade=" + idade;
    }
    
    
}
