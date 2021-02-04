public class Subject {
    private String subjectName;
    private String subjectCode;
    private Student[] studentList = new Student[10];
    private int totalStudents;

    public Subject(String subjectName, String subjectCode) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public String getSubjectCode() {
        return this.subjectCode;
    }

    public void enrollStudent(Student xStudent) {
        if (totalStudents < 10) {
            this.studentList[totalStudents] = xStudent;
            this.totalStudents++;
        }
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void printStudents() {
        for (int i=0; i<totalStudents; i++) {
            System.out.println("Student: " + studentList[i].getName() + "\tStudent No: " + studentList[i].getStudentNumber() + "\tStudent Contact: " + studentList[i].getContact());
        }
    }

    public Student getStudent(int xNumber) {
        for (int i=0; i < totalStudents; i++) {
            if (xNumber == studentList[i].getStudentNumber()) {
                return studentList[i];
            }
        }
        return null;
    }


}
