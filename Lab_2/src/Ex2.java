import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input min: ");
        int min = Integer.parseInt(scn.nextLine());
        System.out.print("Input max: ");
        int max = Integer.parseInt(scn.nextLine());
        int tgmin = min;
        while (tgmin<=max){
            print(tgmin,max);
            print(min,tgmin-1);
            tgmin++;
            System.out.println();
        }

    }
    public static void print(int x, int y){
        for (int i = x; i<=y;i++) System.out.print(i+"");
    }
}
