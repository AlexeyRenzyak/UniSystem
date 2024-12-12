import java.util.Vector;

public class ResearchProject {

    private String topic;
    private Vector<ResearchPaper> publishedPapers ;
    private Vector<Researcher> participants ;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Vector<ResearchPaper> getPublishedPapers() {
        return publishedPapers;
    }

    public void setPublishedPapers(Vector<ResearchPaper> publishedPapers) {
        this.publishedPapers = publishedPapers;
    }

    public void setParticipants(Vector<Researcher> participants) {
        this.participants = participants;
    }

    public boolean removeParticipant() {
        //TODO
        return false;
    }
    public Vector<Researcher> getParticipants() {
        //TODO
        return null;
    }
    
    
}
