public class Worker {

    private String name;
    private double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return -1;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public static void main(String[] args) {

        Worker w = new HourlyWorker("Bob", 10.4);
        System.out.println(w.computePay(40));

        Worker a = new SalariedWorker("Alice", 25.5);
        System.out.println(a.computePay(40));

    }

}

class HourlyWorker extends Worker {

    public HourlyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double computePay(int hours) {

        if (hours <= 40) {
            return hours * getSalaryRate();
        } else {
            return 40 * getSalaryRate() + 1.5 * (hours - 40) * getSalaryRate();
        }
    }

}

class SalariedWorker extends Worker {

    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    public double computePay(int hours) {
        return 40 * getSalaryRate();
    }

}
