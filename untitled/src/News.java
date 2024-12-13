import java.util.Vector;

public class News {

    private String title;
    private String content;
    private String topic;
    private Vector<Comment> comments;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Vector getComments() {
        return comments;
    }

    public void setComments(Vector comments) {
        this.comments = comments;
    }

    public void editNews() {
        //TODO
    }
    
    
}
