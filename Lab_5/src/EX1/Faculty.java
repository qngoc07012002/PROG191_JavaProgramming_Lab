package EX1;

public class Faculty extends Employee{
    protected String officeHours;
    protected String rank;
    public Faculty(){

    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, String salary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return getName()+" is a Faculty";
    }
}
