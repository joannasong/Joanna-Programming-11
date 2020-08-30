public class Main {
    public static void main(String[] args) {

        School mainSchool = new School();
        Student a = new Student("a", "A", 12);
        Student b = new Student("b", "B", 11);
        Student c = new Student("c", "C", 10);
        Student d = new Student("d", "D", 9);
        Student e = new Student("e", "E", 8);
        Student f = new Student("f", "F", 7);
        Student g = new Student("g", "G", 6);
        Student h = new Student("h", "H", 5);
        Student i = new Student("i", "I", 4);
        Student j = new Student("j", "J", 3);
        Teacher x = new Teacher("x", "X", "English");
        Teacher y = new Teacher("y", "Y", "Math");
        Teacher z = new Teacher("z", "Z", "Science");

        mainSchool.addStudent(a);
        mainSchool.addStudent(b);
        mainSchool.addStudent(c);
        mainSchool.addStudent(d);
        mainSchool.addStudent(e);
        mainSchool.addStudent(f);
        mainSchool.addStudent(g);
        mainSchool.addStudent(h);
        mainSchool.addStudent(i);
        mainSchool.addStudent(j);
        mainSchool.addTeacher(x);
        mainSchool.addTeacher(y);
        mainSchool.addTeacher(z);

        System.out.println(mainSchool.getStudent());
        System.out.println(mainSchool.getTeacher());

        mainSchool.delStudent(a);
        mainSchool.delStudent(b);
        mainSchool.delStudent(c);
        mainSchool.delTeacher(x);

        System.out.println(mainSchool.getStudent());
        System.out.println(mainSchool.getTeacher());
    }
}
