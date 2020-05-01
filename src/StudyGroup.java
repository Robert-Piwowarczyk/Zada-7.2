public class StudyGroup {
    private Coach coach;
    private Student[] students;
    private int calculator = 0;
    private String subject;

    public StudyGroup(Coach coach, int size, String subject) {
        this.coach = coach;
        students = new Student[size];
        this.subject = subject;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCalculator() {
        return calculator;
    }

    public void setCalculator(int calculator) {
        this.calculator = calculator;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void addStudent(Student student) {
        if (calculator < students.length) {
            students[calculator] = student;
            calculator++;
        } else {
            System.out.println("Klasa zapełniona");
        }
    }

    void groupInfo() {
        System.out.println("Trener: " + coach.getInfo());
        System.out.println("Studenci w danej grupie: ");
        for (int c = 0; c < calculator; c++) {
            System.out.println(students[c].getInfo());
        }
    }
}

