package Ex2;

import java.sql.SQLOutput;

public class Bill {
    private String customerCode;
    private String customerType;
    private int oldIndex;
    private int newIndex;

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public Bill() {
    }

    public Bill(String customerCode, String customerType, int oldIndex, int newIndex) {
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }
    public int unitPrice(){
        if (customerType.equals("Resident")) return 500;
        else if (customerType.equals("Business") || customerType.equals("Organization")) return 400;
        else return 300;
    }
    public int payment(){
        return unitPrice()*(newIndex-oldIndex);
    }

    public void displayDetail(){
        System.out.println("Customer Code: "+customerCode);
        System.out.println("Customer Type: "+customerType);
        System.out.println("New Index: "+newIndex+" Old Index: "+oldIndex);
        System.out.println("Payment: "+payment());
    }
}
