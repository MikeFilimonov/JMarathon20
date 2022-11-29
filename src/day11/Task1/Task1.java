package day11.Task1;

public class Task1 {

    public static void main(String[] args) {

        int initialOrderCount = 0;
        int initialBalance = 0;
        Warehouse wh = new Warehouse(initialOrderCount, initialBalance);


        Picker Cameron = new Picker();
        Cameron.setLocation(wh);
        Cameron.doWork();
        System.out.printf("Cam earned %d\r\n", Cameron.getSalary());

        Courier Jim = new Courier();
        Jim.setLocation(wh);
        Jim.doWork();
        System.out.printf("Jim earned %d\r\n", Jim.getSalary());

        for(int i = 0; i <= 1500; i++){
            Cameron.doWork();
            Jim.doWork();
        }

        Jim.bonus();
        Cameron.bonus();

        System.out.printf("Wh metrics: income: %d, orders: %d\r\n", wh.getBalance(), wh.getOrderCount());
        System.out.printf("Cam earned %d\r\n", Cameron.getSalary());
        System.out.printf("Jim earned %d\r\n", Jim.getSalary());

        System.out.println(wh + " " + Cameron + " " + Jim);

    }

}
