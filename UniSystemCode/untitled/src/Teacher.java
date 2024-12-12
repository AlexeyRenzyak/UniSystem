import java.util.Vector;

public class Teacher extends Employee{
    

    private Vector<Course> courses;
    private String name ;
    private int teacherId;
    private Vector<Lesson> lessons;


    public Vector<Course> getCourses() {
        return courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Vector<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Vector<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void sendComplaint() {
        //TODO
    }
    public void manageCourse() {
        //TODO
    }
    public void viewStudents() {
        //TODO
    }
    public void assignMark() {
        //TODO
    }

    
}
