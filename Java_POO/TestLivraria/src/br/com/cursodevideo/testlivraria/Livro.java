 
package br.com.cursodevideo.testlivraria;

public class Livro implements Publicacao
{
    private String  titulo, autor;
    private int     totalDePaginas, paginaAtual;
    private boolean aberto;
    private Pessoa  leitor;
    
    public Livro(String titulo, String autor, int totalDePaginas, Pessoa leitor)
    {
        this.titulo         = titulo;
        this.autor          = autor;
        this.totalDePaginas = totalDePaginas;
        this.paginaAtual    = 0;
        this.aberto         = false;
        this.leitor = leitor;
    }

    public String detalhes()
    {
        return "Livro\n" + "titulo\t = " + titulo  + " \nautor\t = " + autor + " \ntotalDePaginas\t = " 
                                    +  totalDePaginas + "\npaginaAtual\t = " + paginaAtual
                                    + " \naberto\t = " + aberto + " \nleitor\t = " + leitor.getNome() + "\nSexo\t = " + leitor.getSexo() + 
                                      "\nIdade\t = " + leitor.getIdade() + "\n";
    }
    
    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public int getTotalDePaginas()
    {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas)
    {
        this.totalDePaginas = totalDePaginas;
    }

    public int getPaginaAtual()
    {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual)
    {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto()
    {
        return aberto;
    }

    public void setAberto(boolean aberto)
    {
        this.aberto = aberto;
    }

    public Pessoa getLeitor()
    {
        return leitor;
    }

    public void setLeitor(Pessoa leitor)
    {
        this.leitor = leitor;
    }

    @Override
    public void abrir()
    {
        this.aberto =true;
    }

    @Override
    public void fechar()
    {
        this.aberto = false;
    }

    @Override
    public void folhear(int p)
    {
       // this.paginaAtual = p;
        
        if(p > this.totalDePaginas )
        {
            System.out.println("Opa... Voce passou o numero de paginas \n");
            //this.paginaAtual = 0;
        }else{
            
        this.paginaAtual = p;
        }
    }

    @Override
    public void avancarPagina()
    {
        this.paginaAtual++;
    }

    @Override
    public void voltarPagina()
    {
        this.paginaAtual--;
    }
    
    
}
