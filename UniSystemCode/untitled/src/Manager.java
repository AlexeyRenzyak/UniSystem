import java.util.Vector;

public class Manager extends Employee {

    private Vector<Course> managedCourses;
    private int managerId;
    private ManagerType managerType;
    private Vector<Request> requests;

    public Vector<Course> getManagedCourses() {
        return managedCourses;
    }

    public void setManagedCourses(Vector<Course> managedCourses) {
        this.managedCourses = managedCourses;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public ManagerType getManagerType() {
        return managerType;
    }

    public void setManagerType(ManagerType managerType) {
        this.managerType = managerType;
    }

    public Vector<Request> getRequests() {
        return requests;
    }

    public void setRequests(Vector<Request> requests) {
        this.requests = requests;
    }

    public void manageNews() {
        //TODO
    }
    public void viewRequests() {
        //TODO
    }
    public String createReport() {
        //TODO
        return "";
    }
    public void assignCourse() {
        //TODO
    }
    public void deassignCourse() {
        //TODO
    }
    public void addCourseToPool() {
        //TODO
    }
    
    
}
