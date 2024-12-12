import java.util.Vector;

public class Employee extends User implements Researcher {

    private String position;
    private int employeeId;
    private Vector<Message> messages;
    private boolean isResearcher;
    private Vector<ResearchProject> researcherProjects;
    private Vector<ResearchPaper> researcherPapers;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setMessages(Vector<Message> messages) {
        this.messages = messages;
    }

    public boolean isResearcher() {
        return isResearcher;
    }

    public void setResearcher(boolean researcher) {
        isResearcher = researcher;
    }

    public Vector<ResearchProject> getResearcherProjects() {
        return researcherProjects;
    }

    public void setResearcherProjects(Vector<ResearchProject> researcherProjects) {
        this.researcherProjects = researcherProjects;
    }

    public Vector<ResearchPaper> getResearcherPapers() {
        return researcherPapers;
    }

    public void setResearcherPapers(Vector<ResearchPaper> researcherPapers) {
        this.researcherPapers = researcherPapers;
    }


    public void viewWorkHistory() {
        //TODO
    }
    public Message getMessages() {
        //TODO
        return null;
    }
    public void sendMessage() {
        //TODO
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
