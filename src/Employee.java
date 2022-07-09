public class Employee {
    String lastName;
    String firstName;
    double salary;

    public static double predictRaise(double currentSalary) {
        return currentSalary + 1.65;
    }

    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    public String getNameInitials() {
        return lastName.charAt(0) + "." + firstName.charAt(0) + ".";
    }
}
