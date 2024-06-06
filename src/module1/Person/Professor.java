package module1.Person;

public class Professor extends Person{
    protected String facultyID;
    protected String department;

    public Professor() {
    }

    public Professor(String facultyID, String department) {
        this.facultyID = facultyID;
        this.department = department;
    }

    public Professor(String firstName, String lastName, int age, String facultyID, String department) {
        super(firstName, lastName, age);
        this.facultyID = facultyID;
        this.department = department;
    }

    public String getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(String facultyID) {
        if (facultyID.isEmpty()){
            System.out.println("The faculty ID cannot be empty!");
        }
        else
            this.facultyID = facultyID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department.isEmpty()){
            System.out.println("The department cannot be empty!");
        }
        else
            this.department = department;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "facultyID='" + facultyID + '\'' +
                ", department='" + department + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
