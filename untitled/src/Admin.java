import java.util.Date;

public class Admin extends Employee {

    private int adminId;

    public Admin(int employeeId, String firstName, String lastName, String password, String email, String phoneNumber, Date registrationDate, boolean isResearcher, String position, int adminId) {
        super(employeeId, firstName, lastName, password, email, phoneNumber, registrationDate, isResearcher, position);
        this.adminId = adminId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public void viewLogs() {
        for(LogEntry logEntry: Hub.getInstance().getLogs()){
            System.out.println(logEntry);
        }
    }
    public void updateUser(User user, String toUpdate, String newValue) {
        switch (toUpdate){
            case "FirstName":
                user.setFirstName(newValue);
                break;
            case "LastName":
                user.setLastName(newValue);
                break;
            case "Email":
                user.setEmail(newValue);
                break;
            case "Password":
                user.setPassword(newValue);
                break;
            case "Phone":
                user.setPhoneNumber(newValue);
                break;
        }
    }
    public void removeUser(User user) {
        Hub.getInstance().removeUser(user);
    }
    public void addUser(User user) {
        Hub.getInstance().addUser(user);
    }
    
    
}
