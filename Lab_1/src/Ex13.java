import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input Grade:");
        float grade = Float.parseFloat(scn.nextLine());
        if (grade>=0 && grade <5) System.out.println("Bad");
        else if (grade>=5 && grade<7) System.out.println("Average");
        else if (grade>=7 && grade <8) System.out.println("Good");
        else if (grade>=8 && grade <9) System.out.println("Very Good");
        else if (grade>=9 && grade <=10) System.out.println("Excellent");
    }
}
