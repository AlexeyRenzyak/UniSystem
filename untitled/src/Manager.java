import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {

    private Vector<Course> managedCourses;
    private int managerId;
    private ManagerType managerType;
    private Vector<Request> requests;
    private Vector<Complaint> complaints;

    public Manager(int employeeId, String firstName, String lastName, String password, String email, String phoneNumber, Date registrationDate, boolean isResearcher, String position, int managerId, ManagerType managerType) {
        super(employeeId, firstName, lastName, password, email, phoneNumber, registrationDate, isResearcher, position);
        this.managerId = managerId;
        this.managerType = managerType;
    }

    public Vector<Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(Vector<Complaint> complaints) {
        this.complaints = complaints;
    }

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

    public void addRequest(Request request) {
        requests.add(request);
        System.out.println("Request added: " + request);
    }

    public void manageNews(String news) {
        System.out.println("News managed: " + news);
    }

    public void viewRequests() {
        for (Request request : requests) {
            System.out.println("Request Content: " + request.getContent() + " | Status: " + (request.getSignedBy()==null ? "Approved" : "Pending"));
        }
    }

    public String createReport() {
        StringBuilder report = new StringBuilder();
        report.append("Manager Report for ").append(managerId).append("\n");
        report.append("Courses Managed:\n");
        for (Course course : managedCourses) {
            report.append("- ").append(course.getCourseNameEntry(Language.ENG)).append("\n");
        }
        return report.toString();
    }

    public void assignCourse(Teacher teacher, Course course) {
        if (!managedCourses.contains(course)) {
            managedCourses.add(course);
            course.assignTeacher(teacher);
            System.out.println("Course " + course.getCourseNameEntry(Language.ENG) + " assigned to teacher " + teacher.getFirstName());
        }
    }

    public void deassignCourse(Teacher teacher, Course course) {
        if (managedCourses.contains(course)) {
            managedCourses.remove(course);
            course.getTeachers().remove(teacher);
            System.out.println("Course " + course.getCourseNameEntry(Language.ENG) + " deassigned from teacher " + teacher.getFirstName());
        }
    }

    public void addCourseToPool(Course course) {
        managedCourses.add(course);
        System.out.println("Course " + course.getCourseNameEntry(Language.ENG) + " added to course pool.");
    }

    public void receiveComplaint(Complaint complaint) {
        complaints.add(complaint);
        System.out.println("Complaint received: " + complaint);
    }

    public void seeComplaints() {
        for (Complaint complaint : complaints) {
            System.out.println("Complaint: " + complaint);
        }
    }
}


