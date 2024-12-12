import java.util.Date;
import java.util.Vector;

public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phoneNumber;
    private Date registrationDate;
    private Vector<Journal> journalSubscriptions;


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

    public boolean login() {
        //TODO
        return false;
    }
    public boolean logout() {
        //TODO
        return false;
    }
    
    
}
