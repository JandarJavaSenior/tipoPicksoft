package ModelServise;

import Interface.GroupInterface;
import Model.Database;
import Model.Group;

public class GroupServise implements GroupInterface {
    private Database database;

    public GroupServise(Database database) {
        this.database = database;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void addNewGroup(Group group) {
        database.getGroups().add(group);
        System.out.println("Вы добавили новую группу!");
    }

    @Override
    public void SetGroupByName(String name) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if(database.getGroups().get(i).getName().contains(name)){
                System.out.println(database.getGroups().get(i));
            }else {
                System.out.println("Нет такой группы");
            }
        }
    }

    @Override
    public void UpdateGroupName(String name) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if(database.getGroups().get(i).getName().contains(name)){
                database.getGroups().get(i).setName(name);
                System.out.println("Успешно заменен!");
                System.out.println(database.getGroups().get(i));
            }else {
                System.out.println("Нет такой группы");
            }
        }
    }

    @Override
    public void DeleteGroupName(String name) {
        for (int i = 0; i < database.getGroups().size(); i++) {
            if(database.getGroups().get(i).getName().equals(name)){
                database.getGroups().remove(name);
                System.out.println("Успешно удален!");
            }else {
                System.out.println("Нет такой группы");
            }
        }
    }


}
