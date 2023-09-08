package Model;

import java.util.List;

public class Group {
    private int id;
    private String name;
    private String description;
    private List<Student> students;
    private List<Lesson> lessons;
    private static int idd = 1;

    public Group(String name, String description, List<Student> students, List<Lesson> lessons) {
        this.id = idd++;
        this.name = name;
        this.description = description;
        this.students = students;
        this.lessons = lessons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Group.idd = idd;
    }

    @Override
    public String toString() {
        return "Model.Group  " +
                "id  " + id +
                "name  " + name + '\'' +
                "description  " + description + '\'' +
                "students  \n" + students +
                "lessons  \n" + lessons+"\n\n";
    }
}
