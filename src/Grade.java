public class Grade {
    private Student student;
    private StudyGroup group;
    private int rating;

    public Grade(Student student, StudyGroup group, int rating) {
        this.student = student;
        this.group = group;
        this.rating = rating;
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudyGroup getGroup() {
        return group;
    }

    public void setGroup(StudyGroup group) {
        this.group = group;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

