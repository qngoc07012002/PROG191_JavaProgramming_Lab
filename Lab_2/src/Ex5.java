import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = Integer.parseInt(scn.nextLine());
        System.out.println("Reserve number: "+(reserveNumber(n)));
    }
    public static int reserveNumber(int x){
        int d = 0;
        while (x!=0){
            d = (d*10)+(x%10);
            x = x / 10;
        }
        return d;
    }
}
