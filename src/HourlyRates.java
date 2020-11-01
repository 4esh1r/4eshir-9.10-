public class HourlyRates extends Employee {
    private int hour;
    private int rate;
    private  int tax = 20;
    private int againstPayment;
    private double currencyRate;

    public HourlyRates(String name, int hour, int rate, String haveChild, String Offshore, double currencyRate) {
        super(name, "hourly rates");
        this.hour = hour;
        this.rate = rate;
        this.currencyRate = currencyRate;
        if(haveChild.equals("no")) tax+=5;
        if(Offshore.equals("yes")) tax = 0;
        setTax(tax);
        setSalary((rate * hour));
        if(Offshore.equals("no") && hour >= 200){
            setSalary(getSalary() + (int)(getSalary()*0.3));
        }
        againstPayment = getSalary() - (getSalary() / 100 * tax);
        setAgainstPayment(againstPayment);
    }

    @Override
    public String getAgainstPayment() {
        return String.valueOf(againstPayment/2) + "/" + String.valueOf((int)(againstPayment/2 * currencyRate));
    }
}
