package course.management;

public class Course {
    private int id;
    private String name;
    private double fees;

    public Course(int id, String name, double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Fees: " + fees;
    }
}

