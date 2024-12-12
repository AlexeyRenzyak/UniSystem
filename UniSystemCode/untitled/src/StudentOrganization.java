import java.util.Vector;

public class StudentOrganization {

    private String name;
    private String description;
    private Vector<Student> members;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vector<Student> getMembers() {
        return members;
    }

    public void setMembers(Vector<Student> members) {
        this.members = members;
    }
}
