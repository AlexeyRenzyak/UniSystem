import java.util.Date;
import java.util.Vector;

public class Factory extends ObjectFactory {
    @Override
    public Object create(String name) {
        return null;
    }

    public ResearchPaper createResearchPaper(String title, Vector<Researcher> authors, int pages, String doi, int citations, Date publicationDate) {
        return new ResearchPaper(title, authors, pages, doi, citations, publicationDate);
    }
    public ResearchProject createResearchProject(String topic, Vector<ResearchPaper> publishedPapers, Vector<Researcher> participants){
        return new ResearchProject(topic, publishedPapers, participants);
    }
    public Message createMessage(String content, Employee recipient, Employee sender) {
        return new Message(recipient, sender, new Date(), content);
    }


}
