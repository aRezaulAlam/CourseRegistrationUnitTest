package main.java.me.rezaul;

/**
 * Created by AKM Rezaul Alam on 6/20/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
public class Course {

    private final CourseType courseType;
    private final int credit;
    private final double cgpa;

    public Course(CourseType courseType, int credit, double cgpa) {
        this.courseType = courseType;
        this.credit = credit;
        this.cgpa = cgpa;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public int getCredit() {
        return credit;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseType=" + courseType +
                ", credit=" + credit +
                ", cgpa=" + cgpa +
                '}';
    }
}
