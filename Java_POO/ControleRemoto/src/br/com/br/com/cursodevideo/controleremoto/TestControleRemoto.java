package br.com.br.com.cursodevideo.controleremoto;

public class TestControleRemoto
{
    public static void main(String[] args)
    {
         ControleRemoto cr  = new ControleRemoto();
         
         cr.ligar();
         cr.abrirMenu();
         cr.fecharMenu();
         cr.maisVolume();
         cr.ligarMudo();
         cr.maisVolume();
        
        // cr.fecharMenu();
    }
    
}
