import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner scn =   new Scanner(System.in);
        System.out.print("Input a:");
        int a = Integer.parseInt(scn.nextLine());
        System.out.print("Input b:");
        int b = Integer.parseInt(scn.nextLine());
        System.out.print("Input Operator (+, -, *, /, %):");
        String operator = scn.nextLine();
        switch (operator){
            case "+"-> System.out.println(a+" + "+b+" = "+ (a+b));
            case "-"-> System.out.println(a+" - "+b+" = "+ (a-b));
            case "*"-> System.out.println(a+" * "+b+" = "+ (a*b));
            case "/"-> System.out.println(a+" / "+b+" = "+ (a/b));
            case "%"-> System.out.println(a+" % "+b+" = "+ (a%b));
        }


    }
}
