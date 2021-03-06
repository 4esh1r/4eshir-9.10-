public class Employee {
    private String type;
    private String name;
    private int salary;
    private int againstPayment;
    private int tax;


    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public String getAgainstPayment() {
        return String.valueOf(againstPayment);
    }

    public void setAgainstPayment(int againstPayment) {
        this.againstPayment = againstPayment;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
}
