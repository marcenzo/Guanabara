/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.aula13b;

/**
 *
 * @author Apple
 */
public abstract class Animal   
{
    protected String nome, raca, cor;
    protected int    idade;
    protected float  altura, peso;

    public abstract void locomover(); 
    public abstract void alimentar();
    public abstract void emitirSom();

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getRaca()
    {
        return raca;
    }

    public void setRaca(String raca)
    {
        this.raca = raca;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public float getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    public float getPeso()
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    //@Override
    public String detalhes()
    {
        return "Animal: nome=" + nome + "\traca=" + raca + "\tcor=" + cor + "\tidade=" + idade + "\taltura=" + altura + "\tpeso=" + peso + '}';
    }
    
    
    
    
}
