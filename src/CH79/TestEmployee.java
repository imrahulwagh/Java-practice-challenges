package CH79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul",22,50000);
        emp.setAge(23);
        System.out.println(emp.getEmployeeDetails());
    }
}
