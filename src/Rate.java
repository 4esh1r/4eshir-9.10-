public class Rate extends Employee {
    private  int days;
    private  int rate;
    private  int tax = 20;

    public Rate(String name, int days, int rate, String haveChild, String Offshore) {
        super(name, "rate");
        this.days = days;
        this.rate = rate;
        if(haveChild.equals("no")) tax+=5;
        if(Offshore.equals("yes")) tax = 0;
        setTax(tax);
        setSalary((rate * days));
        if(Offshore.equals("no") && (days * 8) >= 200){
            setSalary(getSalary() + (int)(getSalary()*0.3));
        }
        setAgainstPayment(getSalary() - (getSalary() / 100 * tax));
    }
}
