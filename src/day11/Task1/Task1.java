package day11.Task1;

public class Task1 {

    public static void main(String[] args) {

        int initialOrderCount = 0;
        int initialBalance = 0;
        Warehouse warehouse = new Warehouse(initialOrderCount, initialBalance);


        Picker cameron = new Picker();
        cameron.setLocation(warehouse);
        cameron.doWork();
        System.out.printf("Cam earned %d\r\n", cameron.getSalary());

        Courier jim = new Courier();
        jim.setLocation(warehouse);
        jim.doWork();
        System.out.printf("Jim earned %d\r\n", jim.getSalary());

        for(int i = 0; i <= 1500; i++){
            cameron.doWork();
            jim.doWork();
        }

        jim.bonus();
        cameron.bonus();

        System.out.printf("Wh metrics: income: %d, orders: %d\r\n", warehouse.getBalance(), warehouse.getOrderCount());
        System.out.printf("Cam earned %d\r\n", cameron.getSalary());
        System.out.printf("Jim earned %d\r\n", jim.getSalary());

        System.out.println(warehouse + " " + cameron + " " + jim);

    }

}
