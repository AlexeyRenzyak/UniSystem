import java.util.Date;
import java.util.Scanner;

public abstract class Command {
    private boolean error = false;
    private Hub hub = Hub.getInstance();
    public abstract void printInstruction();
    public abstract void receiveArguments();
    public abstract void execute();

    public Hub getHub() {
        return hub;
    }

    public void setHub(Hub hub) {
        this.hub = hub;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}

class LanguageCommand extends Command {
    private Language language;
    private String input;

    @Override
    public void printInstruction() {
        System.out.println("Choose language: type KAZ, ENG or RUS");
    }

    @Override
    public void execute() {
        receiveArguments();
        if(isError()){
            setError(false);
            return;
        }
        getHub().setLanguage(language);
    }

    @Override
    public void receiveArguments() {
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("KAZ")){
                language = Language.KAZ;
            }
            else if(input.equalsIgnoreCase("ENG")){
                language = Language.ENG;
            }
            else if(input.equalsIgnoreCase("RUS")){
                language = Language.RUS;
            }
            else{
                language = Language.ENG;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            setError(true);
        }
    }
}

class LogInCommand extends Command {
    private String email;
    private String password;

    @Override
    public void printInstruction() {
        if(Hub.getInstance().getLanguage() == Language.RUS) {
            System.out.println("Добро пожаловать в UniSystem! Необходимо войти в систему. Введите почту, затем пароль");
        }
        else if(Hub.getInstance().getLanguage() == Language.KAZ) {
            System.out.println("-----");
        }
        else {
            System.out.println("Welcome to UniSystem! You need to log into the system. Enter email, then password");
        }
    }

    @Override
    public void execute() {
        receiveArguments();
        if(isError()){
            setError(false);
            return;
        }
        getHub().loggedUser = getHub().logIn(email, password);
        if(getHub().loggedUser != null) {
            getHub().addLogEntry(getHub().getFactory().createLogEntry("Log in", new Date(), getHub().loggedUser));
        }
    }

    @Override
    public void receiveArguments() {
        Scanner scanner = new Scanner(System.in);
        try {
            email = scanner.nextLine();
        }
        catch(Exception e) {
            e.printStackTrace();
            setError(true);
        }
        try {
            password = scanner.nextLine();
        }
        catch(Exception e) {
            e.printStackTrace();
            setError(true);
        }
    }
}

class ManageUsersCommand extends Command {
    private Language language;
    private String input;

    @Override
    public void printInstruction() {
        if(Hub.getInstance().getLanguage() == Language.RUS) {
            System.out.println("Изменение пользователей. Введите тип запроса (ADD - добавить, REMOVE - убрать, CHANGE - поменять), затем пароль");
        }
        else if(Hub.getInstance().getLanguage() == Language.KAZ) {
            System.out.println("-----");
        }
        else {
            System.out.println("Welcome to UniSystem! You need to log into the system. Enter email, then password");
        }
    }

    @Override
    public void execute() {
        receiveArguments();
        if(isError()){
            setError(false);
            return;
        }
        getHub().setLanguage(language);
    }

    @Override
    public void receiveArguments() {
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("KAZ")){
                language = Language.KAZ;
            }
            else if(input.equalsIgnoreCase("ENG")){
                language = Language.ENG;
            }
            else if(input.equalsIgnoreCase("RUS")){
                language = Language.RUS;
            }
            else{
                language = Language.ENG;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            setError(true);
        }
    }
}

class SeeLogsCommand extends Command {
    private Admin admin = (Admin) getHub().loggedUser;

    @Override
    public void printInstruction() {
        if(Hub.getInstance().getLanguage() == Language.RUS) {
            System.out.println("Просматриваем логи...");
        }
        else if(Hub.getInstance().getLanguage() == Language.KAZ) {
            System.out.println("-----");
        }
        else {
            System.out.println("Seeing logs...");
        }
    }

    @Override
    public void execute() {
        admin.viewLogs();
    }

    @Override
    public void receiveArguments() {
    }
}

class SeeCoursesCommand extends Command {
    private Teacher teacher = (Teacher) getHub().loggedUser;
    @Override
    public void printInstruction() {
        if(Hub.getInstance().getLanguage() == Language.RUS) {
            System.out.println("Просматриваем курсы, которые преподаются Вами...");
        }
        else if(Hub.getInstance().getLanguage() == Language.KAZ) {
            System.out.println("-----");
        }
        else {
            System.out.println("Seeing courses where you teach...");
        }
    }

    @Override
    public void execute() {
        teacher.viewCourses();
    }

    @Override
    public void receiveArguments() {
    }
}

class CourseStudentManagementCommand extends Command{
    private Teacher teacher = (Teacher) getHub().loggedUser;
    @Override
    public void printInstruction() {
        if(Hub.getInstance().getLanguage() == Language.RUS) {
            System.out.println("Вы можете добавить и снять");
        }
        else if(Hub.getInstance().getLanguage() == Language.KAZ) {
            System.out.println("-----");
        }
        else {
            System.out.println("Seeing courses where you teach...");
        }
    }

    @Override
    public void execute() {
        teacher.viewCourses();
    }

    @Override
    public void receiveArguments() {
    }
}

class StudentAddMarkCommand extends Command{
    private Teacher teacher = (Teacher) getHub().loggedUser;
    private Student student;
    @Override
    public void printInstruction() {
        if(Hub.getInstance().getLanguage() == Language.RUS) {
            System.out.println("");
        }
        else if(Hub.getInstance().getLanguage() == Language.KAZ) {
            System.out.println("-----");
        }
        else {
            System.out.println("Adding Marks for students: \n 1)");
        }
    }

    @Override
    public void execute() {
        receiveArguments();
        if(isError()){
            setError(false);
            return;
        }
        teacher.viewCourses();
    }


    @Override
    public void receiveArguments() {
        Scanner scanner = new Scanner(System.in);
    }

}
