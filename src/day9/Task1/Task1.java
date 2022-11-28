package day9.Task1;

public class Task1 {

    public static void main(String[] args) {

        Student Pam = new Student("Pam", "H304");
        System.out.println(Pam.getClassId());

        Teacher Donald = new Teacher("Donald", "Algorithms");
        System.out.println(Donald.getCourse());

        Pam.printInfo();
        Donald.printInfo();

    }

}
