
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessStudent extends ArrayList<Student> {

    public void sortStudent() {
        //TODO: you should do sort list l here
        Collections.sort(this);
    }

    public List<Student> findByPartialName(String letter) {
        ArrayList<Student> filteredL = new ArrayList();
        //TODO: you should return filtered List of student by name here
        for (Student stu : this) {
            if (stu.name.trim().toLowerCase().contains(letter.trim().toLowerCase())) {
                filteredL.add(stu);
            }
        }
        return filteredL;
    }

    public List<Student> findHigherGpa(int gpa) {
        ArrayList<Student> filteredL = new ArrayList();
        //TODO: you should filter whose gpa are higher than given gpa here
        for (Student stu : this) {
            if (stu.gpa > gpa) {
                filteredL.add(stu);
            }
        }
        return filteredL;
    }
}
