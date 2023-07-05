package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PersonList myPersonList = new PersonList();
        Scanner scn = new Scanner(System.in);
        int choice = 0;
        while (choice != 5){
            System.out.println("1. Display All Person");
            System.out.println("2. Average Rank of All Person");
            System.out.println("3. Max Rank Person");
            System.out.println("4. Remove Person");
            System.out.println("5. Exit");
            System.out.printf("Your choice: ");
            choice = Integer.parseInt(scn.nextLine());

            switch (choice){
                case 1->myPersonList.displayAll();
                case 2->myPersonList.averageRank();
                case 3->myPersonList.maxRank();
                case 4->myPersonList.removePerson();
            }

        }

    }
}
