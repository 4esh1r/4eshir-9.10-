public class BargainRate extends  Employee{
    private  int tax = 15;

    public BargainRate(String name, int salary, String haveChild, String Offshore) {
        super(name, "bargain rate");
        if(haveChild.equals("no")) tax+=5;
        if(Offshore.equals("yes")) tax = 0;
        setTax(tax);
        setSalary(salary);
        setAgainstPayment(salary - salary/ 100 * tax);
    }
}
