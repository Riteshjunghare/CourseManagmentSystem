package course.management;

import java.util.ArrayList;

public class CourseService {
    private ArrayList<Course> courseList = new ArrayList<>();

    public void addCourse(Course course) {
        courseList.add(course);
        System.out.println("Course Added Successfully!");
    }

    public void viewCourses() {
        if (courseList.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course c : courseList) {
                System.out.println(c);
            }
        }
    }

    public void updateCourse(int id, double newFees) {
        for (Course c : courseList) {
            if (c.getId() == id) {
                c.setFees(newFees);
                System.out.println("Course Updated Successfully!");
                return;
            }
        }
        System.out.println("Course Not Found!");
    }

    public void deleteCourse(int id) {
        courseList.removeIf(c -> c.getId() == id);
        System.out.println("Course Deleted Successfully!");
    }

    public void searchCourse(int id) {
        for (Course c : courseList) {
            if (c.getId() == id) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Course Not Found!");
    }
}

