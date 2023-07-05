package Ex2;

import java.util.Scanner;

public class BillList {
    Scanner scn = new Scanner(System.in);
    Bill[] billList = new Bill[100];
    int numberOfBill;

    public void enterBillToList(){
        System.out.print("Input number of Bill: ");
        numberOfBill = Integer.parseInt(scn.nextLine());

        for (int i = 0; i< numberOfBill;i++){
            System.out.println("Bill "+(i+1));
            System.out.print("Customer Code: ");
            String customerCode = scn.nextLine();
            System.out.print("Customer Type: ");
            String customerType = scn.nextLine();
            System.out.print("Old Index: ");
            int oldIndex = Integer.parseInt(scn.nextLine());
            System.out.print("New Index: ");
            int newIndex = Integer.parseInt(scn.nextLine());
            billList[i] = new Bill(customerCode,customerType,oldIndex,newIndex);
        }
    }

    public void displayBillList(){
        for (int i=0; i<numberOfBill;i++){
            System.out.println("Bill "+(i+1));
            billList[i].displayDetail();
        }
    }

    public void totalPaymentType(){
        System.out.println("Input Type: ");
        String type = scn.nextLine();
        int s = 0;
        for (int i=0; i<numberOfBill;i++){
            if (type.equals(billList[i].getCustomerType()))
            {
            s = s + billList[i].payment();
            }
        }
        System.out.println("Total Payment in "+type+": "+s);
    }

    public void removeCustomerCode(){
        System.out.println("Input Customer Code: ");
        String code = scn.nextLine();
        int d = 0;
        for (int i=0; i<numberOfBill;i++)
            if (code.equals(billList[i].getCustomerCode())){
                d =i;
                break;
            }
        for (int i=d;i<numberOfBill-1;i++)
            billList[i] = billList[i+1];
        numberOfBill--;
        System.out.println("Remove Done!");
    }

    public void findMaxPayment(){
        int max=billList[0].payment(),vt=0;
        for (int i=numberOfBill-1;i>0;i--){
            if (max < billList[i].payment()){
                max = billList[i].payment();
                vt =i;
            }
        }
        System.out.println("Payment Largest:");
        billList[vt].displayDetail();
    }

}
