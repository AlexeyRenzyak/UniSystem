import java.util.HashMap;
import java.util.Vector;

public class Hub {

    private int hubId;
    private String name;
    private int userIdCounter;
    private int studentIdCounter;
    private int orderIdCounter;
    private int newsIdCounter;
    private int messageIdCounter;
    private int employeeIdCounter;
    private int managerIdCounter;
    private int supportIdCounter;
    private int teacherIdCounter;
    private int journalIdCounter;
    private HashMap<Course, HashMap<String, CourseType>> majorCoursesMap;
    private Vector<News> news;
    private Vector<User> users;
    private Vector<Teacher> teachers;
    private Vector<Student> students;
    private Vector<Researcher> researchers;
    private Vector<StudentOrganization> organizations;
    private Vector<ResearchPaper> researchPapers;
    private Vector<LogEntry> logs;
    private Vector<Course> courses;
    private Vector<Journal> journals;

    public int getHubId() {
        return hubId;
    }

    public void setHubId(int hubId) {
        this.hubId = hubId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserIdCounter() {
        return userIdCounter;
    }

    public void setUserIdCounter(int userIdCounter) {
        this.userIdCounter = userIdCounter;
    }

    public int getStudentIdCounter() {
        return studentIdCounter;
    }

    public void setStudentIdCounter(int studentIdCounter) {
        this.studentIdCounter = studentIdCounter;
    }

    public int getOrderIdCounter() {
        return orderIdCounter;
    }

    public void setOrderIdCounter(int orderIdCounter) {
        this.orderIdCounter = orderIdCounter;
    }

    public int getNewsIdCounter() {
        return newsIdCounter;
    }

    public void setNewsIdCounter(int newsIdCounter) {
        this.newsIdCounter = newsIdCounter;
    }

    public int getMessageIdCounter() {
        return messageIdCounter;
    }

    public void setMessageIdCounter(int messageIdCounter) {
        this.messageIdCounter = messageIdCounter;
    }

    public int getEmployeeIdCounter() {
        return employeeIdCounter;
    }

    public void setEmployeeIdCounter(int employeeIdCounter) {
        this.employeeIdCounter = employeeIdCounter;
    }

    public int getManagerIdCounter() {
        return managerIdCounter;
    }

    public void setManagerIdCounter(int managerIdCounter) {
        this.managerIdCounter = managerIdCounter;
    }

    public int getSupportIdCounter() {
        return supportIdCounter;
    }

    public void setSupportIdCounter(int supportIdCounter) {
        this.supportIdCounter = supportIdCounter;
    }

    public int getTeacherIdCounter() {
        return teacherIdCounter;
    }

    public void setTeacherIdCounter(int teacherIdCounter) {
        this.teacherIdCounter = teacherIdCounter;
    }

    public int getJournalIdCounter() {
        return journalIdCounter;
    }

    public void setJournalIdCounter(int journalIdCounter) {
        this.journalIdCounter = journalIdCounter;
    }

    public HashMap<Course, HashMap<String, CourseType>> getMajorCoursesMap() {
        return majorCoursesMap;
    }

    public void setMajorCoursesMap(HashMap<Course, HashMap<String, CourseType>> majorCoursesMap) {
        this.majorCoursesMap = majorCoursesMap;
    }

    public Vector<News> getNews() {
        return news;
    }

    public void setNews(Vector<News> news) {
        this.news = news;
    }

    public Vector<User> getUsers() {
        return users;
    }

    public void setUsers(Vector<User> users) {
        this.users = users;
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

    public Vector<Researcher> getResearchers() {
        return researchers;
    }

    public void setResearchers(Vector<Researcher> researchers) {
        this.researchers = researchers;
    }

    public Vector<StudentOrganization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Vector<StudentOrganization> organizations) {
        this.organizations = organizations;
    }

    public Vector<ResearchPaper> getResearchPapers() {
        return researchPapers;
    }

    public void setResearchPapers(Vector<ResearchPaper> researchPapers) {
        this.researchPapers = researchPapers;
    }

    public Vector<LogEntry> getLogs() {
        return logs;
    }

    public void setLogs(Vector<LogEntry> logs) {
        this.logs = logs;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    public Vector<Journal> getJournals() {
        return journals;
    }

    public void setJournals(Vector<Journal> journals) {
        this.journals = journals;
    }

    public void removeMember() {
        //TODO
    }
    public void addMember() {
        //TODO
    }
    public void addLesson() {
        //TODO
    }
    public void addNews() {
        //TODO
    }
    
    
}
