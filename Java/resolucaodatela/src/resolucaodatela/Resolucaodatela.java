 
package resolucaodatela;
 
import java.awt.Dimension;
import java.awt.Toolkit;
 
public class Resolucaodatela {
/*
 	=============================================
	= Curso online Curso Em Video - Guanabara   =
	= Linguagem de programacao Java             =
	= Exercicios das aulas de video e dos pdfs. =
        =                                           =
	= Data:09/02/18                             =
	=============================================

	" Faça_Suas Preces Te Levantarem ".
 
 * @author marcenzo developer inc.
 */
    public static void main(String[] args) 
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu monitor é:" + d.width + " x " + d.height );

        
        
    }
    
}
