package ModelServise;

import Interface.StudentInterface;
import Model.Database;
import Model.Student;

public class StudentServise implements StudentInterface {
    private Database database;

    public StudentServise(Database database) {
        this.database = database;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void addnewStudentAgroup(Student student, String name) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if(database.getGroups().get(i).getName().equals(name)){
                database.getGroups().get(i).getStudents().add(student);
                System.out.println("Успешно добавлен");
            }
        }
    }

    @Override
    public void updateStudentGroup(String oldname, String newname, String nameGrooup) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if(database.getGroups().get(i).getName().equals(nameGrooup)
                    &&database.getGroups().get(i).getStudents().get(i).getName().equals(oldname)){
                 database.getGroups().get(i).getStudents().get(i).setName(newname);
                System.out.println("Обнавлен");
            }
        }
    }

    @Override
    public void findStudentfirstName(String name, String nameGroup) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if(database.getGroups().get(i).getName().equals(nameGroup)
                    &&database.getGroups().get(i).getStudents().get(i).getLastname().equals(name)){
                System.out.println(database.getGroups().get(i).getStudents().get(i));
            }
        }
    }

    @Override
    public void det_all_student_group_name(String group_name) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if(database.getGroups().get(i).getName().equals(group_name)){
                System.out.println(database.getGroups().get(i).getStudents());
            }

        }
    }

    @Override
    public void get_all_student_lesson(String group_name) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if(database.getGroups().get(i).getStudents().get(i).getLessons().get(i).getLessonName().equals(group_name)){
                System.out.println(database.getGroups().get(i).getStudents().get(i).getLessons().get(i).getLessonName());
            }
        }
    }

    @Override
    public void detlit_student(String name) {
        for (int i = 0; i <database.getGroups().size() ; i++) {
            if(database.getGroups().get(i).getStudents().get(i).getName().equals(name)){
                database.getGroups().get(i).getStudents().remove(database.getGroups().get(i).getStudents().get(i));
                System.out.println("Успешно удален!");
            }
        }
    }


}
