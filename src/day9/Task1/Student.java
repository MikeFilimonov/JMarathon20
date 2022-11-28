package day9.Task1;

public class Student extends Human{

    private String classId;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Student(String name, String classId) {
        super(name);
        this.classId = classId;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.printf("Этот студент с именем %s\r\n ", name);
    }

}
