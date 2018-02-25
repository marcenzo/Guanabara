package br.com.cursodevideo.uec;
 
public class Lutador
{
    private String nome , nacionalidade, categoria;
    private    int idade, vitorias     , derrotas , empates ; 
    private  float peso , altura;
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates )
    {
        this.nome          = nome;
        this.nacionalidade = nacionalidade;
        this.idade         = idade;
        this.altura        = altura;
        this.setPeso(peso);
        this.vitorias      = vitorias;
        this.derrotas      = derrotas;
        this.empates       = empates;
    }
    
     public void ganharLuta()
    {
        this.setVitorias(this.getVitorias() + 1);
       // vitorias += 1;
    }
    
     public void perderLuta()
    {
        this.setDerrotas(this.getDerrotas() + 1);
    }
     
     public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }
    
     

    public String getNome()
    {
       return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNacionalidade()
    {
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade)
    {
        this.nacionalidade = nacionalidade;
    }
    
    public String getCategoria()
    {
        return this.categoria;
    }
    
    private void setCategoria()
    {
        if(this.getPeso() < 52.2)
        {
            this.categoria = "Invalido";
           // System.out.println("Categoria invalida");   
        }
        else if(this.getPeso() <= 70.3)
        {
            this.categoria = "Leve";
            //System.out.println("Categoria Leve");  
        }
        else if(this.getPeso() <= 83.9)
        {
            this.categoria = "Medio";
           // System.out.println("Categoria medio");     
        }
        else if(this.getPeso() <= 120.2)
        {
            this.categoria = "Pesado";
           // System.out.println("Categoria Pesado"); 
        }
        else
        {
            this.categoria = "Invalido";
        }
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getVitorias()
    {
        return vitorias;
    }

    public void setVitorias(int vitorias)
    {
        this.vitorias = vitorias ;
    }

    public int getDerrotas()
    {
        return derrotas;
    }

    public void setDerrotas(int derrotas)
    {
        this.derrotas = derrotas;
    }

    public int getEmpates()
    {
        return empates;
    }

    public void setEmpates(int empates)
    {
        this.empates = empates;
    }

    public float getPeso()
    {
        return peso;
    }

    private void setPeso(float peso)
    {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }   
    
    public void apresentar()
    {
        System.out.println("Output: \n\nLutador: \t" + this.getNome());
        System.out.println("Origem:  \t" + this.getNacionalidade());
        System.out.println("Idade:   \t" + this.getIdade());
        System.out.println("Altura:  \t" + this.getAltura() + " Mts");
        System.out.println("Peso:    \t" + this.categoria);
        System.out.println("Vitorias:\t" + this.getVitorias());
        System.out.println("Derrotas:\t" + this.getDerrotas());
        System.out.println("Empates:\t"  + this.getEmpates() + "\n\n");

    }
     
    public void status()
    {
         System.out.println("Lutador:       \t"+ this.getNome());
         System.out.println("Peso     \t"      + this.getCategoria());
         System.out.println(this.getVitorias() + "\t Vitorias");
         System.out.println(this.getDerrotas() + "\t Derrotas"); 
         System.out.println(this.getEmpates()  + "\t Empates" + "\n\n");
    }
      
   
}
