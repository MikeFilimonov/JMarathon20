package day6;

public class Task3 {

    public static void main(String[] args) {
        Teacher doc = new Teacher("Sam Aldon", "Math");
        Student undergrad  = new Student("Chett Hardworth");
        doc.examiner(undergrad);

    }
}
