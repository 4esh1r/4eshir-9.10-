public class Base {
    private int len;
    private Employee[] list;

    public Base(int len) {
        list = new Employee[len];
    }

    public void addEmployee(int id, Employee employee){
        list[id] = employee;
    }

    public void showList(){
        int total = 0;
        for (Employee employee : list) {
            System.out.print("Name: " + employee.getName() + ";");
            System.out.print(" " + "tip:" + employee.getType() + ";");
            System.out.print(" " + "Nalog:" + employee.getTax() + "%" + ";");
            System.out.print(" " + "saLarY:" + employee.getSalary() + ";");
            System.out.println(" " + "plati snova:" + employee.getAgainstPayment() + ";");
            total += employee.getSalary();
        }
        System.out.println("TOTAL: " + total);
    }
}
