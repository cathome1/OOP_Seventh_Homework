package dto;

public class Student extends User implements Comparable<Student> {
    private String department;
    private int course;
    private int age;
    private int groupNumber;

    public Student(String fio, String department, int course, int age, int groupNumber) {
        this(fio);
        this.course = course;
        this.department = department;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    public Student(String fio) {
        super(fio);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Student{ " +
                (getFio() != null ? "firstName=" + getFio() + " " : "") +
                (department != null ? "department=" + department + " " : "") +
                (course != 0 ? "course=" + course + " " : "") +
                (age != 0 ? "age=" + age + " " : "") +
                (groupNumber != 0 ? "groupNumber=" + groupNumber + " " : "") +
                '}';
    }
}
