package day13.Task1;

public class Task1 {

    public static void main(String[] args) {

        User xi = new User("xzp");
        User vlad = new User("tzr");
        User erdie = new User ("sly");

        vlad.sendMessage(erdie,"rdy?");
        erdie.sendMessage(xi, "It's time");
        xi.sendMessage(vlad,"Add the masks");

        erdie.sendMessage(xi, "plz, share some masks");
        vlad.sendMessage(erdie, "masks sent");
        xi.sendMessage(vlad,"Ready for now");
        vlad.sendMessage(erdie, "gogogo");
        erdie.sendMessage(xi,"muhaha");
        erdie.sendMessage(vlad, "muhaha");

        MessageDatabase.showChatHistory(xi, erdie);

    }


}
