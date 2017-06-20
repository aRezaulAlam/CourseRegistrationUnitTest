package main.java.me.rezaul;

/**
 * Created by AKM Rezaul Alam on 6/20/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
public class CourseRegistration {

    private int studentCredit = 0;
    private double studentCgpa = 0;

    public Course registerCourse(CourseType courseType) {

        int creditRequired = courseType.getRequiredCredit();
        double cgpaRequired = courseType.getRequiredCgpa();

        if (creditRequired > studentCredit || cgpaRequired > studentCgpa) {
            throw new IllegalStateException("You don't have enough studentCredit or studentCgpa to register this course");
        }

        studentCredit -= creditRequired;

        return new Course(courseType, creditRequired, cgpaRequired);
    }

    public void addCredit(int credit) {
        this.studentCredit += credit;
    }

    public void assignCgpa(double cgpa) {
        this.studentCgpa = cgpa;
    }

    public int getStudentCredit() {
        return studentCredit;
    }

    public void setStudentCredit(int studentCredit) {
        this.studentCredit = studentCredit;
    }

    public double getStudentCgpa() {
        return studentCgpa;
    }

    public void setStudentCgpa(double studentCgpa) {
        this.studentCgpa = studentCgpa;
    }
}
