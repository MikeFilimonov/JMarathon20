package day11.Task1;

public class Warehouse {

    public int getOrderCount() {
        return orderCount;
    }

    public int getBalance() {
        return balance;
    }

    private int orderCount;

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addGrossToBalance(){
        balance+=1000;
    }

    public void increaseOrderCount(){
        orderCount+=1;
    }

    private int balance;

    public Warehouse(int orderCount, int balance) {
        this.orderCount = orderCount;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return String.format("Order count: %d, balance: %d", orderCount, balance);
    }

}
