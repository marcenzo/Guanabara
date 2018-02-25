 
package br.com.cursodevideo.testheranca;

public class TestHeranca
{
    public static void main(String[] args)
    {
               Pessoa p = new Pessoa     ("Enzo" , "M" , 5);
                Aluno a = new Aluno      ("Marcio", 10 , "Informatica" , "M" , 22);
          Funcionario f = new Funcionario("Maisa" , "F" , 42 , "Gerencia" , true );
          Professor   t = new Professor("Maria", "F", 32 , "Historia" , 2500f);
          
          System.out.println("Pessoa:      " + p.caracteristiscas());
          System.out.println("Aluno:       " + a.caracteristiscas());
          System.out.println("Funcionario: " + f.caracteristiscas());
          System.out.println("Professor:   " + t.caracteristiscas());

    }
    
}
