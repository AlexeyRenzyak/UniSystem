import java.util.HashMap;
import java.util.Vector;

public class Course {

    private int credits;
    private int year;
    private HashMap<String, String> courseName;
    private int courseId;
    private String parentDepartment;
    private CourseType courseType;
    private Vector<Course> prerequisites;
    private Vector<Teacher> teachers;
    private Vector<Student> students;

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public HashMap<String, String> getCourseName() {
        return courseName;
    }

    public void setCourseName(HashMap<String, String> courseName) {
        this.courseName = courseName;
    }

    public String getCourseNameEntry(String language) {
        return courseName.get(language);
    }

    public void setCourseNameEntry(String courseName, String language) {
        this.courseName.put(language, courseName);
    }


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getParentDepartment() {
        return parentDepartment;
    }

    public void setParentDepartment(String parentDepartment) {
        this.parentDepartment = parentDepartment;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public Vector<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(Vector<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public Vector<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Vector<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Vector<Student> getStudents() {
        return students;
    }

    public void setStudents(Vector<Student> students) {
        this.students = students;
    }

    public void removeLesson() {
        //TODO
    }
    public void addLesson() {
        //TODO
    }
    
    
}
