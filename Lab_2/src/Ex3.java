import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = Integer.parseInt(scn.nextLine());
        if (ktnt(n)==true) System.out.println(n+" is a prime number");
        else System.out.println(n+" is not a prime number");
        System.out.println("Prime submultiples of number: ");
        submultiples(n);
        System.out.println();
        System.out.println("100 prime numbers: ");
        int d = 0,t = 2 ;
        while (d!=100){
            if (ktnt(t)==true) {
                System.out.print(t+" ");
                d++;
                if (d % 20 == 0) System.out.println();
            }
            t++;
        }
    }
    public static boolean ktnt (int x){
        boolean kt = true;
        if (x < 2) kt = false;
        else
            for (int i=2; i<=Math.sqrt(x);i++)
                if (x % i == 0){
                   kt = false;
                   break;
                }
            return kt;
    }
    public static void submultiples(int x){
        int t = 2;
        while (x>1){
            if (x % t ==0) {
                System.out.printf(t+"");
                x = x / t;
                if (x>1) System.out.printf("*");
            } else t++;
        }
    }
}
