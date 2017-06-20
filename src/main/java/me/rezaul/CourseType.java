package main.java.me.rezaul;

/**
 * Created by AKM Rezaul Alam on 6/20/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
public enum CourseType {

    ArtificialIntelligence(4, 3.5),
    Networking(3, 2.5),
    DatabaseSystem(3, 3);

    private final int requiredCredit;
    private final double requiredCgpa;

    CourseType(int requiredCredit, double requiredCgpa) {
        this.requiredCredit = requiredCredit;
        this.requiredCgpa = requiredCgpa;
    }

    public int getRequiredCredit() {
        return requiredCredit;
    }

    public double getRequiredCgpa() {
        return requiredCgpa;
    }
}
