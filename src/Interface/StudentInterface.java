package Interface;

import Model.Student;

public interface StudentInterface {

    public void addnewStudentAgroup(Student student, String name);
    public void updateStudentGroup(String oldname,String newname,String nameGrooup);
    public void findStudentfirstName(String name, String nameGroup);
    public void det_all_student_group_name(String group_name);
    public void get_all_student_lesson(String group_name);
    public void detlit_student(String name);


}
