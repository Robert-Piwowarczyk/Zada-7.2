import javax.swing.*;

public class college {
    public static void main(String[] args) {
        Coach coach1 = new Coach("Stefan", "Batory",
                "1357902468", "Floriańska 13,Kraków");
        Student student1 = new Student("Grzegorz", "Brzenczyszczykiewicz",
                "2468013579", "Piastowska 8, Poznań");
        Student student2 = new Student("Jola", "Lojalna",
                "1470258136", "Grabiszyńska 22," +
                " Wrocław");

        StudyGroup group1 = new StudyGroup(coach1, 4, "Programowanie Rubby");
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.groupInfo();

        Coach coach2 = new Coach("Zygmunt", "Waza",
                "3456789012", "Wawelska 1, Kraków");
        StudyGroup group2 = new StudyGroup(coach2, 5, "Programowanie PHP");
        group2.addStudent(student2);

        Grade grade1 = new Grade(student1, group1, 5);
        Grade grade2 = new Grade(student1, group2, 4);
        student1.addGrade(grade1);
        student1.addGrade(grade2);

        System.out.println("Historia ocen studenta: " + student1.getFirstName() + " " +
                student1.getLastName() + " \n" + "Programowanie Rubby, ocena: "
                + grade1.getRating() + "\n" + "Programowanie PHP, ocena: " + grade2.getRating());

    }
}
