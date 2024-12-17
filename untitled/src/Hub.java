import java.util.*;
import java.util.stream.Collectors;

public class Hub {

    private static Hub instance;

    private int hubId;
    private String name;
    private int objectIdCounter;
    private HashMap<Course, HashMap<String, CourseType>> majorCoursesMap;
    private Vector<News> news;
    private Vector<User> users;
    private HashMap<String, User> credentials;
    private Vector<Teacher> teachers;
    private Vector<Student> students;
    private Vector<Researcher> researchers;
    private Vector<StudentOrganization> organizations;
    private Vector<ResearchPaper> researchPapers;
    private Vector<LogEntry> logs;
    private Vector<Course> courses;
    private Vector<Journal> journals;
    private HashMap<Integer, Object> objects;

    private Factory factory;

    private Hub(){
        this.hubId = 0;
        this.factory = new Factory();
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public static Hub getInstance(){
        if(instance == null){
            instance = new Hub();
        }
        return instance;
    }

    public HashMap<String, User> getCredentials() {
        return credentials;
    }

    public void setCredentials(HashMap<String, User> credentials) {
        this.credentials = credentials;
    }

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

    public int getObjectIdCounter() {
        return objectIdCounter;
    }

    public void setObjectIdCounter(int objectIdCounter) {
        this.objectIdCounter = objectIdCounter;
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

    public HashMap<Integer, Object> getObjects() {
        return objects;
    }

    public void setObjects(HashMap<Integer, Object> objects) {
        this.objects = objects;
    }

    public void removeUser() {
        //TODO
    }
    public void addUser() {
        //TODO
    }
    public void addLesson() {
        //TODO
    }
    public void addNews() {
        //TODO
    }

    public void printAllPapers(Comparator c){
        Collections.sort(researchPapers, c);
        for(ResearchPaper rp : researchPapers){
            System.out.println(rp.toString());
        }
    }

    public void topCitedResearchers(){
        Vector<Student> studentResearchers = new Vector<>();
        for(Student s : students){
            if(s.isResearcher()) {
                studentResearchers.add(s);
            }

        }
        Map<String, Student> topResearchersBySchool = studentResearchers.stream()
                .collect(Collectors.groupingBy(
                        Student::getSchool,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Researcher::getAllCitations)),
                                Optional::get
                        )
                ));
        System.out.println("Top Researchers by School:");
        topResearchersBySchool.forEach((school, researcher) ->
                System.out.println("School: " + school + ", Top Researcher: " + researcher));
    }

    public void printAllNews(){
        Collections.sort(news, new NewsComparator());
        for(News n : news){
            System.out.println(n.toString());
        }
        Researcher topResearcher = topCitedResearcher();
        if (topResearcher != null) {
            News generatedNews = new News(0, "Top Cited Researcher", topCitedResearcher().toString(), "Generated", new Date());
            System.out.println(generatedNews.toString());
        }

    }


    public Researcher topCitedResearcher(){
        if (researchers.size() == 0){
            return null;
        }
        Collections.sort(researchers, Comparator.comparingInt(Researcher::getAllCitations));
        return researchers.get(0);
    }
}

    

