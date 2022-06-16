package at.campus02.iwi.recursion;

public class MultiplicationDemoApp {
    public static void main(String[] args) {
        System.out.println(multiply(3, 4));
        System.out.println(quadrat(5, 3));
    }

    public static int multiply(int br1, int br2) {

        if (br1 == 1)
            return br2;

        return br2 + multiply(--br1, br2);
    }

//isti princip radi i za kvadrat broja s tim da je ovdje bitno kako su parametri rasporedjeni
    //u kodu, ne mogu mijenjeti mjesta. u mom primjeru 5 je baza, a 3 kvadrat.
    public static int quadrat(int broj1, int broj2) {
 if(broj2==1){
     return broj1;

 }
 return broj1*quadrat( broj1, --broj2);
    }
//
}