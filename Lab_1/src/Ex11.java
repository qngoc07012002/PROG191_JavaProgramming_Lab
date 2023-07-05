import java.util.Scanner;

public class Ex11 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.print("Input Month:");
            int month = Integer.parseInt(scn.nextLine());
            System.out.print("Input Year:");
            int year = Integer.parseInt(scn.nextLine());
            switch (month) {
                case 1,3,5,7,8,10,12:
                    System.out.println("31 Days");
                    break;
                case 4,6,9,11:
                    System.out.println("30 Days");
                    break;
                case 2: {
                    if (((28*year%100==0) && (year%400==0)) || ((year % 4 ==0) && (year % 100 !=0)))
                        System.out.println("29 Days");
                    else System.out.println("28 Days");
                    break;
                }
            }
        }
}
