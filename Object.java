public class Object {
    public static void main(String[] args) {
        String name;
        int rollno;
        int marks;
        //Student[] students = new Student[5];
        Student st = new Student();
        st.name = "keshu";
        System.out.println(st.name);

    }
}

class Student{
    String name;
    int rollno;
    int marks;

}
