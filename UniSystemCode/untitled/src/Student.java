import java.util.HashMap;
import java.util.Vector;

public class Student extends User implements Researcher {

    private String major;
    private int studentId;
    private int maxCredits;
    private StudentType studentType;
    private int year;
    private boolean isResearcher;
    private Vector<Course> courses;
    private HashMap<Course, Vector<Mark>> marks;
    private Vector<ResearchPaper> researcherPapers;
    private Vector<ResearchProject> researcherProjects;
    private Vector<ResearchProject> organizations;

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

    public boolean isResearcher() {
        return isResearcher;
    }

    public void setResearcher(boolean researcher) {
        isResearcher = researcher;
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

    public Vector<ResearchPaper> getResearcherPapers() {
        return researcherPapers;
    }

    public void setResearcherPapers(Vector<ResearchPaper> researcherPapers) {
        this.researcherPapers = researcherPapers;
    }

    public Vector<ResearchProject> getResearcherProjects() {
        return researcherProjects;
    }

    public void setResearcherProjects(Vector<ResearchProject> researcherProjects) {
        this.researcherProjects = researcherProjects;
    }

    public Vector<ResearchProject> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Vector<ResearchProject> organizations) {
        this.organizations = organizations;
    }

    public Mark getTranscript() {
        //TODO
        return null;
    }
    public void viewMarks() {
        //TODO
    }
    public void rateTeacher() {
        //TODO
    }
    public void viewTeacherInfo() {
        //TODO
    }
    public void leaveOrganziation() {
        //TODO
    }
    public void joinOrganization() {
        //TODO
    }
    public void registerCourse() {
        //TODO
    }
    public Vector<ResearchPaper> getDiplomaProject() {
        //TODO
        return null;
    }

    @Override
    public void createResearchPaper(ResearchPaper parameter) {

    }

    @Override
    public void createResearchProject(ResearchProject parameter) {

    }

    @Override
    public boolean getIsReseacher() {
        return false;
    }

    @Override
    public Vector<ResearchPaper> getResearchPapers() {
        return null;
    }

    @Override
    public Vector<ResearchPaper> getResearchProjects() {
        return null;
    }

    @Override
    public void joinResearchProject(ResearchProject parameter) {

    }

    @Override
    public void printPapers() {

    }

    @Override
    public void updateResearchProject(ResearchProject parameter, String parameter2) {

    }
}
