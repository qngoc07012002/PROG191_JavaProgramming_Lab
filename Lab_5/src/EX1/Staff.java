package EX1;

public class Staff extends Employee{
    protected String title;
    public Staff(){

    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, String salary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return getName()+" is a Staff";
    }
}
