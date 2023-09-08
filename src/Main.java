import Enam.Gender;
import Model.Database;
import Model.Group;
import Model.Lesson;
import Model.Student;
import ModelServise.GroupServise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Lesson lesson = new Lesson("Java AI","Изучение Искуственного Интелекта");
        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(lesson);

        Student student = new Student("Jandar","Taalaibekov",
                "jt@gmail.com","12345678", Gender.male,lessonList);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);

        Group group = new Group("Java11","Лучший ученик Жандар!",studentList,lessonList);
        List<Group> groupList = new ArrayList<>();
        groupList.add(group);

        Database database = new Database(groupList);
        GroupServise groupServise = new GroupServise(database);
        groupServise.addNewGroup(group);
        groupServise.SetGroupByName("Jandar");
        System.out.println(database.getGroups());



    }
}