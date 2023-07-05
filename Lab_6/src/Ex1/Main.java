package Ex1;

public class Main {
    public static void main (String[] args){
        Employee employee1 = new Employee();
        employee1.setAge(24);
        Employee employee2 = new Employee();
        employee2.setAge(21);
        int compareResult = employee1.compareTo(employee2);
        if (compareResult == 0) System.out.println("Same Age");
        else if (compareResult == 1) System.out.println("Age Employee 1 > Age Employee 2");
        else System.out.println("Age Employee 1 < Age Employee 2");
    }
}
