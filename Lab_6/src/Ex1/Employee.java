package Ex1;

public class Employee implements Comparable{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee object) {
        if (this.age > object.age) return 1;
        else if (this.age < object.age) return -1;
        else return 0;
    }
}
