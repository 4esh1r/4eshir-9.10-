public class Main {
    public static void main(String[] args) {
        Base base = new Base(3);
        base.addEmployee(0, new Rate("Joh", 100, 120, "no", "no"));
        base.addEmployee(1, new HourlyRates("Mike", 600, 10, "no","no",  1.0/8));
        base.addEmployee(2, new BargainRate("Dan", 600, "no", "yes"));
        base.showList();
    }
}
