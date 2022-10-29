import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        long csv = 2;
        boolean tf = true;
        char birthday = 'b';

        Integer e = 1;
        Long f = Long.valueOf("2");
        Long i = 2L;
        Boolean g = null;
        String h = "test";

        Student Maciek = new Student("Maciek", 21);
        Student Karol = new Student("Karol", 19);
        Student Dummy = new Student("DummyD", 120);

        List<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(Maciek);
        studentArrayList.add(Karol);
        studentArrayList.add(Dummy);

        List<Student> studentList = List.of(Maciek, Karol, Dummy);

        System.out.println(Maciek);
        System.out.println(Karol);

        for (int ii = 0; ii < studentList.size(); ii++){
            System.out.println(studentList.get(ii).getName());
        }

        for (Student student : studentList) {
            System.out.println(student.getName());
        }
        try {
//            throw new StudentException();
        } catch (StudentException se) {
            System.out.println("I caught an exception!");
        } finally {
            System.out.println("Finaly");
        }
    }
}

