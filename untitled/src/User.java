import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;



public abstract class User implements Researcher{

    private int userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phoneNumber;
    private Date registrationDate;
    private boolean isResearcher;
    private Vector<ResearchPaper> researchPapers;
    private Vector<ResearchProject> researchProjects;
    private Vector<Journal> journalSubscriptions;

    public User(int userId, String firstName, String lastName, String password, String email, String phoneNumber, Date registrationDate, boolean isResearcher) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.registrationDate = registrationDate;
        this.isResearcher = isResearcher;
        this.researchPapers = new Vector<>();
        this.researchProjects = new Vector<>();
        this.journalSubscriptions = new Vector<>();
    }

    public void setResearchPapers(Vector<ResearchPaper> researchPapers) {
        this.researchPapers = researchPapers;
    }

    public void setResearchProjects(Vector<ResearchProject> researchProjects) {
        this.researchProjects = researchProjects;
    }

    public boolean isResearcher() {
        return isResearcher;
    }

    public void setResearcher(boolean researcher) {
        isResearcher = researcher;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Vector<Journal> getJournalSubscriptions() {
        return journalSubscriptions;
    }

    public void setJournalSubscriptions(Vector<Journal> journalSubscriptions) {
        this.journalSubscriptions = journalSubscriptions;
    }

    public boolean login(String email, String password) {
        if(email.equals(getEmail()) && password.equals(getPassword())) {
            return true;
        }
        return false;
    }
    public boolean logout(){
        return true;
    }

    @Override
    public void createResearchPaper(String title, Journal journal, int pages, String doi, int citations, Date publicationDate) throws NotResearcherException{
        if(getIsReseacher() == false){
            throw new NotResearcherException("Not a researcher");
        }
        Hub.getInstance().getFactory().createResearchPaper(title, new Vector<Researcher>(Arrays.asList(this)), journal, pages, doi, citations, publicationDate);

    }

    @Override
    public void createResearchProject(String topic, Vector<ResearchPaper> publishedPapers) throws NotResearcherException {
        Hub.getInstance().getFactory().createResearchProject(topic, publishedPapers, new Vector<Researcher>(Arrays.asList(this)));

    }

    @Override
    public boolean getIsReseacher() {
        return isResearcher;
    }

    @Override
    public Vector<ResearchPaper> getResearchPapers() {
        return researchPapers;
    }

    @Override
    public Vector<ResearchProject> getResearchProjects() {
        return researchProjects;
    }

    @Override
    public void joinResearchProject(ResearchProject researchProject) throws NotResearcherException {
        if(getIsReseacher() == false){
            throw new NotResearcherException("Not a researcher");
        }

    }

    @Override
    public void printPapers() throws NotResearcherException {
        if(getIsReseacher() == false){
            throw new NotResearcherException("Not a researcher");
        }

    }

    @Override
    public double calculateHIndex() throws NotResearcherException {
        if(getIsReseacher() == false){
            throw new NotResearcherException("Not a researcher");
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return userId == user.userId && isResearcher == user.isResearcher && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(password, user.password) && Objects.equals(email, user.email) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(registrationDate, user.registrationDate) && Objects.equals(researchPapers, user.researchPapers) && Objects.equals(researchProjects, user.researchProjects) && Objects.equals(journalSubscriptions, user.journalSubscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, password, email, phoneNumber, registrationDate, isResearcher, researchPapers, researchProjects, journalSubscriptions);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}