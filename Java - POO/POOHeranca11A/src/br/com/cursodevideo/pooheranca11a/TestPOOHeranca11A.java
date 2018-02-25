 
package br.com.cursodevideo.pooheranca11a;

public class TestPOOHeranca11A
{
    public static void main(String[] args)
    {
         Visitante v = new Visitante();   
         v.setIdade(5);
         v.setNome("Enzo");
         v.setSexo("M");
         System.out.println(v.detalhes() + "\n");
         
         Aluno a = new Aluno();
         a.setIdade(21);
         a.setCurso("Pos");
         a.setNome("Junior");
         a.setSexo("M");
         a.setMatricula(1112);
         System.out.println(a.detalhes());
         a.pagarMensalidade();
         System.out.println("");
         
         Bolsista b = new Bolsista();
         b.setNome("Marcio");
         b.setMatricula(1812);
         b.setCurso("Mestrado");
         b.setIdade(35);
         b.setSexo("M");
         b.setBolsa(1);
         System.out.println(b.detalhes());
         b.pagarMensalidade();
         b.renovarBolsa();
         
         Tecnico t = new Tecnico();
         t.setNome("Mika");
         t.setMatricula(2211);
         t.setCurso("Terapeuta");
         t.setIdade(30);
         t.setRegistroProfissional(24425);
         t.setSexo("M");
         System.out.println(t.detalhes());
         t.praticar();
         t.pagarMensalidade();
         
             
          
    }
    
}
