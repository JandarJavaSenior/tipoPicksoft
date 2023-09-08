package Model;

import java.util.List;

public class Database {
    private List<Group> groups;

    public Database(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Database{" +
                "groups\n" + groups ;
    }
}
