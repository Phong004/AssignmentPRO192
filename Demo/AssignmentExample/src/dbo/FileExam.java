package dbo;

import java.util.ArrayList;

public interface FileExam {

    void outputToFileStudent(ArrayList list) throws Exception;
    ArrayList inputFromFileStudent() throws Exception;
}
