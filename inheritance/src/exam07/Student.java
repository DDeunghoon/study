package exam07;

public class Student extends People {

    public String studentNum;

    @Override
    public String toString() {
        return "exam07.Student{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", studentNum='" + studentNum + '\'' +
                '}';
    }

    public Student(String name, String ssn, String studentNum) {
        super(name, ssn);
        this.studentNum = studentNum;
    }
}
