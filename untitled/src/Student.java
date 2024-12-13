import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.Vector;

public class Student extends User{

    private String major;
    private int studentId;
    private int maxCredits = 21;
    private StudentType studentType;
    private int year;
    private Researcher supervisor;
    private Vector<Course> courses;
    private Vector<Course> completedCourses;
    private Vector<Course> pendingCourses;
    private HashMap<Course, Vector<Mark>> marks;
    private Vector<StudentOrganization> organizations;

    public Student(int studentId, String firstName, String lastName, String password, String email, String phoneNumber, Date registrationDate, boolean isResearcher, String major, StudentType studentType, int year) {
        super(studentId, firstName, lastName, password, email, phoneNumber, registrationDate, isResearcher);
        this.major = major;
        this.studentId = studentId;
        this.studentType = studentType;
        this.year = year;
        this.completedCourses = new Vector<>();
        this.courses = new Vector<>();
        this.pendingCourses = new Vector<>();
        this.marks = new HashMap<Course, Vector<Mark>>();
        this.organizations = new Vector<>();
    }

    public Vector<Course> getPendingCourses() {
        return pendingCourses;
    }

    public void setPendingCourses(Vector<Course> pendingCourses) {
        this.pendingCourses = pendingCourses;
    }

    public Vector<Course> getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(Vector<Course> completedCourses) {
        this.completedCourses = completedCourses;
    }

    public Researcher getSupervisor() {
        return supervisor;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMaxCredits() {
        return maxCredits;
    }

    public void setMaxCredits(int maxCredits) {
        this.maxCredits = maxCredits;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    public HashMap<Course, Vector<Mark>> getMarks() {
        return marks;
    }

    public void setMarks(HashMap<Course, Vector<Mark>> marks) {
        this.marks = marks;
    }


    public Vector<StudentOrganization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Vector<StudentOrganization> organizations) {
        this.organizations = organizations;
    }

    public String getTranscript() {
        //AWAITING MARKS IMPLEMENTATION
        return null;
    }

    public void viewTranscript() {
        //AWAITING MARKS IMPLEMENTATION
    }

    public void viewMarks() {
        //AWAITING MARKS IMPLEMENTATION
    }

    public void rateTeacher(Teacher teacher, Integer rating) {
        teacher.addRating(rating);
    }
    public void viewTeacherInfo(Course course) {
        for(Teacher teacher : course.getTeachers()) {
            System.out.println(teacher);
        }
    }
    public void leaveOrganziation(StudentOrganization organization) {
        organization.removeMember(this);
    }
    public void joinOrganization(StudentOrganization organization) {
        organization.addMember(this);
    }
    public void registerCourse(Course course) {   //Requires fleshing out with course types, etc.
        if(!pendingCourses.contains(course)) {
            if(getPendingCredits()+course.getCredits() <= maxCredits) {
                pendingCourses.add(course);
            }
        }
    }

    private int getPendingCredits(){
        int result = 0;
        for(Course course : pendingCourses) {
            result += course.getCredits();
        }
        return result;
    }

    public Vector<ResearchPaper> getDiplomaProject() {
        return getResearchPapers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentId == student.studentId && maxCredits == student.maxCredits && year == student.year && Objects.equals(major, student.major) && studentType == student.studentType && Objects.equals(supervisor, student.supervisor) && Objects.equals(courses, student.courses) && Objects.equals(completedCourses, student.completedCourses) && Objects.equals(pendingCourses, student.pendingCourses) && Objects.equals(marks, student.marks) && Objects.equals(organizations, student.organizations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), major, studentId, maxCredits, studentType, year, supervisor, courses, completedCourses, pendingCourses, marks, organizations);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentType=" + getStudentType() +
                ", year=" + getYear() +
                ", supervisor=" + getSupervisor() +
                ", studentId=" + getStudentId() +
                ", major='" + getMajor() + '\'' +
                ", researcher=" + isResearcher() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", registrationDate=" + getRegistrationDate() +
                '}';
    }
}
