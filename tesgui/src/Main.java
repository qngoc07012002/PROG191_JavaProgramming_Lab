import java.io.*;

public class Main {
    public class Staff extends Person implements Serializable {
        private int staffId;
        private String department;
        private double salary;

        public Staff(String name, int age, int staffId, String department, double salary) {
            super(name, age);
            this.staffId = staffId;
            this.department = department;
            this.salary = salary;
        }

        public Staff() {
            super();
            this.staffId = 0;
            this.department = "";
            this.salary = 0.0;
        }

        // getters and setters

        public static void main(String[] args) {
            // write staff objects to file
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("staffs.dat"));
                Staff staff1 = new Staff("John Doe", 30, 1001, "IT", 5000.0);
                Staff staff2 = new Staff("Jane Doe", 35, 1002, "Marketing", 6000.0);
                Staff staff3 = new Staff("Bob Smith", 40, 1003, "Sales", 7000.0);
                out.writeObject(staff1);
                out.writeObject(staff2);
                out.writeObject(staff3);
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            // read staff objects from file
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("staffs.dat"));
                Staff staff;
                while ((staff = (Staff) in.readObject()) != null) {
                    System.out.println("Staff: " + staff.getName() + ", " + staff.getAge() + ", " + staff.getStaffId() + ", " + staff.getDepartment() + ", " + staff.getSalary());
                }
                in.close();
            } catch (EOFException ex) {
                // end of file reached
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
}