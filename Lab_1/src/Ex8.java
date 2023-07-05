import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input Month:");
        int month = Integer.parseInt(scn.nextLine());
        switch (month){
            case 1,2,3-> System.out.println("The first quarter");
            case 4,5,6-> System.out.println("The second quarter");
            case 7,8,9-> System.out.println("The third quarter");
            case 10,11,12-> System.out.println("The fourth quarter");
        }


    }
}
