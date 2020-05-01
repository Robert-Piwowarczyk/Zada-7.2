public class Student extends Person {
    private Grade[] grades = new Grade[50];
    private int gradeCalculator;

    public Student(String firstName, String lastName, String personNumber,
                   String address) {
        super(firstName, lastName, personNumber, address);
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    public int getGradeCalculator() {
        return gradeCalculator;
    }

    public void setGradeCalculator(int gradeCalculator) {
        this.gradeCalculator = gradeCalculator;
    }

    void addGrade(Grade grade) {
        grades[gradeCalculator] = grade;
        gradeCalculator++;
    }

    private String gradeHistory() {
        String history = "Oceny z przedmiotów:";
        for (int c = 0; c < gradeCalculator; c++) {
            history += grades[c].getGroup().getSubject()
                    + " " + grades[c].getRating()
                    + "\n";
        }
        return history;
    }
}


