import java.util.Date;
import java.util.Vector;

public class Lesson {

    private Course course;
    private Teacher teacher;
    private Date scheduledAt;
    private Date endAt;
    private String description;
    private String title;
    private int lessonId;
    private LessonType type;
    private Vector<Student> students;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Date getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(Date scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public LessonType getType() {
        return type;
    }

    public void setType(LessonType type) {
        this.type = type;
    }

    public Vector<Student> getStudents() {
        return students;
    }

    public void setStudents(Vector<Student> students) {
        this.students = students;
    }

    public String getLessonDetails() {
        //TODO
        return "";
    }

    public void assignTeacher(Teacher teacher) {
        //TODO
    }

    public void deassignTeacher(Teacher teacher) {
        //TODO
    }
    public void updateLesson() {
        //TODO
    }
    public void scheduleLesson() {
        //TODO
    }
    
    
}
