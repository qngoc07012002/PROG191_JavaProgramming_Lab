import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = Integer.parseInt(scn.nextLine());
        System.out.print("Input b: ");
        int b = Integer.parseInt(scn.nextLine());
        System.out.print("Input c: ");
        int c = Integer.parseInt(scn.nextLine());
        if ((a+b>c)&&(b+c>a)&&(a+c>b)) System.out.println("They are three valid sides of a triangle");
         else System.out.println("They aren't three valid sides of a triangle");
    }
}
