package test.java.me.rezaul;

import main.java.me.rezaul.Course;
import main.java.me.rezaul.CourseRegistration;
import main.java.me.rezaul.CourseType;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AKM Rezaul Alam on 6/20/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
public class CourseRegistrationTest {

    @Test
    public void canRegisterAI() {

        CourseRegistration registration = new CourseRegistration();
        registration.addCredit(10);
        registration.assignCgpa(4);

        Course course = registration.registerCourse(CourseType.ArtificialIntelligence);

        Assert.assertEquals(CourseType.ArtificialIntelligence, course.getCourseType());
        Assert.assertEquals(4, course.getCredit());
        Assert.assertEquals(3.5, course.getCgpa(), 0);
    }

    @Test
    public void registeringAIDeductCredit() {

        CourseRegistration registration = new CourseRegistration();
        registration.addCredit(10);
        registration.assignCgpa(4);

        Course course = registration.registerCourse(CourseType.ArtificialIntelligence);

        Assert.assertEquals(6, registration.getStudentCredit());

    }

    @Test(expected = IllegalStateException.class)
    public void  studentRequireCredit() {

        CourseRegistration registration = new CourseRegistration();
        registration.addCredit(2);

        registration.registerCourse(CourseType.ArtificialIntelligence);

    }
}
