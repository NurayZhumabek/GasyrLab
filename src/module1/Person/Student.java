package module1.Person;

public class Student extends Person{
    protected String studentID;
    protected String major;

    public Student() {
    }

    public Student(String studentID, String major) {
        this.studentID = studentID;
        this.major = major;
    }

    public Student(String firstName, String lastName, int age, String studentID, String major) {
        super(firstName, lastName, age);
        this.studentID = studentID;
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        if (studentID.isEmpty()){
            System.out.println("The student ID cannot be empty!");
        }
        else
            this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major.isEmpty()){
            System.out.println("The major cannot be empty!");
        }
        else
            this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", major='" + major + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
