import java.util.*;
import java.util.concurrent.Flow;
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
    private Vector<Manager> managers;
    private Vector<TechSupporter> techSupporters;
    private Vector<Researcher> researchers;
    private Vector<StudentOrganization> organizations;
    private Vector<ResearchPaper> researchPapers;
    private Vector<LogEntry> logs;
    private Vector<Course> courses;
    private Vector<Journal> journals;
    private HashMap<Integer, Object> objects;
    private Vector<Order> orders;

    private Factory factory;

    private Language language = Language.ENG;

    private Hub(){
        this.hubId = 0;
        this.factory = new Factory();
    }

    public Vector<Manager> getManagers() {
        return managers;
    }

    public void setManagers(Vector<Manager> managers) {
        this.managers = managers;
    }

    public Vector<Order> getOrders() {
        return orders;
    }

    public void setOrders(Vector<Order> orders) {
        this.orders = orders;
    }

    public Vector<TechSupporter> getTechSupporters() {
        return techSupporters;
    }

    public void setTechSupporters(Vector<TechSupporter> techSupporters) {
        this.techSupporters = techSupporters;
    }

    public static void setInstance(Hub instance) {
        Hub.instance = instance;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
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

    public void removeUser(User user) {
        if(user instanceof Teacher){
            teachers.remove((Teacher)user);
            users.remove(user);
            if(user.getIsReseacher()){
                researchers.remove((Researcher)user);
            }
            objects.remove(user.getUserId(), user);
            for(Course course: ((Teacher) user).getCourses()){
                course.getTeachers().remove((Teacher)user);
            }
            for(Lesson lesson: ((Teacher) user).getLessons()){
                if(lesson.getTeacher() == user){
                    lesson.setTeacher(null);
                }
            }
            for(Journal journal: user.getJournalSubscriptions()){
                journal.getSubscribers().remove(user);
            }
        }
        else if(user instanceof Student){
            students.remove((Student) user);
            users.remove(user);
            if(user.getIsReseacher()){
                researchers.remove((Researcher)user);
            }
            objects.remove(user.getUserId(), user);
            for(Course course: ((Student) user).getCourses()){
                course.getStudents().remove((Student)user);
            }
            for(Lesson lesson: ((Student) user).getLessons()){
                lesson.getStudents().remove((Student)user);
            }
            for(StudentOrganization studentOrganization: ((Student) user).getOrganizations()){
                studentOrganization.removeMemberDeletion((Student)user);
                if (studentOrganization.getHead() == (Student) user){
                    studentOrganization.setHead(null);
                }
            }
            for(Journal journal: user.getJournalSubscriptions()){
                journal.getSubscribers().remove(user);
            }
        }
        else if(user instanceof Manager){
            managers.remove((Manager) user);
            users.remove(user);
            if(user.getIsReseacher()){
                researchers.remove((Researcher)user);
            }
            objects.remove(user.getUserId(), user);
            for(Journal journal: user.getJournalSubscriptions()){
                journal.getSubscribers().remove(user);
            }
        }
        else if(user instanceof TechSupporter){
            techSupporters.remove((TechSupporter) user);
            users.remove(user);
            if(user.getIsReseacher()){
                researchers.remove((Researcher)user);
            }
            objects.remove(user.getUserId(), user);
        }
    }
    public void addUser(User user) {
        if(user instanceof Teacher){
            teachers.add((Teacher)user);
            users.add(user);
            if(user.getIsReseacher()){
                researchers.add((Researcher)user);
            }
            objects.put(user.getUserId(), user);
        }
        else if(user instanceof Student){
            students.add((Student) user);
            users.add(user);
            if(user.getIsReseacher()){
                researchers.add((Researcher)user);
            }
            objects.put(user.getUserId(), user);
        }
        else if(user instanceof Manager){
            managers.add((Manager) user);
            users.add(user);
            if(user.getIsReseacher()){
                researchers.add((Researcher)user);
            }
            objects.put(user.getUserId(), user);
        }
        else if(user instanceof TechSupporter){
            techSupporters.add((TechSupporter) user);
            users.add(user);
            if(user.getIsReseacher()){
                researchers.add((Researcher)user);
            }
            objects.put(user.getUserId(), user);
        }

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

    

