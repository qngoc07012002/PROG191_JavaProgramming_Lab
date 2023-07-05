package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        BillList myBillList = new BillList();
        int choice = 0;
        while (choice != 5){
            System.out.println("1.Input Bill To List");
            System.out.println("2.Total Payment Same Type (Resident,Business,Organization,Other)");
            System.out.println("3.Remove Bill");
            System.out.println("4.Find Largest Payment");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scn.nextLine());

            switch (choice) {
                case 1 -> myBillList.enterBillToList();
                case 2 -> myBillList.totalPaymentType();
                case 3 -> myBillList.removeCustomerCode();
                case 4 -> myBillList.findMaxPayment();
            }
        }
    }
}
