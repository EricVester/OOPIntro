package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    int id;
    String name;
    HashMap<Integer, Double> grades;
    List<Course> enrollCourses;

    public Student(int id,String name) {
        this.id = id;
        this.name= name;
        this.enrollCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void displayCourses(){
        for (int i = 0; i < enrollCourses.size() ; i++) {
            System.out.println(name + " is in "+enrollCourses.get(i).getName()+ " which includes "+ enrollCourses.get(i).getDescription() +" which is "+ enrollCourses.get(i).getCredit() + " Credit Hours and the code for the class is " + enrollCourses.get(i).getCode() + " and finally the ID of the class is "+ enrollCourses.get(i).getId() );
        }
    }

    public double calculateGPA(){
        double averageGrades = 0;

        for (int x = 1; x <grades.size() ; x++) {
            averageGrades =  (grades.get(x) * enrollCourses.get(x).getCredit()) + averageGrades;
        }

        averageGrades /= grades.size();

        double GPA = averageGrades/enrollCourses.size()+1; ;

        return GPA;
    }

    public void enrollCourse(Course course){

        enrollCourses.add(course);
    }

    public boolean setGrades(Course course, double grade){
        if(enrollCourses.contains(course)){
            grades.put(course.getId(),grade);
            return true;
        }
        return false;
    }

    public List<Course> getEnrolledCourses(){
        return enrollCourses;
    }

    public static void main(String[] args) {
        Course aCourse = new Course(1,123,"Math","Algebra",3);
        Course aCourse2 = new Course(2,534,"Chemistry","Mastering the Periodic Table",3);
        Course aCourse3 = new Course(3,634,"Accounting","Mastering Excel and Balance sheets",3);
        Student aStudent = new Student(1,"Eric");
        aStudent.enrollCourse(aCourse);
        aStudent.enrollCourse(aCourse2);
        aStudent.enrollCourse(aCourse3);
        aStudent.displayCourses();

    }





}
