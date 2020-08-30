/*contains both a teacher and student array, as well as a each student's and teacher's
first and last name and the list of all teachers/students
 */
import java.util.ArrayList;

public class School {
    //student/teacher first name
    private String firstName;
    //student/teacher last name
    private String lastName;
    //list of all teachers'/students' names
    private String nameList;
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();


    School(){
        firstName = "";
        lastName = "";
        nameList = "";
    }

    //adds given teacher object to the end of the teachers array
    public void addTeacher(Teacher teacherName){
        teachers.add(teacherName);
    }

    //deletes given teacher object from the teachers array
    public void delTeacher(Teacher teacherName){
        teachers.remove(teacherName);
    }

    //gets the first and last name of each teacher in the teachers array and prints out a list of all their names
    public String getTeacher(){
        firstName = "";
        lastName = "";
        nameList = "";
        for(int i = 0; i < teachers.size(); i++){
            firstName = teachers.get(i).getTeacherFirst();
            lastName = teachers.get(i).getTeacherLast();
            nameList += firstName + " " + lastName + "\n";
        }
        return nameList;
    }

    //adds given student object to the end of the student array
    public void addStudent(Student studentName){
        students.add(studentName);
    }

    //deletes given student object from the student array
    public void delStudent(Student studentName){
        students.remove(studentName);
    }

    //gets the first and last name of each student in the student array and prints out a list of all their names
    public String getStudent(){
        firstName = "";
        lastName = "";
        nameList = "";
        for(int i = 0; i < students.size(); i++){
            firstName = students.get(i).getStudentFirst();
            lastName = students.get(i).getStudentLast();
            nameList += firstName + " " + lastName + "\n";
        }
        return nameList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }
}