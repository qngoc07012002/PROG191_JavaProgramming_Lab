package EX1;

public class Employee extends Person{
    protected String office;
    protected String salary;
    protected String dateHired;

    public Employee(){

    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, String salary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public String getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return getName()+" is a Employee";
    }
}
