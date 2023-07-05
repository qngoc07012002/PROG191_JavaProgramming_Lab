import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("What color do you want? ");
        String color = scn.nextLine();
        switch (color){
            case "b","B"-> System.out.println("Blue");
            case "g","G"-> System.out.println("Green");
            case "r","R"-> System.out.println("Red");
            default -> System.out.println("Unknow Color: "+color);
        }
    }
}
