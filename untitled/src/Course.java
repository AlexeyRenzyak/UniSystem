import java.io.Serializable;
import java.util.HashMap;
import java.util.Vector;

public class Course implements Serializable {

    private int credits;
    private int year;
    private HashMap<Language, String> courseName;
    private int courseId;
    private String parentDepartment;
    private CourseType courseType;
    private Vector<Course> prerequisites;
    private Vector<Teacher> teachers;
    private Vector<Student> students;
    private Vector<Lesson> lessons;

    public Course(int courseId, HashMap<Language, String> courseName, int credits, int year, CourseType courseType, String parentDepartment) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.year = year;
        this.courseType = courseType;
        this.parentDepartment = parentDepartment;
        this.prerequisites = new Vector<>();
        this.teachers = new Vector<>();
        this.students = new Vector<>();
        this.lessons = new Vector<>();
    }

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

    public HashMap<Language, String> getCourseName() {
        return courseName;
    }

    public void setCourseName(HashMap<Language, String> courseName) {
        this.courseName = courseName;
    }

    public String getCourseNameEntry(Language language) {
        return courseName.get(language);
    }

    public void setCourseNameEntry(String courseName, Language language) {
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

    public void removeLesson(Lesson lesson) {
        if (lessons.contains(lesson)) {
            lessons.remove(lesson);
            System.out.println("Урок " + lesson.getLessonId() + " удален с курса " + this.getCourseNameEntry(Language.ENG));
        } else {
            System.out.println("Урок не найден в списке курса.");
        }
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
        System.out.println("Урок " + lesson.getLessonId() + " добавлен на курс " + this.getCourseNameEntry(Language.ENG));
    }

    public void assignTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
            System.out.println("Преподаватель " + teacher.getFirstName() + " " + teacher.getLastName() + " назначен на курс " + this.getCourseNameEntry(Language.ENG));
        }
    }

    public void registerStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Студент " + student.getFirstName() + " " + student.getLastName() + " зарегистрирован на курс " + this.getCourseNameEntry(Language.ENG));
        }
    }
}
