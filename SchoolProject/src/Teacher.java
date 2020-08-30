//contains each teacher's first name, last name, and subject
public class Teacher {
    private String teacherFirst;
    private String teacherLast;
    private String subject;

    //creates a new teacher with a first name, last name, and subject
    Teacher(String teacherFirst, String teacherLast, String subject){
        this.teacherFirst = teacherFirst;
        this.teacherLast = teacherLast;
        this.subject = subject;
    }

    //returns the teacher's full name and subject when the object is printed
    public String toString(){
        return "Name: " + this.teacherFirst + " " + this.teacherLast + "\t Subject: " + this.subject;
    }

    public String getTeacherFirst() {
        return teacherFirst;
    }

    public void setTeacherFirst(String teacherFirst) {
        this.teacherFirst = teacherFirst;
    }

    public String getTeacherLast() {
        return teacherLast;
    }

    public void setTeacherLast(String teacherLast) {
        this.teacherLast = teacherLast;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
