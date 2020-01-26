import Model.Course;
import Model.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StudentTest {
    @Test
    void enrollCourse(){
        Course aCourse = new Course(1,123,"Math","Algebra",3);
        Student aStudent = new Student(1,"Eric");
        aStudent.enrollCourse(aCourse);
        assertEquals(1,aStudent.getEnrolledCourses().size());
    }

    @Test

    void setGradeTest1(){
        Course aCourse = new Course(1,234,"English","Descriptive Writing",3);
        Student aStudent = new Student(2,"Kevin");
        aStudent.enrollCourse(aCourse);
        aStudent.setGrades(aCourse,.90);
        assertEquals(1,aStudent.getEnrolledCourses().size());
    }

    @Test

    void setGradeTest2(){
        Course aCourse = new Course(4,334,"History","1930 US History",3);
        Student aStudent = new Student(4,"Vicky");
        aStudent.setGrades(aCourse,.75);
        assertEquals(0,aStudent.getEnrolledCourses().size());
    }

    @Test

    void calculateGPATest(){
        Course aCourse = new Course(1,434,"Biology","Beginning Level",3);
        Course aCourse2 = new Course(2,534,"Chemistry","Master the Periodic Table",3);
        Course aCourse3 = new Course(3,634,"Accounting","Master Excel and Balance sheets",3);
        Student aStudent = new Student(5, "Roger");
        aStudent.enrollCourse(aCourse);
        aStudent.enrollCourse(aCourse2);
        aStudent.enrollCourse(aCourse3);
        aStudent.setGrades(aCourse,3.0);
        aStudent.setGrades(aCourse2,3.0);
        aStudent.setGrades(aCourse3,3.0);
        assertEquals(3,aStudent.calculateGPA());

    }




}
