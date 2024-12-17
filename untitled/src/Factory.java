import java.util.Date;
import java.util.Vector;

public class Factory extends ObjectFactory {
    @Override
    public Object create(String name) {
        return null;
    }

    public ResearchPaper createResearchPaper(String title, Vector<Researcher> authors, int pages, String doi, int citations, Date publicationDate) {
        ResearchPaper result = new ResearchPaper(title, authors, pages, doi, citations, publicationDate);
        return result;
    }
    public ResearchProject createResearchProject(String topic, Vector<ResearchPaper> publishedPapers, Vector<Researcher> participants){
        ResearchProject result = new ResearchProject(topic, publishedPapers, participants);
        return result;
    }
    public Message createMessage(String content, User recipient, User sender) {
        Message result = new Message(recipient, sender, new Date(), content);
        return result;
    }

    public News createNews(int newsId, String title, String content, String topic, Date date){
        News result = new News(newsId, title, content, topic, date);
        return result;
    }


}
