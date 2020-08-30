//contains each student's first and last name, grade, and id number
public class Student {
    private String studentFirst;
    private String studentLast;
    private int grade;
    private static int tempId = 0;
    private int idNum;

    //creates a new student with the given first name, last name, and grade; assigns them an id number
    Student(String studentFirst, String studentLast, int grade){
        this.studentFirst = studentFirst;
        this.studentLast = studentLast;
        this.grade = grade;
        idNum = tempId;
        tempId++;
    }

    //returns the student's full name and grade when the object is printed
    public String toString(){
        return "Name: " + studentFirst + " " + studentLast + "\t Grade: " + grade;
    }

    public String getStudentFirst() {
        return studentFirst;
    }

    public void setStudentFirst(String studentFirst) {
        this.studentFirst = studentFirst;
    }

    public String getStudentLast() {
        return studentLast;
    }

    public void setStudentLast(String studentLast) {
        this.studentLast = studentLast;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
}
