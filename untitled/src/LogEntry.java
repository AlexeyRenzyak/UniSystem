import java.io.Serializable;
import java.util.Date;

public class LogEntry implements Serializable {

    private String type;
    private Date date;
    private User user;

    public LogEntry(String type, Date date, User user) {
        this.type = type;
        this.date = date;
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
