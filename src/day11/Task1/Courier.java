package day11.Task1;

public class Courier implements Worker{

    private Warehouse location;
    private int salary;

    public void setLocation(Warehouse location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void doWork() {

        salary+=100;
        location.addGrossToBalance();
    }

    @Override
    public void bonus(){

        if (location.getOrderCount() >= 1500)
            salary *=3;

    }
}
