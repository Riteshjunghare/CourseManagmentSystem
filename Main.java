package course.management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CourseService service = new CourseService();

        while (true) {
            System.out.println("\n1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Update Course Fees");
            System.out.println("4. Delete Course");
            System.out.println("5. Search Course");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Fees: ");
                    double fees = sc.nextDouble();
                    service.addCourse(new Course(id, name, fees));
                    break;

                case 2:
                    service.viewCourses();
                    break;

                case 3:
                    System.out.print("Enter Course ID: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter New Fees: ");
                    double newFees = sc.nextDouble();
                    service.updateCourse(updateId, newFees);
                    break;

                case 4:
                    System.out.print("Enter Course ID: ");
                    int deleteId = sc.nextInt();
                    service.deleteCourse(deleteId);
                    break;

                case 5:
                    System.out.print("Enter Course ID: ");
                    int searchId = sc.nextInt();
                    service.searchCourse(searchId);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
