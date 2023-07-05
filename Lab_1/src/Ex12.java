import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input Day:");
        int day = Integer.parseInt(scn.nextLine());
        System.out.print("Input Month:");
        int month = Integer.parseInt(scn.nextLine());
        System.out.print("Input Year:");
        int year = Integer.parseInt(scn.nextLine());
        switch (month) {
            case 1,3,5,7,8,10,12:
                if (day>0 && day<=31) System.out.println("Valid");
                else System.out.println("InValid");
                break;
            case 4,6,9,11:
                if (day>0 && day<=30) System.out.println("Valid");
                else System.out.println("InValid");
                break;
            case 2: {
                boolean check = true;
                if (((28*year%100==0) && (year%400==0)) || ((year % 4 ==0) && (year % 100 !=0))) check = true;
                else check = false;
                if (check==true && day>0 && day<=29) System.out.println("Valid");
                else if (check==false && day>0 && day<=28) System.out.println("Valid");
                 else System.out.println("InValid");
                 break;
            }
        }
    }
}
