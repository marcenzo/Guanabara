 
package br.com.cursodevideo.aula12a;
 
public class TestAula12a
{
    public static void main(String[] args)
    {
        Mamifero m = new Mamifero();
        m.setCorPelo("Preto");
        m.setIdade(5);
        m.setPeso(20);
        m.setMembros(4);
        m.setNome("Cachorro Bela");
        System.out.println(m.detalhes() + "\tCor Pelo=" + m.getCorPelo());
        m.alimentar();
        m.emitirSom();
        m.locomover();
        System.out.println(" ");
        
        Reptil r = new Reptil();
        r.setNome("Hamister Bob");
        r.setCorEscama("Marrom");
        r.setIdade(25);
        r.setPeso(10);
        r.setMembros(4);
        System.out.println(r.detalhes() + "\tCor Escama=" + r.getCorEscama());
        r.alimentar();
        r.emitirSom();
        r.locomover();
        System.out.println(" ");
        
        Peixe p = new Peixe();
        p.setCorEscama("Cinza");
        p.setIdade(2);
        p.setMembros(1);
        p.setNome("Peixe Willy");
        p.setPeso(2);
        System.out.println(p.detalhes() + "\tCor Escama=" + p.getCorEscama());
        p.soltarBolhas();
        p.alimentar();
        p.emitirSom();
        p.locomover();
        System.out.println(" ");
        
        Ave a = new Ave();
        a.setCorPena("Escura");
        a.setIdade(5);
        a.setMembros(4);
        a.setPeso(15);
        a.setNome("Ave Zeca Urubu");
        System.out.println(a.detalhes() + "\tCor da pena=" + a.getCorPena());
        a.alimentar();
        a.emitirSom();
        a.locomover();
        a.fazerNinho();
        System.out.println("");
        
        Canguru c = new Canguru();
        c.setCorPelo("marrom");
        c.setIdade(9);
        c.setMembros(4);
        c.setNome("Canguru Papa leguas");
        c.setPeso(25);
        System.out.println(c.detalhes() +  "\tCor do Pelo=" + c.getCorPelo());
        c.alimentar();
        c.emitirSom();
        c.locomover();
        c.usarBolsa();
        System.out.println("");
        
        Cachorro dog = new Cachorro();
        dog.setCorPelo("Preto");
        dog.setIdade(8);
        dog.setMembros(4);
        dog.setPeso(16);
        dog.setNome("Cachorro Bela");
        System.out.println(dog.detalhes()  + "\tCor do pelo=" + dog.getCorPelo());
        dog.emitirSom();
        dog.alimentar();
        dog.locomover();
        
        
 
        
        

        
        
    }
    
}
