package collectiondemo.set;

import java.util.TreeSet;

public class StudentTree extends TreeSet<Student> {

    public StudentTree() {
        super();
    }

    public Student search(String id) {
        Student searchStd = new Student(id);
        Student found = this.ceiling(searchStd);
        if (found.getCode().compareTo(id) == 0) {
            return found;
        }
        return null;
    }
}
