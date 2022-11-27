package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String course;

    private Random examResult;

    public Teacher(String name, String course){

        this.name = name;
        this.course = course;
        this.examResult = new Random();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void examiner(Student examinee){

        int grade =  2 + examResult.nextInt(4);

        String examResult = "";

        switch (grade){
            case 2:
                examResult = "неудовлетворительно";
                break;
            case 3:
                examResult = "удовлетворительно";
                break;
            case 4:
                examResult = "хорошо";
                break;
            case 5:
                examResult = "отлично";
                break;
            default:
                examResult = "на пересдачу";
                break;
        }

        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на %s.",
                this.name, examinee.getName(), this.course, examResult);



    }
}
