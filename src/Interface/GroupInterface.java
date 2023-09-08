package Interface;

import Model.Group;

public interface GroupInterface {
    public void addNewGroup(Group group);
    public void SetGroupByName (String name);
    public void UpdateGroupName(String name);
    public void DeleteGroupName(String name);
}
