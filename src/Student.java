

public class Student {
    private int rating;
    private String name;
    public static int studentsCount;
    public static double totalRating;
    public static double averageStaticRating;


    public Student(String name) {
        this.name = name;
        studentsCount++;
    }

    public static double getAvgRating() {
        if (studentsCount != 0) {
            averageStaticRating = (totalRating / studentsCount);
        }
        return averageStaticRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public int setRating(int rating) {
        this.rating = rating;
        totalRating += this.rating;
        return rating;
    }

    public boolean betterStudent(Student student) {
        if (this.rating > student.rating) {
            return true;
        } else {
            return false;
        }
    }

    public void changeRating(int rating) {
        totalRating -= this.rating;
        this.rating = setRating(rating);
    }

    public static void removeStudent(Student student) {
        studentsCount = 0;
        student.rating = 0;
        totalRating = 0;
        averageStaticRating = 0;
    }

    @Override
    public String toString() {
        return name + " " + rating;
    }
}