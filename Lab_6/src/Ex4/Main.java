package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayOfAnt myArrayOfAnt = new ArrayOfAnt();
        Scanner scn = new Scanner(System.in);
        int choice = 0;

        while (choice != 3){
            System.out.println("1.Create Ant List");
            System.out.println("2.Attack Ant");
            System.out.println("3.Quit");
            System.out.printf("Your Choice: ");
            choice = Integer.parseInt(scn.nextLine());

            switch (choice) {
                case 1 -> myArrayOfAnt.enterAntToList();
                case 2 -> myArrayOfAnt.attackAntList();
            }
        }
    }

}
