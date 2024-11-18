public class Student {
    int id;
    String name;

    Student(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }
    void details(){
        System.out.println(id);
        System.err.println(name);
    }

}
