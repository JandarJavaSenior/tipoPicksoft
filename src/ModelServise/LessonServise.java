package ModelServise;

import Interface.LessonInterface;
import Model.Database;
import Model.Lesson;

public class LessonServise implements LessonInterface {
    private Database database;

    public LessonServise(Database database) {
        this.database = database;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void addlesson_group(String nameGroup, String lessonName, String description) {
        boolean found = false;
        for (int i = 0; i < database.getGroups().size(); i++) {
            if (database.getGroups().get(i).getLessons().equals(nameGroup)) {
                database.getGroups().get(i).getLessons().add(new Lesson(lessonName, description));
                System.out.println("Успешно добавлено!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Урок с именем " + nameGroup + " не найден.");
        }
    }

    @Override
    public void getlesson_name(String nameLesson) {
        boolean found = false;
        for (int i = 0; i < database.getGroups().size(); i++) {
            for (Lesson lesson : database.getGroups().get(i).getLessons()) {
                if (lesson.getLessonName().equals(nameLesson)) {
                    System.out.println(lesson);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Урок с именем " + nameLesson + " не найден.");
        }
    }

    @Override
    public void getAll_lesson_group(String nameGroup) {
        boolean found = false;
        for (int i = 0; i < database.getGroups().size(); i++) {
            if (database.getGroups().get(i).getName().equals(nameGroup)) {
                System.out.println(database.getGroups().get(i).getLessons());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Группа с именем " + nameGroup + " не найдена.");
        }
    }


    }

    @Override
    public void deliteLesson(String nameLesson) {
        boolean found = false;
        for (int i = 0; i < database.getGroups().size(); i++) {
            for (Lesson lesson : database.getGroups().get(i).getLessons()) {
                if (lesson.getLessonName().equals(nameLesson)) {
                    database.getGroups().get(i).getLessons().remove(lesson);
                    System.out.println("Урок успешно удален!");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Урок с именем " + nameLesson + " не найден.");
        }
    }
}
