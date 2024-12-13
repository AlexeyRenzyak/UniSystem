import java.util.Date;

public class Comment {

    private News parentNews;
    private Date timestamp;
    private String content;
    private User author;
    private boolean pinned;

    public News getParentNews() {
        return parentNews;
    }

    public void setParentNews(News parentNews) {
        this.parentNews = parentNews;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public void deleteComment() {
        //TODO
    }
    public void pinComment() {
        //TODO
    }
    public void unpinComment() {
        //TODO
    }
    public void editComment(String content) {
        //TODO
    }
    
}
