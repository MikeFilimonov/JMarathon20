package day14.Task3;

public class Person {

    public static final int fieldCount = 2;
    public static int ageLowerBound  = 0;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return new StringBuilder().
                    append("{name=")
                    .append(name)
                    .append(", age=")
                    .append(age)
                    .append("}").toString();
    }
}
