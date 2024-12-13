import java.util.Vector;

public class Teacher extends Employee{
    

    private Vector<Course> courses;
    private int teacherId;
    private TeacherType teacherType;
    private Vector<Lesson> lessons;
    private Vector<Integer> rating;


    public Vector<Integer> getRating() {
        return rating;
    }

    public void setRating(Vector<Integer> rating) {
        this.rating = rating;
    }

    public TeacherType getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
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

    public void addRating(int rating) {
        if(rating <= 0){
            rating = 1;
        } else if (rating >= 11) {
            rating = 10;
        }
        this.rating.add(rating);
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
