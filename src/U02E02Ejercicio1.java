/*
 a) !(a > b && 2 * a <= b)
 b) b++ > 3 || a + b <= 8 && !(a > b)
 c) a++ < 6 && (b += 2) < a
 d) a++ / 2 < b && (a++ / 2 > b || (a * 2 < b * 4))
 */

public class U02E02Ejercicio1 {

    public static void main(String[] args) {
        int a, b;
       
        a = 5;         b = 3;
        boolean apartadoA, apartadoASol;
        boolean apartadoB, apartadoBSol;
        boolean apartadoD, apartadoDSol;
        
        apartadoA = !(a > b && 2 * a <= b);
        apartadoASol = !((a > b) && ((2 * a) <= b));
        System.out.println("!(a > b && 2 * a <= b) = " + apartadoA + "  " + apartadoASol);
        
        a = 5;        b = 3;
        apartadoB = b++ > 3 || (a + b <= 8) && (!(a > b));
        a = 5;        b = 3;
        apartadoBSol = ( b++ > 3) || (((a + b) <= 8) && (!(a > b)));
        System.out.println("b++ > 3 || (a + b <= 8) && (!(a > b)) = " + apartadoB + "  " + apartadoBSol);
        
        a = 5;        b = 3;
        apartadoD = a++ / 2 < b && (a++ / 2 > b || (a * 2 < b * 4));
        a = 5;        b = 3;
        apartadoDSol = (((a++) / 2) < b) && (((a++ / 2) > b) || ((a * 2) <( b * 4)));        
        System.out.println("a++ / 2 < b && (a++ / 2 > b || (a * 2 < b * 4)) = " +apartadoD+ "  "+apartadoDSol);
        
        System.out.println(++a==a);
        System.out.println(a++==a);
         System.out.println(a++<a);
    }

}
