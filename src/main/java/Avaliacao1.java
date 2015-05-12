/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
import utfpr.ct.dainf.if62c.avaliacao.Complexo;

public class Avaliacao1 {

    public static void main(String[] args) {
        Complexo x = new Complexo(4,8);
        Complexo y = new Complexo(3,12);
        Complexo[] resultsX = new Complexo[2];
        Complexo[] resultsY = new Complexo[2];
        
        resultsX = raizesEquacao(x.prod(x), x.prod(5), new Complexo(4,0));
        resultsY = raizesEquacao(y.prod(y), y.prod(2), new Complexo(5, 0));
        
        System.out.println("x1 = " + resultsX[0].toString());
        System.out.println("x2 = " + resultsX[1].toString());
        System.out.println("y1 = " + resultsY[0].toString());
        System.out.println("y2 = " + resultsY[1].toString());
    }
    
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c){
        Complexo[] raizes = new Complexo[2];
        Complexo[] opt = new Complexo[2];
        Complexo delta = new Complexo();
        
        delta = b.prod(b).sub(a.prod(4).prod(c));
        
        opt = delta.sqrt();
        
        raizes[0] = b.prod(-1).soma(opt[0]).div(a.prod(2));
        raizes[1] = b.prod(-1).soma(opt[1]).div(a.prod(2));
        
        return raizes;
    }
    
}
