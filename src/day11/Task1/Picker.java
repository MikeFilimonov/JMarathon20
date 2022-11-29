package day11.Task1;

public class Picker implements Worker{

    private Warehouse location;

    private int salary;

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }

    public void setLocation(Warehouse location) {
        this.location = location;
    }

    @Override
    public void doWork() {
        this.salary+=80;
        location.increaseOrderCount();
    }

    @Override
    public void bonus() {
        if (location.getBalance() > 1E6)
            salary*=2;
    }
}
