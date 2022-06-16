
public class Student {
    private String name;
    private int absentCount;

    public Student(String nm, int ac) {
        name = nm;
        absentCount = ac;
    }

    public String getName() {
        return name;
    }

    public int getAbsentCount() {
        return absentCount;
    }

    public String toString() {
        return String.format("%-9s", (name + " " + absentCount));
    }
}
