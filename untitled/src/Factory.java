import java.util.Date;
import java.util.Vector;

public class Factory extends ObjectFactory {
    @Override
    public void create() {
        Hub.getInstance().setObjectIdCounter(Hub.getInstance().getObjectIdCounter() + 1);
    }

    public ResearchPaper createResearchPaper(String title, Vector<Researcher> authors, int pages, String doi, int citations, Date publicationDate) {
        create();
        ResearchPaper result = new ResearchPaper(title, authors, pages, doi, citations, publicationDate);
        return result;
    }
    public ResearchProject createResearchProject(String topic, Vector<ResearchPaper> publishedPapers, Vector<Researcher> participants){
        create();
        ResearchProject result = new ResearchProject(topic, publishedPapers, participants);
        return result;
    }
    public Message createMessage(String content, User recipient, User sender) {
        create();
        Message result = new Message(recipient, sender, new Date(), content);
        return result;
    }

    public Complaint createComplaint(String content, Manager recipient, Teacher sender,ComplaintUrgency urgency, Vector<Student> objects) {
        create();
        Complaint result = new Complaint(recipient, sender, new Date(), content, urgency, objects);
        return result;
    }

    public News createNews(String title, String content, String topic, Date date){
        create();
        News result = new News(Hub.getInstance().getObjectIdCounter(), title, content, topic, date);
        return result;
    }

    public Mark createMark(int value, int studentId, String courseId, MarkType markType, MarkTypeAttestation markTypeAttestation){
        create();
        Mark result = new Mark(value, studentId, courseId, markType, markTypeAttestation);
        return result;
    }
    public LogEntry createLogEntry(String type, Date date, User user){
        create();
        LogEntry result = new LogEntry(type, date, user);
        return result;
    }

    public Student createStudent(String firstName, String lastName, String password, String email, String phoneNumber, Date registrationDate, boolean isResearcher, String major, StudentType studentType, int year, String school){
        create();
        Student result = new Student(Hub.getInstance().getObjectIdCounter(), firstName, lastName, password, email, phoneNumber, registrationDate, isResearcher, major, studentType, year, school);
        return result;
    }




}
