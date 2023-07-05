import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = Integer.parseInt(scn.nextLine());
        System.out.println("The sum of number’s numerals is:"+(sumOfNumber(n)));
    }
    public static int sumOfNumber(int x){
        int s = 0;
        while (x!=0){
            s = s + (x % 10);
            x = x / 10;
        }
        return s;
    }
}
