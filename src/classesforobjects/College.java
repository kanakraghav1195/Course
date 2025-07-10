package src.classesforobjects;

public class College {
    String collegeName;
    String location;
    int establishedYear;
    int numberOfStudents;
    int numberOfDepartments;

    public void informationRegardingCollege(){
        System.out.println("College name: " + collegeName);
        System.out.println("College Location: " + location);
        System.out.println("Established year: " + establishedYear);
        System.out.println("No of Students in college: " + numberOfStudents);
        System.out.println("Departments in college: " + numberOfDepartments);
    }
}
