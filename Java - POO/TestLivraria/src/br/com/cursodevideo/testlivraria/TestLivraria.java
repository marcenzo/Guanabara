 
package br.com.cursodevideo.testlivraria;

public class TestLivraria
{
    public static void main(String[] args)
    {
        Pessoa [] pessoa = new Pessoa[2];
        Livro  [] livro  = new Livro[2];
        
        pessoa[0] = new Pessoa("Enzo", 5, "Masculino");
        pessoa[1] = new Pessoa("Maisa", 35, "Feminino");
        
        livro[0] = new Livro("Ensaio sobre a cegueira", "Jose Saramago", 100, pessoa[1]);
        livro[1] = new Livro("Turma da Monica", "Mauricio de souza", 50, pessoa[0]);
        
        livro[0].abrir();
        livro[0].folhear(110);

        System.out.println(livro[0].detalhes());
    }
    
}
  